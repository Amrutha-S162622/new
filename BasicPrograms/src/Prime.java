
public class Prime 
{
	public static void main(String[] args) {
		int n;
		for( 
					n = 2;n <= 50;n++) {
			boolean isPrime = true;
			for(int i = 2;i <= n / 2;i++) {
				if(n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(n);
			}
		}
//		if(isPrime) {
//			System.out.println("Prime Number");
//		}else {
//			System.out.println("Not Prime Number");
//		}
	}
}
