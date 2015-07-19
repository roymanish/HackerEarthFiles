package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TrickOfCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        Double output = 0.0;
        for (int i = 0; i < N; i++) {
        	
        	double numOfCards = Double.parseDouble(br.readLine());
        	
        	if(numOfCards < 3)
        		output = 1.0;
        	else if(numOfCards % 3 == 0)
        		output = numOfCards/3;
        	
        	System.out.println(output.intValue());
        }
        
        
	}

}
