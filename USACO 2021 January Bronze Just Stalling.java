import java.util.*;
import java.io.*;
import java.util.Arrays;
public class Q3{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String [] S = s.split(" ");
		int [] a = new int[n];
		int [] b = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = Integer.parseInt(S[i]);
		}
		s = br.readLine();
		S = s.split(" ");
		for(int i = 0;i<n;i++){
			b[i] = Integer.parseInt(S[i]);
		}
		Arrays.sort(a);Arrays.sort(b);
		long total = 1;
		for(int i = n-1;i>=0;i--){
			int index = Arrays.binarySearch(b,a[i]);
			
			if(index<0){
				index = -(index+1);
			}else{
				int temp = b[index];
				for(int j = index;j>=0;j--){
					if(b[j]==temp){
						index--;
					}else{
						break;
					}
				}
				index++;
			}
			total*=(i-index+1);
			
		}
		System.out.println(total);
	}
}
