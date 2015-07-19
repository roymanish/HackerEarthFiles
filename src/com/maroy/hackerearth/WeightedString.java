package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class WeightedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {

			int k = Integer.parseInt(br.readLine());
			String str = br.readLine();
			int count = 0;
			for( int c = 0 ; c < str.length() ; c++ )
			{
				int weight = 0;
				for( int j = i ; j < str.length(); j++ )
				{
					if(weight < k){
						weight += str.charAt(j)-96;
					}
					else{
						break;
					}
				}
				if(weight == k)
						count++;
			}
			System.out.println(count);
		}

	}

}
