// Last updated: 7/9/2026, 10:13:22 AM
class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }
        DisjointSet dsu = new DisjointSet(n);
        int extraEdges = 0;
        for (int[] edge : connections) {
            int u = edge[0];
            int v = edge[1];
            if (!dsu.union(u, v)) {
                extraEdges++;
            }
        }
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (dsu.find(i) == i) {
                components++;
            }
        }
        int needed = components - 1;
        return (extraEdges >= needed) ? needed : -1;
    }
}

class DisjointSet {
    int[] par;
    int[] rank;
    public DisjointSet(int n) {
        par = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }
    }
    public int find(int x) {
        if (par[x] != x) {
            par[x] = find(par[x]);
        }
        return par[x];
    }
    public boolean union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (parA == parB) {
            return false; 
        }

        if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else if (rank[parA] > rank[parB]) {
            par[parB] = parA;
        } else {
            par[parB] = parA;
            rank[parA]++;
        }
        return true;
    }
}