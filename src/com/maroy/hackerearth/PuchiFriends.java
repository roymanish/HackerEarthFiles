package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class PuchiFriends {

	public static void main(String args[] ) throws Exception {
		/*
		 * Read input from stdin and provide input before running*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		int T = Integer.parseInt(line);
		int N1 = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		while(st.hasMoreTokens()){
			
			int N = Integer.parseInt(st.nextToken());
			if(gcd(T,N) != 1){
				count++;
			}
		}
		System.out.println(count);
	}
	
	private static int gcd(int a, int b) {
	    int t;
	    while(b != 0){
	        t = a;
	        a = b;
	        b = t%b;
	    }
	    return a;
	}
}
