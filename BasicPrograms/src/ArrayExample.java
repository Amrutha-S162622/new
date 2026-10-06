import java.util.Scanner;

public class ArrayExample 
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter your array elements");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("--------Array Elements--------");
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
