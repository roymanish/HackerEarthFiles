package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class PandaAndChainReaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		
		for (int i = 0; i < T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			long N = Long.parseLong(st.nextToken());
			long X = Long.parseLong(st.nextToken());
			
			long noOfPart = 1L;
			
			for(long j = 1;j<=(N%1000003);j++){
				
				noOfPart = ((noOfPart % 1000003)*(j % 1000003)*(X % 1000003))%1000003;
			}
			int nop = (int) (noOfPart % 1000003);
			System.out.println(nop);
		}

	}

}
