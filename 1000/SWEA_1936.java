import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		boolean result = true;
		if (a==3 && b==1)
			result = false;
		else if (a==1 && b==3)
			result = true;
		else if (a>b)
			result = true;
		else
			result = false;
		bw.write(result?"A":"B" + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
