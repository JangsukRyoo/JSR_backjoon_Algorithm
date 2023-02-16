package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM {
    public static int[] arr;
    public static boolean[] vis;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
//        #15649 N과 M
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        vis = new boolean[N];
        dfs(N, M, 0);
        System.out.println(sb);

    }

    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!vis[i]) {
                vis[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                vis[i] = false;
            }
        }
    }
}