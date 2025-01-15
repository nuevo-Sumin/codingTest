package codingTest;
import java.util.Scanner;

public class Jsp_practice {
	
	public static void printArray (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void rotation (int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
	}
	
	public static void main(String[] args) {
		//n개의 숫자가 입력되면 n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오!
		// 입력예시)
		// 5
		// 12345
		// 출력예시)
		// 12345
		// 23451
		// 34512
		// 45123
		// 51234
		
		int[] arr = {1, 2, 30, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			printArray(arr);
			rotation(arr);
		}
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt(); // Scanner로 변경 예정
//		int[] arr = new int[n]; // Scanner로 변경
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = input.nextInt();
//		}
		
		/*
		//출력
		for (int k = 0; k < arr.length; k++ ) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			// 자리 바꾸기
	//		int temp = arr[0];
	//		arr[0] = arr[1];
	//		arr[1] = arr[2];
	//		arr[2] = arr[3];
	//		arr[3] = arr[4];
	//		arr[4] = temp;
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
		}
		*/
	}

}
