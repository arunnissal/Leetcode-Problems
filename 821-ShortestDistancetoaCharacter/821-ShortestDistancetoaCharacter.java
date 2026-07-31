// Last updated: 7/31/2026, 11:35:11 AM
1class Solution 
2{
3    public int[] shortestToChar(String s, char c) 
4    {
5        int n = s.length();
6        int arr[] = new int[n];
7        int p1 = 0;
8        int p2 = 0;
9        int prev = -100000; 
10
11        while (p2 < n && p1 < n)
12        {
13            if (s.charAt(p2) == c)
14            {
15                int x = Math.abs(p1 - prev);
16
17                if (p2 - p1 <= x)
18                {
19                    arr[p1] = p2 - p1;
20                }
21                else
22                {
23                    arr[p1] = x;
24                }
25                if (p1 == p2)
26                {
27                    prev = p2;
28                    p2++; 
29                }
30                p1++;
31            }
32            else if (p2 == n - 1) 
33            {
34                arr[p1] = Math.abs(p1 - prev);
35                p1++;
36            }
37            else
38            {
39                p2++;
40            }
41        }
42        return arr;
43    }
44}