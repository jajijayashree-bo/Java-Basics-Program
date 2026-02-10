package squarecheck;

import java.util.Arrays;

class SuareNum {
	static int distSq(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) +
               (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }

    static boolean isSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

        int[] dist = new int[6];
        int i = 0;

        dist[i++] = distSq(p1, p2);
        dist[i++] = distSq(p1, p3);
        dist[i++] = distSq(p1, p4);
        dist[i++] = distSq(p2, p3);
        dist[i++] = distSq(p2, p4);
        dist[i++] = distSq(p3, p4);

        Arrays.sort(dist);
        return dist[0] > 0 &&
               dist[0] == dist[1] &&
               dist[1] == dist[2] &&
               dist[2] == dist[3] &&
               dist[4] == dist[5];
    }

    public static void main(String[] args) {

        int[] p1 = {20, 10};
        int[] p2 = {10, 20};
        int[] p3 = {20, 20};
        int[] p4 = {10, 10};

        if (isSquare(p1, p2, p3, p4)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


