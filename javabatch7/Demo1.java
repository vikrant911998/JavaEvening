package javabatch7;

public class Demo1 {

	public static void main(String[] args) {
		String s = new String("vikrant");
		long t = System.currentTimeMillis();
		
		for(int i=1;i<=100000;i++) {
			s.concat(" singh");
		}
		
		
//		System.out.println(s);
		System.out.println("Time1 : "+(System.currentTimeMillis() - t));
		
		
		StringBuffer sb = new StringBuffer("brian");
		
		long t1 = System.currentTimeMillis();
		
		for(int i=1;i<=100000;i++) {
			sb.append(" singh");
		}
		
		

		System.out.println("Time2 : "+(System.currentTimeMillis() - t1));
//		sb.append(" tracy");
		
//		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("mike");
		sb1.append(" jones");
		
		System.out.println(sb1);
	}

}
