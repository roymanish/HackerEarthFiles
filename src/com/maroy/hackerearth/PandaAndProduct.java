package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 
 */

/**
 * @author MaRoy
 *
 */
public class PandaAndProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        List<Long> list = new ArrayList<Long>();
        while(st.hasMoreTokens()){
        	
        	list.add(Long.parseLong(st.nextToken()));
        }
        
        Collections.sort(list);
        
        System.out.println(list.get(N-1)*list.get(N-2));

	}

}
