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
			String s = br.readLine();
			String y = s.substring(0, 4);
			String m = s.substring(4, 6);
			String d = s.substring(6, 8);
			if (m.compareTo("00") <= 0 || m.compareTo("12") > 0) {
				bw.write(String.format("#%d %d\n", tc, -1));		
				continue;
			}
			String upperM = ""; 
			switch(m) {
			case "01" : case "03" : case "05" : case "07" : case "08" : case "10" : case "12" :
				upperM = "31";
				break;
			case "02" :
				upperM = "28";
				break;
			default :
				upperM = "30";
			}
			if (d.compareTo("00") <= 0 || d.compareTo(upperM) > 0) {
				bw.write(String.format("#%d %d\n", tc, -1));		
				continue;
			}
			bw.write(String.format("#%d %s/%s/%s\n", tc, y, m, d));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
