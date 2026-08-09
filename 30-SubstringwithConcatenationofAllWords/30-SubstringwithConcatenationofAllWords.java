// Last updated: 8/9/2026, 5:13:12 PM
1class Solution {
2
3    public List<Integer> findSubstring(String s, String[] words) {
4
5        List<Integer> result = new ArrayList<>();
6
7        if (s.length() == 0 || words.length == 0) {
8            return result;
9        }
10
11        int wordLength = words[0].length();
12        int wordCount = words.length;
13        int totalLength = wordLength * wordCount;
14
15        if (s.length() < totalLength) {
16            return result;
17        }
18
19        HashMap<String, Integer> required = new HashMap<>();
20
21        for (String word : words) {
22            required.put(
23                word,
24                required.getOrDefault(word, 0) + 1
25            );
26        }
27
28        // Try every possible alignment
29        for (int offset = 0; offset < wordLength; offset++) {
30
31            int left = offset;
32            int right = offset;
33            int count = 0;
34
35            HashMap<String, Integer> window = new HashMap<>();
36
37            while (right + wordLength <= s.length()) {
38
39                String word = s.substring(
40                    right,
41                    right + wordLength
42                );
43
44                right += wordLength;
45
46                // Word doesn't exist
47                if (!required.containsKey(word)) {
48
49                    window.clear();
50
51                    count = 0;
52
53                    left = right;
54
55                    continue;
56                }
57
58                // Add word
59                window.put(
60                    word,
61                    window.getOrDefault(word, 0) + 1
62                );
63
64                count++;
65
66                // Too many copies of this word
67                while (window.get(word) > required.get(word)) {
68
69                    String leftWord = s.substring(
70                        left,
71                        left + wordLength
72                    );
73
74                    window.put(
75                        leftWord,
76                        window.get(leftWord) - 1
77                    );
78
79                    left += wordLength;
80
81                    count--;
82                }
83
84                // Correct number of words
85                if (count == wordCount) {
86
87                    result.add(left);
88
89                    // Move forward to search for next window
90                    String leftWord = s.substring(
91                        left,
92                        left + wordLength
93                    );
94
95                    window.put(
96                        leftWord,
97                        window.get(leftWord) - 1
98                    );
99
100                    left += wordLength;
101
102                    count--;
103                }
104            }
105        }
106
107        return result;
108    }
109}