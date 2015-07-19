package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class DomAndBrienRace {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		
		String[] dom = br.readLine().split(" ");
		String[] brien = br.readLine().split(" ");
		
		int domMax = Math.abs(Integer.parseInt(dom[1])-Integer.parseInt(dom[0]));
		int brienMax = Math.abs(Integer.parseInt(brien[1])-Integer.parseInt(brien[0]));
		
		for (int i = 2; i < N; i++) {
			
			if(Math.abs((Integer.parseInt(dom[i])-Integer.parseInt(dom[i-1]))) > domMax)
				domMax = Math.abs(Integer.parseInt(dom[i])-Integer.parseInt(dom[i-1]));
			
			if(Math.abs((Integer.parseInt(brien[i])-Integer.parseInt(brien[i-1]))) > brienMax)
				brienMax = Math.abs(Integer.parseInt(brien[i])-Integer.parseInt(brien[i-1]));
		}
		
		if(domMax > brienMax){
			System.out.println("Dom");
			System.out.println("\n"+domMax);
		}
		else if(brienMax > domMax){
			System.out.println("Brian");
			System.out.println("\n"+brienMax);
		}
		else
			System.out.println("Tie");
	}
}
