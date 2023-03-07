import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    public static void main(String[] args) {
        int[][] graph = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                graph[i][j] = 0;
            }
        }

        graph[0][1] = 1;
        graph[1][0] = 1;
        graph[1][2] = 1;
        graph[2][1] = 1;
        graph[1][3] = 1;
        graph[3][1] = 1;
        graph[1][4] = 1;
        graph[4][1] = 1;
        graph[2][5] = 1;
        graph[5][2] = 1;
        graph[3][5] = 1;
        graph[5][3] = 1;
        graph[4][6] = 1;
        graph[6][4] = 1;
        graph[3][6] = 1;
        graph[6][3] = 1;

//        int[] A = new int[7];
//        DepthFirstSearch(graph, A, 0);
//        System.out.println("----");
//
//        int[] B = new int[7];
//        Stack<Integer> stack = new Stack<>();
//        DepthFirstSearchbyStack(graph, B, stack, 0);

        int[] C = new int[7];
        Queue<Integer> queue = new LinkedList<>();
        BreadthFirstSearchbyQueue(graph, C, queue, 0);

    }

    private static void BreadthFirstSearchbyQueue(int[][] graph, int[] A, Queue<Integer> queue, int u) {
        queue.offer(u);
        A[u] = 1;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.println(v);
            for (int i = 0; i < A.length; i++) {
                if (graph[v][i] == 1 && A[i] == 0) {
                    queue.offer(i);
                    A[i] = 1;
                }
            }
        }
    }

    static void DepthFirstSearchbyStack(int[][] graph, int[] A, Stack<Integer> stack, int u) {
        stack.push(u);
        A[u] = 1;
        while (!stack.isEmpty()) {
            int v = stack.pop();
            System.out.println(v);
            for (int i = 0; i < A.length; i++) {
                if (graph[v][i] == 1 && A[i] == 0) {
                    stack.push(i);
                    A[i] = 1;
                }
            }
        }
    }


    static void DepthFirstSearch(int[][] graph, int[] A, int u) {
        System.out.println(u);
        A[u] = 1;
        for (int i = 0; i < graph.length; i++) {
            if (graph[u][i] == 1 && A[i] == 0) {
                DepthFirstSearch(graph, A, i);
            }
        }
    }
}
