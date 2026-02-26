package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P25206_너의평점은 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		double sum=0;
		double point=0;
		HashMap<String,Double> map=new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		
		for(int i=0;i<20;i++) {
			st=new StringTokenizer(br.readLine());
			String str=String.valueOf(st.nextToken());
			double getPoint=Double.parseDouble(st.nextToken());
			String grade=String.valueOf(st.nextToken());
			if(grade.equals("P")) continue;
			point+=getPoint;
			sum+= getPoint*map.get(grade);
		}
		System.out.printf("%.6f%n",sum/point);
		
		
	}

}
