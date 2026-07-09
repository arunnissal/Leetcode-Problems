// Last updated: 7/9/2026, 10:13:41 AM
class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxi = 0.0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    maxi = Math.max(maxi, area(points[i], points[j], points[k]));
                }
            }
        }

        return maxi;
    }

    private double area(int[] p1, int[] p2, int[] p3) {
        return Math.abs(
            p1[0] * (p2[1] - p3[1]) +
            p2[0] * (p3[1] - p1[1]) +
            p3[0] * (p1[1] - p2[1])
        ) / 2.0;
    }
}
