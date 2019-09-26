import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		int N = Integer.parseInt(br.readLine());
		while(N-->0)
			bw.write("#");
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();
	}
}
