import java.util.*;
import java.io.*;

public class Q2{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int [n+1];
		int sumarr []= new int [n+1];
		String [] S = br.readLine().split(" ");
		for(int i = 1;i<=n;i++){
			arr[i] = Integer.parseInt(S[i-1]);
			sumarr[i] = sumarr[i-1]+arr[i];
		}
		int count = 0;
		for(int i = 1;i<=n;i++){
			for(int j = i;j<=n;j++){
				int total = sumarr[j]-sumarr[i-1];
				int avg = total/(j-i+1);
				int rem = total%(j-i+1);
				boolean hasavg = false;
				for(int k = i;k<=j;k++){
				    
					if(rem==0&&arr[k]==avg){
					    hasavg=true;
					    break;
					}
				}
				if(hasavg){
				    count++;
				}
			}
		}
		System.out.println(count);
	}
}
