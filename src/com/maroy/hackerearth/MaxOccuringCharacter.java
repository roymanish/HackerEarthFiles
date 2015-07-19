package com.maroy.hackerearth;
import java.util.HashMap;
import java.util.Map;


public class MaxOccuringCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String input = "aaaardmcdkkjurlzxc;AKDSFJ;ASDKFJSDSLDVMLKSDFODGFL;SDFJLSJHDFSXASKJDOAJSKMCXLAKSMDAEQW;EDASDMLAMSXLASDALERSNAC A ASDHALSDAJDSLARANSCX AKSJC";
		input = input.toUpperCase();
		
		String alphaBets = "abcdefghijklmnopqrstuvwxyz";
		
		int countMax = 0;
		String output = "";
		for (Character c : alphaBets.toCharArray()) {
			
			c = Character.toUpperCase(c);
			int count = input.length() - input.replace(String.valueOf(c), "").length();
			
			if(count > countMax){
				countMax = count;
				output = String.valueOf(c);
			}
			
			if(input.replace(String.valueOf(c), "").length() < 1)
				break;
		}
		System.out.println(output+" : "+countMax);

	}

}
