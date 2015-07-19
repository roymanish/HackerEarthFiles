package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class FindingDinasaur {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st1 = new StringTokenizer(line);
        int N = Integer.parseInt(st1.nextToken());
        int  K = Integer.parseInt(st1.nextToken());
        int L = Integer.parseInt(st1.nextToken());
        int Q = Integer.parseInt(st1.nextToken());
        Map<String, String> dinoMap = new HashMap<String, String>();
        for (int i = 0; i < N; i++) {
           
        	StringTokenizer st2 = new StringTokenizer(br.readLine());
        	String name = st2.nextToken();
        	String tuples = "";
        	while(st2.hasMoreTokens()){
        		tuples = tuples+" "+st2.nextToken();
        	}
        	dinoMap.put(tuples.trim(), name);
        }
        
        for(int j=0;j<Q;j++){
        	
        	String tuples = br.readLine();
        	
        	String name = dinoMap.get(tuples);
        	
        	if(name != null)
        		System.out.println(name);
        	else
        		System.out.println("You cant fool me :P");
        }

	}

}
