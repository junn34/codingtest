package 자료구조_집합과맵;

import java.util.*;
import java.io.*;
public class P1302_베스트셀러 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		HashMap<String,Integer> map=new HashMap<>();
		
		int max=0;
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			
			map.put(str, map.getOrDefault(str, 0)+1);
			
			if(max<map.get(str)) max=map.get(str);
		}
		
		ArrayList<String> list=new ArrayList<>();
		for(String key:map.keySet()) {
			if(map.get(key)==max) list.add(key);
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
	}
	
	
	
}

/* entry set 사용시 코드
 * package 자료구조_집합과맵;

import java.io.*;
import java.util.*;

public class P1302_베스트셀러 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

        Collections.sort(list, (e1, e2) -> {
            // 1️⃣ 빈도 내림차순
            if (!e1.getValue().equals(e2.getValue())) {
                return e2.getValue() - e1.getValue();
            }
            // 2️⃣ 사전순 오름차순
            return e1.getKey().compareTo(e2.getKey());
        });

        System.out.println(list.get(0).getKey());
    }
}
 
 */
/