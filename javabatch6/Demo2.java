package javabatch6;



public class Demo2 {

	public static void main(String[] args) {
		
		String name = "    Vikrantsingh     ";//String literal Form ->String Pool
		String name1 = new String("Vikrant");//String object Form ->Heap
		
//		System.out.println(name);
//		System.out.println(name1);
		System.out.println(name.charAt(3));
		System.out.println(name.concat(" Bhadauria"));
		System.out.println(name.contains("v"));
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		

	}

}
