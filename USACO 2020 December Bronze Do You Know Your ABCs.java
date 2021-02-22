import java.util.*;
import java.io.*;

public class Q1{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] S = br.readLine().split(" ");
		int [] arr = new int[7];
		for(int i = 0;i<7;i++){
		    arr[i]= Integer.parseInt(S[i]);
		}
		Arrays.sort(arr);
		
		int b=0,c=0;
		int a = arr[0];
		for(int i = 0;i<7;i++){
		    arr[i]-=a;
		}
		int bandc = arr[6];
		for(int i = 0;i<6;i++){
			for(int j = i;j<7;j++){
				if(arr[i]+arr[j]==bandc){
					b=arr[i];
					c=arr[j];
				}
			}
		}
		System.out.println(a+" "+b+" "+c);
	}
}
