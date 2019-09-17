import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			boolean[] chk = new boolean[10001];	// 최대 100점 x 100개
			chk[0] = true;
			int N = Integer.parseInt(br.readLine());			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				for (int k = 10000; k >= 0; k--) {
					if (chk[k] && k+tmp <= 10000)
						chk[k+tmp] = true;
				}
			}
			int cnt = 0;
			for (int i = 0; i <= 10000; i++) {
				if (chk[i])
					cnt++;
			}
			bw.write(String.format("#%d %d\n", tc, cnt));
		}		
		bw.flush();
		bw.close();
		br.close();
	}
}
