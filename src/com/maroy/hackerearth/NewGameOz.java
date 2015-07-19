package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class NewGameOz {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		
		for (int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			
			int[] arr = new int[N];
			
			String[] strArr = br.readLine().split(" ");
			
			int j=0;
			
			for(String s : strArr){
				arr[j] = Integer.parseInt(s);
				j++;
			}
			
			Arrays.sort(arr);
			
			int count = 0;
			int tempCount = (arr[1] == arr[0]+1) ? 0 : 1;
			int startNum = arr[0];
			int endNum = arr[N-1];
			
			if((endNum - startNum + 1) == N)
				count = N/2;
			else{
				for(int k=1; k<N;k++ ){

					if((arr[k] == (arr[k-1])+1)){
						count++;
					}
					else if((k<N-1)&& arr[k] == (arr[k+1]-1)){
						count++;
						k++;
					}
					else
						tempCount++;
				}
			}
			System.out.println(count+tempCount);
		}
	}

}
