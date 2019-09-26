import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		int TC = Integer.parseInt(br.readLine());		
		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());
			String s = String.valueOf(N);
			int cnt = 0;
			boolean[] arr = new boolean[10];
			int remain = 10;
			while (remain > 0) {
				cnt++;
				for (int i = 0; i < s.length(); i++) {
					int tmp = s.charAt(i) - '0';
					if (!arr[tmp]) {
						arr[tmp] = true;
						remain--;
					}
				}
				s = String.valueOf(Integer.parseInt(s) + N);
			}
			bw.write("#" + tc + " " + N*cnt + "\n");
		}		
		bw.flush();
		bw.close();
		br.close();
	}
}
