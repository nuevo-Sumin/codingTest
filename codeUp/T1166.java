package codingTest.codeUp;

import java.util.Scanner;

public class T1166 {

	public static void main(String[] args) {
		/*
		 * 2월이 29일까지 있는 해를 윤년이라고 한다.
		 * 한 자연수를 입력받아서 윤년인지 아닌지를 판단하는 프로그램을 작성하시오.
		 * 단, 윤년은 다음 두 조건 중 하나만 만족하면 된다.
		 * 
		 * (1) 400의 배수이면 무조건 윤년이다. (2) 4의 배수이며, 100의 배수가 아니면 윤년이다.
		 * 예)
		 * 2000 년 ====> 윤년 (1번 조건)
		 * 2004 년 ====> 윤년(2번 조건)
		 * 1900 년 ====> 윤년 아님
		 * 1999 년 ====> 윤년 아님
		 * 
		 * 입력받은 자연수가 윤년이라면 "Leap"를 아니라면 "Normal"을 출력한다.
		 */
		
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		String ckYear = "Normal";
		
		if (year % 400 == 0) {
			ckYear = "Leap";
		} else if (year % 4 == 0 && year % 100 != 0) {
			ckYear = "Leap";
		}
		System.out.println(ckYear);
		
	}

}
