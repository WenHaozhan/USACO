import java.util.*;
import java.io.*;

public class Q3{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] direction = new int[n];
		int [] x = new int[n];
		int [] y= new int [n];
		boolean [] stopped = new boolean[n];
		for(int i = 0;i<n;i++){
			String s = br.readLine();
			String [] S = s.split(" ");
			if(S[0].charAt(0)=='E'){
				direction[i]=1;
			}
			x[i]=Integer.parseInt(S[1]);
			y[i]=Integer.parseInt(S[2]);
		}
		int [] dist = new int[n];
		
		for(int i = 0;i<n;i++){
		    //System.out.println("pass"+i);
		    int cow = -1;
		    int distNext = Integer.MAX_VALUE;
			for(int j = 0;j<n;j++){
				for(int k = 0;k<n;k++){
				    if(direction[j]==direction[k]) continue;
				    int tempX ;
				    if(direction[j]==0){
				        tempX = x[j];
				    }else{
				        tempX=x[k];
				    }
				    int tempY ;
				    if(direction[j]==1){
				        tempY = y[j];
				    }else{
				        tempY = y[k];
				    }
				    int tempcow=-1,tempdist=Integer.MAX_VALUE;
				    int cow1dist = Math.max(tempX-x[j],tempY-y[j]);
				    int cow2dist = Math.max(tempX-x[k],tempY-y[k]);
				    if(tempX-x[j]<0||tempY-y[j]<0||tempX-x[k]<0||tempY-y[k]<0)continue;
				    if((stopped[j]&&cow1dist>dist[j])||(stopped[k]&&cow2dist>dist[k])) continue;
				    
				    
				    if(cow1dist>cow2dist){
				        tempcow = j; tempdist = cow1dist;
				    }else if(cow2dist>cow1dist){
				        tempcow=k;tempdist = cow2dist;
				    }
				    if(tempdist<distNext&&!stopped[tempcow]){
				        cow = tempcow;
				        distNext = tempdist;
				    }
				}
			}
			if(distNext == Integer.MAX_VALUE)break;
			for(int j  =0;j<n;j++){
			    if(!stopped[j]){
			        dist[j]=distNext;
			    }
			}
			//System.out.println("cow"+cow);
			stopped[cow]=true;
		}
		for(int i = 0;i<n;i++){
			if(!stopped[i]){
			    System.out.println("Infinity");
			}else{
			    System.out.println(dist[i]);
			}
		}
	}
}
