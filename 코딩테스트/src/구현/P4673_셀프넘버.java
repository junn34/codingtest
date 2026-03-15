package 구현;

public class P4673_셀프넘버 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] isSelf=new boolean[10001];
		
		for(int i=1;i<=10000;i++) {
			int num=i;
			String numtoStr= String.valueOf(num);
			for(int j=0;j<numtoStr.length();j++) {
				String c=String.valueOf(numtoStr.charAt(j));
				num+=Integer.parseInt(c);
				
			}
			

			if (num <= 10000) {
                isSelf[num] = true;
            }
		}
		for(int i=1;i<=10000;i++) {
			if(isSelf[i]==false) System.out.println(i);
		}
	}

}
