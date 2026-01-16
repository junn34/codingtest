package 자료구조_집합과맵;
import java.io.*;
import java.util.*;
public class P1764_듣보잡 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		HashMap<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			map.put(str,1);
			
		}
		int cnt=0;
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<M;i++) {
			String name=br.readLine();
			if(map.containsKey(name)) {
				cnt++;
				list.add(name);
			}
		}	
		Collections.sort(list);
		
		StringBuilder sb=new StringBuilder();
		sb.append(cnt).append("\n");
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
		//사전 역순 Collections.sort(list, Collections.reverseOrder());
		//길이 짧은순 Collections.sort(list, (a,b) -> a.length() - b.length(); 긴순은 반대로 Integer.compare(a.length()-b.length()) 더 안전
		//길이 짧은순 -> 사전순 Collections.sort(list, (a,b) -> { if(a.length()!=b.length()) { return a.length() -b.length()} else return a.compareTo(b)
						
		//
		
	}

}
