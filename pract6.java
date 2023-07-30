import java.util.*;
import java.io.*;

class Main{

	public static void main(String args [])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String all = br.readLine();
		StringTokenizer st = new StringTokenizer(all,",");
	
		int count = st.countTokens();
		System.out.println(count);

		System.out.println(st.hasMoreTokens());

		String name = st.nextToken();
		String grp = st.nextToken();
		char grp1 = grp.charAt(0);

		int joursy = Integer.parseInt(st.nextToken());
		double strike = Integer.parseInt(st.nextToken());		
	
		//System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());
		System.out.println("name = "+name + " group = "+grp1 +" joursy no ="+ joursy + " strike rate = "+strike );
	}
}
