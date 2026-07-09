// Last updated: 7/9/2026, 10:14:41 AM
class Solution {
    private boolean dfs(int i,List<List<Integer>> adj,HashSet<Integer> set,boolean[] visited)
    {
        set.add(i);
        visited[i] = true;
        for(int num:adj.get(i))
        {
            if(!visited[num] && !dfs(num,adj,set,visited)) return false;
            else if(set.contains(num)) return false;
        }
        set.remove(i);
        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        adj.add(new ArrayList<>());

        for(int[] edge:prerequisites)
        adj.get(edge[1]).add(edge[0]);

        boolean acyclic = true;
        boolean[] visited = new boolean[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(!visited[i])
            {
                HashSet<Integer> set = new HashSet<>();
                acyclic = dfs(i,adj,set,visited);
                if(!acyclic) return false;
            }
        }
        return true;       
    }
}