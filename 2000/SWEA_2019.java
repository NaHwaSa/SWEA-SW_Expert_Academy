import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		int N = Integer.parseInt(br.readLine());
		int base = 1;
		for (int i = 0; i <= N; i++) {
			bw.write(base + " ");
			base *= 2;
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
