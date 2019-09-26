import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		bw.write(fact(Integer.parseInt(br.readLine())) + "\n") ;
		bw.flush();
		bw.close();
		br.close();
	}

	private static int fact(int n) {
		if (n==1)
			return n;
		return n+fact(n-1);
	}
}
