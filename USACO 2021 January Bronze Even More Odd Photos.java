import java.util.*;
import java.io.*;

public class Q2{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String [] S = s.split(" ");
		int odd = 0;
		int even = 0;
		int total = 0;
		for(int i = 0;i<S.length;i++){
			int temp = Integer.parseInt(S[i]);
			if(temp%2==1){
				odd++;
			}else{
				even++;
			}
		}
		if(odd>=even){
			total+= 2*even;
			odd-=even;
			total += (odd/3)*2;
			odd = odd%3;
			if(odd==2){
				total++;
			}
			if(odd==1){
				total--;
			}
		}else{
			total = odd*2;
			total ++;
		}
		
		System.out.println(total);
		
	}
}
