import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int N = Integer.parseInt(br.readLine());
			for (int i = 1; i <= N; i++) {
				int sum = 0;
				StringTokenizer st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					int in = Integer.parseInt(st.nextToken());
					sum += (in&1)==1?in:0;
				}
				bw.write(String.format("#%d %d\n", i, sum));
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (Exception e) {}
	}
}
