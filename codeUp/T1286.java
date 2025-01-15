package codingTest.codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class T1286 {

	public static void main(String[] args) {
		/* 5개의 정수들의 최댓값과 최솟값을 구하는 프로그램을 작성하라. 
		 * 5개의 정수가 한 줄에 하나씩 입력된다.
		 * 첫째줄에 최댓값을 출력한다. 둘째줄에 최솟값을 출력한다.
		- 스캐너 사용해서 입력 받기
		- 최대값과 최소값 구하는 방법
		- math 함수? - 두개를 비교하는 거라서 안됨
		- 배열에 넣기? : arrays 정렬하는거 있었음
		- if 문? 각각 비교 기초 : 세개 다 해보기
		
		 * */
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		//1. if 문
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextInt();
		}
//		int max = -1000000; 주어진 범위 중 최소값
//		int min = 1000000; 주어진 범위 중 최대값
//		for (int i = 0; i < 5; i++) {
//			if (i < min) {
//				min = i;
//			}
	//		if (i > min) {
	//			max = i;
	//		}
//		
//		}
//		
//		System.out.println(max);
//		System.out.println(min);
		//2. 배열
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
		System.out.println(arr[0]);

	}

}
