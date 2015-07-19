package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 
 */

/**
 * @author MaRoy
 *
 */
public class ShilAndBirthday {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		StringTokenizer st = new StringTokenizer(br.readLine());

		List<Integer> list = new ArrayList<Integer>();
		while(st.hasMoreTokens()){

			list.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(list);
		
		Set<Integer> aSet = new HashSet<Integer>(list);
		list = new ArrayList<>(aSet);
		
		double totNoOfWays = 0;
		for(double i = list.size()-1;i>1;i--){
			
			totNoOfWays = totNoOfWays + i;
			
		}
		totNoOfWays = totNoOfWays + 1;
		
		System.out.println((int)totNoOfWays);
	}

}
