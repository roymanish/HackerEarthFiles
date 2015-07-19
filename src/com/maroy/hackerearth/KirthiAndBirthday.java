package com.maroy.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 
 */

/**
 * @author MaRoy
 *
 */
public class KirthiAndBirthday {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		Integer i = 1;
		Map<String, String> stringMap = new HashMap<String, String>();

		while(i<=N){

			String str = br.readLine();

			String pos = stringMap.get(str);
			String newPos = (pos==null ? i.toString() : (pos+"~"+i));
			stringMap.put(str, newPos);
			i++;
		}

		int Q = Integer.parseInt(br.readLine());
		i=1;

		while(i<=Q){

			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			String str1 = st.nextToken();

			String posStr = stringMap.get(str1);

			int count = 0;

			if(posStr != null){
				String[] posArray = posStr.split("~");



				for(String pos : posArray){

					if((Integer.parseInt(pos) >= start) && (Integer.parseInt(pos) <= end))
						count++;
				}
			}
			System.out.println(count);
			i++;
		}

	}

}
