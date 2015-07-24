/**
 * 
 */
package com.maroy.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MaRoy
 *
 */
public class PalinPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		Map<String,Integer> strFreq = new HashMap<String,Integer>();
		int palinPairCnt = 0;
		for (int j = 0; j < N; j++) {
			StringBuilder sb = new StringBuilder(br.readLine());
			strFreq.put(sb.toString(), 1);
			if(strFreq.get(sb.reverse().toString()) != null){
				palinPairCnt++;
			}
		}
		
		System.out.println(palinPairCnt);
	}

}
