package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 */

/**
 * @author MaRoy
 *
 */
public class UrbanLadderArmagadon {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        
        for(int i=1;i<=T;i++){
        	
        	StringTokenizer st1 = new StringTokenizer(br.readLine());
        	String str = st1.nextToken();
        	StringBuilder sb = new StringBuilder();
        	int count = 0;
        	
        	for(int j=0;j<str.length();j++){
        		
        		for(int k=j+1;k<=str.length();k++){
        			
        			for(int l = 0;l<=str.length()-k;l++){
        				
        				sb = sb.append(str.charAt(j));
            			sb = sb.append(str.substring(k,k+l));
            			System.out.println(sb.toString());
            			if((Integer.parseInt(sb.toString()) % 6) == 0){
            				count++;
            			}
            			sb.setLength(0);
        			}
        		}
        	}
        	System.out.println(count);
        }
	}

}
