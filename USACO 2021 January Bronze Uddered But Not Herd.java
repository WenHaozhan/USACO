import java.util.*;
import java.io.*;

public class Q1{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int [] location = new int[26];
		for(int i = 0;i<s.length();i++){
			location[s.charAt(i)-'a'] =i;
		}
		s = br.readLine();
		int count = 1; int loc =location[s.charAt(0)-'a'];
		for(int i = 1;i<s.length();i++){
			if(location[s.charAt(i)-'a']>loc){
				loc = location[s.charAt(i)-'a'];
			}else{
				loc = location[s.charAt(i)-'a'];
				count++;
			}
		}
		System.out.println(count);
	}
}
