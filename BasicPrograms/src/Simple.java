
public class Simple {
	public static void main(String args[]) {
//		System.out.println("Hello");
//		
//		byte age = 20;
//		System.out.println(age);
//		char ch = 'a';
//		boolean value = true;
//		byte a = 10;
//		byte b = 20;
//		System.out.println("Addition:" + (10 + 20));
//		
//		System.out.println("Hello " + "World");
		
//		byte a = 5;  //0101
//		byte b = 3;  //0011
//		
//		//a & b 
//		System.out.println(a & b);
//		System.out.println(a | b);
//		
//		byte c = 10;
//		System.out.println(c);
//		System.out.println(++c);
//		System.out.println(c);
//		System.out.println(c++);
//		System.out.println(c);
		
//		int a = 10;
//		int b = 20;
//		int c = ( a > b) ? a : b;
//		System.out.println(c);
		
		
		//with temp variable
//		int c = a;
//		a = b;
//		b = c;
//		System.out.println(a);
//		System.out.println(b);
		
		//with out
//		b = a + b;
//		a = b - a;
//		b = b - a;
		
		int a = 10;
		int b = 20;
		int c = 30;
		if((a > b) && (a > c)) {
			System.out.println("a is g");
		}else if(b > c) {
			System.out.println("b g ");
		}else {
			System.out.println("c is g");
		}
		
		String color = "green";
		switch(color) {  
			case "red":
				System.out.println("Red");
				
			case "green":
				System.out.println("yellow");
			
			case "yellow":
				System.out.println("green");
				
			default:
				System.out.println("no choice");
		}
		
		
		
		
	}
}
