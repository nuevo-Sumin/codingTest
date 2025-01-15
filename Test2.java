package codingTest;

public class Test2 {

	public static void main(String[] args) {
		//1 ~ 10까지 합(sum) 계산후 출력 
		//sum: xx
		int i = 1;
		int sum = 0; // alt+shift+r => esc
//		sum = 0 + 1;
//		sum = 1 + 2;
//		sum = 3 + 3;
//		sum = 6 + 4;
//		sum = 10 + 5;
		
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
		for (; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("for문 sum: " + sum);
		
		i = 1;
		sum = 0;
		
		while (i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println("while문 sum: " + sum);
		
		//1~100 짝수의 합(even), 홀수의 합(odd) 계산 후 출력
		// 출력형식) "1~100까지의 짝수의 합: XX"
		// 출력형식) "1~100까지의 홀수의 합: XX"
		int even =  0;
		int odd = 0;
		i = 1;
		sum = 0;
		for (; i <= 100; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
			
			sum += i;
		}
		System.out.println("for문 1~100까지의 짝수의 합: " + even);	
		System.out.println("for문 1~100까지의 홀수의 합: " + odd);	
//		System.out.println(total - evenTotal == oddTotal);
		
		even = 0;
		odd = 0;
		i = 1;
		
		while (i <= 100) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
			i++;
		}
		System.out.println("while문 1~100까지의 짝수의 합: " + even);	
		System.out.println("while문 1~100까지의 홀수의 합: " + odd);	
		
		//7의 갯수를 출력
		//ex) int n = 247427723;
		//	출력결과: 3
		// -------------------------------
//		[설명]
//		int n = 273;
//		
//		int i = 10;
//		
//		i = i * 10; // i: 100
//		i = i * 10; // i: 1000
//		i *= 10;
//		
//		System.out.println(n / 10); // 두자리일때 
//		System.out.println(n / 100); // 세자리일때
//		System.out.println(n / 1000); // 네자리일때
		
//		int count = 0;
//		int num = n / 100;
//		if (num == 7) {
//			count++;
//		}
		// ----------------------------------------
		// int n = 247427723;
		// 뒤에서 부터 한자리씩
		
//		int n = 274;
//		
//		int count = 0;
//		int num = n % 10;
//		if (num == 7) {
//			count++;
//		}
//		n /= 10;	// n값을 27로 바꾸는 작업 
//		
//		num = n % 10;
//		if (num == 7) {
//			count++;
//		}
//		n /= 10;
		
		
		// -------------------------------
//		[풀이]
//		int n = 274772323;
//		
//		int count = 0;
//		while (n != 0) {
//			if ((n % 10) == 7) count++;
//			n /= 10;
//		}
//		System.out.println(count);
		// -------------------------------
		int n = 247427723;
		int count = 0;
		
//		2474의 끝자리수 		= 2474 나머지 10 하면 나옴 
//		2474의 두번째 자리수 	= 247 나머지 10 하면 나옴
//		2474의 세번째 자리수 	= 24 나머지 10 하면 나옴
//		2474의 첫자리수 		= 2 나머지 10 하면 나옴
//		
//		자리수의 값 =  나머지 10 (n % 10)
//		
//		=> 2474 나누기 10한 것의 몫 n / 10  
//		=> 247  나누기 10한 것의 몫 (n / 10) / 10
//		=> 24 	나누기 10한 것의 몫 ((n / 10) / 10 ) / 10
//		=> 2 	
//		n = n / 10 ==> n /= 10 
		
//		for(i = 0; i < 10; i++) { // i가 10자리 수인걸 어떻게 알까? long형이라면? 
//			int number = n % 10; // number를 굳이 적지 않고 n% 10을 적을 수 있지 않을까?
//			if (number == 7) {
//				count++;
//			}
//			n = n / 10;		
//		}
//		
//		System.out.println(count);
		

		while (true) { //true대신 두번째 if문의 조건을 반대로 넣어도 된다. (n != 0) 
			if (n % 10 == 7) {
				count++;	
			}
			n /= 10;
			if (n == 0) {
				break;
			}
		}
		System.out.println("7의 갯수: " + count);
	}

}
