import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		String s = br.readLine();
		int sum = 0;
		for (int i = 0; i < s.length(); i++)
			sum += (s.charAt(i) - '0');
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
