package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1541_잃어버린괄호 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		String[] arr=str.split("-");
		int sum=0;
		int minus=0;
		for(int i=0;i<arr.length;i++) {
			
			if(i==0) {
				if(arr[i].contains("+")) {
					String[] arr2=arr[i].split("\\+");
					for(int j=0;j<arr2.length;j++) {
						sum+=Integer.parseInt(arr2[j]);
					}
				}
				else{
					sum+=Integer.parseInt(arr[i]);
				}
			}
			else {
				
				if(arr[i].contains("+")) {
					String[] arr2=arr[i].split("\\+");
					for(int j=0;j<arr2.length;j++) {
						minus+=Integer.parseInt(arr2[j]);
					}
				}
				else{
					minus+=Integer.parseInt(arr[i]);
				}
			}
						
		}
		System.out.println(sum-minus);
	}

}
