import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Base64;
import java.util.Base64.Decoder;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		int TC = Integer.parseInt(br.readLine());		
		for (int tc = 1; tc <= TC; tc++) {
			Decoder dc = Base64.getDecoder();
			bw.write("#" + tc + " " + new String(dc.decode(br.readLine().getBytes())) + "\n");
		}		
		bw.flush();
		bw.close();
		br.close();
	}
}
