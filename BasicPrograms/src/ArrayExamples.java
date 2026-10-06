import java.util.Scanner;

public class ArrayExamples 
{
	public static void main(String[] args) {
//		int[] arr;
//		arr = new int[5];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your size");
		int size = scn.nextInt();
		int[] arr2 = new int[size];
		System.out.println("array size : " + arr2.length);
		
		int[] arr = new int[size];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr[0]);
		System.out.println(arr);
		for(int i = 0;i < size;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//advanced for loops
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println(arr.length);
		
	}
}
