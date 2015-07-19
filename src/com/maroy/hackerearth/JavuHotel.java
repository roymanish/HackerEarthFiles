package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class JavuHotel {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String expertise = br.readLine();
        
        Map<Character,Integer> charFreq = new HashMap<Character,Integer>();
        if (expertise != null) {
          for (Character c : expertise.toCharArray()) {
            Integer count = charFreq.get(c);
            int newCount = (count==null ? 1 : count+1);
            charFreq.put(c, newCount);
          }
        }
        
        int noOfOrders = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<noOfOrders;i++){
        	
        	String order = br.readLine();
        	
        	long perm = 1;
        	
        	for(Character c : order.toCharArray()){
        		
        		if(charFreq.containsKey(c)){
        			int count = charFreq.get(c);

        			perm = perm*count;
        		}
        		else{
        			perm = 0;
        			break;
        		}
        	}
        	
        	if(perm != 0){
        		
        		for(Character c : order.toCharArray()){
            		
            		int count = charFreq.get(c);
            		count = count-1;
            		charFreq.put(c, count);
            		
            	}
        	}
        	System.out.println(perm % (1000000007));
        }
        
	}

}
