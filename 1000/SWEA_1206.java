import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			boolean[][] arr = new boolean[N][256];
			for (int i = 0; i < N; i++) {
				int cur =  Integer.parseInt(st.nextToken());
				for (int k = 1; k <= cur; k++)
					arr[i][k] = true;
			}
			int cnt = 0;
			for (int i = 2; i < N-2; i++) {
				for (int j = 1; j < 256; j++) {
					if (arr[i][j] && !arr[i-2][j] && !arr[i-1][j] && !arr[i+1][j] && !arr[i+2][j])
						cnt++;
				}
			}
			bw.write(String.format("#%d %d\n", tc, cnt));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
