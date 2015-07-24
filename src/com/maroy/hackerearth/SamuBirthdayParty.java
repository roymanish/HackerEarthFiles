package com.maroy.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SamuBirthdayParty {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		
		for(int i = 0; i<T;i++){
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int maxValue = 0;
			int tempK = K-1;
			while(tempK>=0){
				maxValue = (int) (maxValue + Math.pow(2, tempK));
				tempK--;
			}
			int sum = 0;
			for(int j = 0;j<N;j++){
				
				String dishString = br.readLine();
				int decimal = Integer.parseInt(dishString.trim(),2);
				sum = sum+decimal;	
			}
			int diff = maxValue - sum;
			String binary = Integer.toString(diff, 2);
			System.out.println(K-(binary.length()-binary.replace("1", "").length()));
		}
	}

}
