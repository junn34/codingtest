package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P13300_방배정하기 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		HashMap<Integer,Integer> man=new HashMap<>();
		HashMap<Integer,Integer> woman=new HashMap<>();
		for(int i=0;i<N;i++) {
			 st=new StringTokenizer(br.readLine());
			 int S=Integer.parseInt(st.nextToken());
			 int Y=Integer.parseInt(st.nextToken());
			
			 if(S==0) woman.put(Y, woman.getOrDefault(Y, 0)+1);
			 else man.put(Y, man.getOrDefault(Y, 0)+1);
		}
		int sum=0;
		for(int key:man.keySet()) {
			if(man.get(key)%K==0) sum+=man.get(key)/K;
			else sum+=man.get(key)/K+1;
		}
		for(int key:woman.keySet()) {
			if(woman.get(key)%K==0) sum+=woman.get(key)/K;
			else sum+=woman.get(key)/K+1;
		}
		System.out.println(sum);
		
		
	}

}
