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
		for (int t = 1; t <= TC; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("#" + t + " ");
			if (a>b)
				bw.write(">\n");
			else if (a<b)
				bw.write("<\n");
			else
				bw.write("=\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
