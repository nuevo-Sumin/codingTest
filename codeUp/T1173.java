package codingTest.codeUp;

import java.util.Scanner;

public class T1173 {
	
	public static void main(String[] args) {
		/*
		 * 수호는 30분 전으로 돌아가고 싶은 1人 이다.
		 * 공백을 기준으로 시간과 분이 주어진다.
		 * 그러면 이 시간을 기준으로 30분전의 시간을 출력하시오.
		 * 
		 * 예)
		 * 12 35 =====> 12 5
		 * 12 0 ======> 11 30
		 * 11 5 ======> 10 35
		 * 0 10 ======> 23 40
		 * 
		 * 시와 분이 입력된다.( 시의 범위 : 0~ 23)(분의 범위 : 0~ 59)
		 * 입력된 시간의 30분 전의 시간을 출력하시오.
		 */
				
		Scanner input = new Scanner(System.in);
		int hour = input.nextInt();
		int minute = input.nextInt();
		
		int newHour = hour;
		int newMinute = minute - 30;
		
		if (minute < 30) { 
			newMinute += 60;
			newHour--;
			if (newHour < 0 ) {
				newHour += 24;
			}
		}
		
		System.out.println(newHour + " " + newMinute);
	}
}


