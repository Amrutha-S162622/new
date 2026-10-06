
public class Sample 
{
	public static void main(String[] args) {
		int a = 5;//0101
		int b = 30;//0011
//		a = b;
				//      0111
//		int c = a | b;
//		System.out.println(c);
		
//		a+=b;//a = a + b;
//		System.out.println(a);
//		a++;
//		System.out.println(a);
//		a++;
//		System.out.println(a++);//
//		System.out.println(a);
//		
//		System.out.println("==============");
//		
//		System.out.println(++a);
//		System.out.println(a);
		
//		int c = (a < b) ? a : b;//5 > 3
//		System.out.println(c);
//		if(a > b) {
//			System.out.println("a is greater : " + a);
//		}else {
//			System.out.println("b is greater : " + b);
//		}
		
//		int marks = 90;
//		
//		if(marks >= 90) {
//			System.out.println("A+");
//		}else if(marks >= 80) {
//			System.out.println("A");
//		}else if(marks >= 70) {
//			System.out.println("B+");
//		}else if(marks >= 60) {
//			System.out.println("B");
//		}else if(marks >= 50) {
//			System.out.println("C+");
//		}else if(marks >= 40) {
//			System.out.println("C");
//		}else if(marks >= 30) {
//			System.out.println("D+");
//		}else {
//			System.out.println("Fail");
//		}
//		
//		int age = 12;
//		if(marks >= 80) {
//			if((age >= 18) && (age <= 25)){
//				System.out.println("Eligible");
//			}else {
//				System.out.println("Marks satified but age is not valid");
//			}
//		}else {
//			if((age >= 18) && (age <= 25)){
//				System.out.println("Age is satified but mark is not satified");
//			}else {
//				System.out.println("Not Eligible");
//			}
//		}
//		
//		int num = 33;
//		if(num % 2 == 0) {
//			System.out.println("even : " + num);
//		}else {
//			System.out.println("not even : " + num);
//		}
//		
//		if(!(num % 2 == 0)) {
//			System.out.println("Number is odd : " + num);
//		}else {
//			System.out.println("Number is not odd : " + num);
//		}
//		System.out.println("---------------------------");
//		int day = 5;
//		switch(day) {
//			case 1:
//				System.out.println("Sunday");
//				break;
//			case 2:
//				System.out.println("Monday");
//				break;
//			case 3:
//				System.out.println("Tuesday");
//				break;
//			case 4:
//				System.out.println("Wednesday");
//				break;
//			case 5:
//				System.out.println("Thursday");
//				break;
//			case 6:
//				System.out.println("Friday");
//				break;
//			case 7:
//				System.out.println("Saturday");
//				break;
//			default:
//				System.out.println("Invalid choice");
//		}
//		
//		System.out.println("-----------------------");
//		int n = 1;
//		while(n < 11) {//
//			System.out.println(n);
//			n++;
//		}
//		System.out.println("---------------------");
//		for(int i = 1;i < 11;i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("--------------------------");
//		int d = 1;
//		do {
//			System.out.println(d);
//			d++;
//		}while(d < 1);
		
		//sum of 10 numbers
//		int sum = 0;
//		for(int i = 1;i < 21;i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//		
//		//multiplication table
//		//reverse a number
//		int num = 222;
//		int temp = num;
//		int rev = 0;
//		while(num != 0) {//540 + 3
//			rev = rev * 10 + num % 10;
//			num/=10;//
//		}
//		System.out.println(rev);
//		if(temp == rev) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not palindrome");
//		}
//		
//		//prime number
//		int n = 3;
//		boolean prime = true;
//		
//		if(n <= 1) {
//			prime = false;
//		}else {//2,3 <= 17
//			for(int i = 2;i <= n / 2;i++) {
//				if(n % i == 0) {//35 % 3
//					prime = false;
//					break;
//				}
//			}
//		}
//	
//		if(prime) {
//			System.out.println("number is prime");
//		}else {
//			System.out.println("not prime");
//		}
		
		//fibonacci series
		//0 1 1 2 3 5 ........
//		int num = 10;
//		int d = 0,e = 1;//0 
//		for(int i = 1;i <= num;i++) {
//			System.out.print(d + " ");//0 1 1 2 
//			int f = d + e;//3
//			d = e;//2
//			e = f;//3
//		}
		//
		
//		int n = 5;
//		for(int i = 1;i <= n;i++) {//2 <= 5
//			for(int j = 1;j <= i;j++) {//2 <= 2
//				System.out.print("* ");//* 
//									//   * *
//									//   * * *
//			}
//			System.out.println();
//		}
//		
//		System.out.println("------------------");
//		int n1 = 5;
//		for(int i = n1;i >= 1;i--) {//2 <= 5
//			for(int j = 1;j <= i;j++) {//2 <= 2
//				System.out.print("* ");//* 
//									//* *
//			}
//			System.out.println();
//		}
//		
//		System.out.println("------------------");
//		int n2 = 5;
//		for(int i = 1;i <= n2;i++) {//2 <= 5
//			for(int k = 1;k <= n2 - i;k++) {
//				System.out.print("  ");
//			}
//			for(int j = 1;j <= i;j++) {//2 <= 2
//				System.out.print("* ");//* 
//									//* *
//			}
//			System.out.println();
//		}
//		
//		System.out.println("---------------");
//		int n3 = 5;
//		for(int i = 1;i <= n3;i++) {//2 <= 5
//			for(int k = 1;k <= n3 - i;k++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j <= i;j++) {//2 <= 2
//				System.out.print("* ");//* 
//									//* *
//			}
//			System.out.println();
//		}
//		
		int n2 = 5;
		for(int i = 1;i <= n2;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		int n3 = 5;
		for(int i = 1;i <= n3;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
