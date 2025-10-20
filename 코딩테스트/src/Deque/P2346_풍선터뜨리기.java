import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P2346_풍선터뜨리기 {
	static Deque<Balloon> deque = new ArrayDeque<>();
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine().trim());
		st=new StringTokenizer(br.readLine());
		
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<=N;i++) {
			deque.addLast(new Balloon(i,Integer.parseInt(st.nextToken())));
			
		}
		
		
		while(!deque.isEmpty()) {
			if(deque.size()==1) {
				Balloon p=deque.pollFirst();
				sb.append(p.idx+" ");
				break;
			}	
			Balloon p=deque.pollFirst();
			sb.append(p.idx+" ");
			
			if(p.num>0) {
				for(int i=0;i<p.num-1;i++) {
					Balloon k=deque.pollFirst();
					deque.addLast(k);
				}
				
			}
			else {
				for(int i=0;i<-p.num;i++) {
					Balloon k=deque.pollLast();
					deque.addFirst(k);
				}
			}
			
		}
		System.out.println(sb);
		
	}


}
class Balloon {
	public int num;
	public int idx;
	public Balloon(int idx, int num) {
		this.idx=idx;
		this.num=num;
	}
}
