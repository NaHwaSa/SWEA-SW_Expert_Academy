import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++)
			bw.write((s.charAt(i)-'A'+1) + " ");
		bw.flush();
		bw.close();
		br.close();
	}
}
