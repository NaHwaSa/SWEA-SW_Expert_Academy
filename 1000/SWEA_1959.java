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
		for (int tc = 1; tc <= TC; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr1 = new int[Integer.parseInt(st.nextToken())];
			int[] arr2 = new int[Integer.parseInt(st.nextToken())];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < arr1.length; i++)
				arr1[i] = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < arr2.length; i++)
				arr2[i] = Integer.parseInt(st.nextToken());
			if (arr2.length > arr1.length) {
				int[] tmp = arr2;
				arr2 = arr1;
				arr1 = tmp;
			}
			int max = 0;
			for (int i = 0; i <= arr1.length - arr2.length; i++) {
				int sum = 0;
				for (int k = i; k < i + arr2.length; k++) {
					sum += arr2[k-i] * arr1[k];
				}
				max = Math.max(max, sum);
			}
			bw.write("#" + tc + " " + max + "\n");
		}		
		bw.flush();
		bw.close();
		br.close();
	}
}
