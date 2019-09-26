import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		int TC = Integer.parseInt(br.readLine());
		int[] arr = new int[] {2,3,5,7,11};
		for (int tc = 1; tc <= TC; tc++) {
			bw.write("#" + tc + " ");
			int num = Integer.parseInt(br.readLine());
			for (int i = 0; i < 5; i++) {
				int cnt = 0;
				while (num != 1 && num % arr[i] == 0) {
					cnt++;
					num /= arr[i];
				}
				bw.write(cnt + " ");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
