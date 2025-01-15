package codingTest.codeUp;

import java.util.Scanner;

public class T1278 {

	public static void main(String[] args) {
		/*
		 * 어떤 숫자가 입력되면 그 숫자가 몇 자릿수 숫자인지 알아내는 프로그램을 작성하시오.
		 * 
		 * 예) 7 ----> 1 (1자릿수) 10 ----> 2 (2자릿수) 4322 ----> 4 (4자릿수)
		 */
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int i = 0;
		while (n != 0) {
			n /= 10;
			i++;
		}
		
		System.out.println(i);
		
	}

}
