package javabatch22;

public class Demo2 {

	public static void main(String[] args) {
		
		try {
			int a = 10/0;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("Not valid Operation");
		}

	}

}
