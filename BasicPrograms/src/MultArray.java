import java.util.Scanner;

public class MultArray 
{
	public static void main(String[] args) {
		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[1][0] = 30;
//		arr[1][1] = 40;
//		arr[2][0] = 50;
//		arr[2][1] = 60;
		int[][] arr = new int[3][2];
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		Scanner scn = new Scanner(System.in);
		System.out.println("enter array elements : ");
		for(int i = 0;i < 3;i++) {
			System.out.println(i + " th row elements");
			for(int j = 0;j < 2;j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		System.out.println("array elements : ");
		for(int i = 0;i < 3;i++) {//0
			for(int j = 0;j < 2;j++) {//1
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
