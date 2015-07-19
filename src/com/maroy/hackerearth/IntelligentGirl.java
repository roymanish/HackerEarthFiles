package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class IntelligentGirl {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		int numOfEven = 0;
		String output = " ";
		for(int i=line.length()-1;i>=0;i--){

			int num = Integer.parseInt(String.valueOf(line.charAt(i)));
			if(num % 2 == 0){
				numOfEven++;
			}
			output = numOfEven+" "+output;
		}
		
		StringTokenizer st = new StringTokenizer(output);
		
		while(st.hasMoreTokens()){
			
			int num = Integer.parseInt(st.nextToken());
			System.out.print(num+" ");
		}
	}

}
