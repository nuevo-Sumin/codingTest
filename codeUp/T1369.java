package codingTest.codeUp;

import java.util.Scanner;

public class T1369 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//첫줄 끝줄 *표
				if(i == 0 || i == n - 1) {
					System.out.print("*");
					continue;
				}
				//테두리 *표
				if (j == 0 || j == n - 1) {
					System.out.print("*");
					continue;
				}
				if (k == 1) {
					System.out.print("*");
					continue;
				}
				
				//내부 빗금 *표. 해당하지 않는 건 공백
				if((j + i) % k == k - 1) { 
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

				
			}
				
			System.out.println();
		}
		
		/*
		 * 별 모양 도형 출력하기에 재미를 붙인 철수는 이번에는 조금 어려운 빗금 친 사각형을 만들어 보기로 했다.
			n∗n 사각형에서 k간격 마다 빗금을 친 사각형을 출력하는 프로그램을 작성하시오.
			예를 들어, n=10, k=3이면,
			********** -> n개
			**23*56*8* 1+2, 1+3 1+5 1+6 1+8         34679 k, k+1, 2k, 2k+1, 3k => i+j / k = 0, 1
			*12*45*78* 2+1, 2+2 2+4 2+5 2+7 2+8     3467910 k, k+1, 2k
			*1*34*67** 3+1, 3+3 3+4 3+6 3+7          467910
			**  *  * * 4+2 4+3 4+5 4+6 4+8            6791012
			*  *  *  *
			* *  *  **
			**  *  * *
			*  *  *  *
			**********
			윗변을 기준으로 왼쪽에서 부터 k간격마다 ↙방향으로 빗금을 그으시오.
			10 3인경우,
			**********
			  |  |  |
			 이 위치들(즉, 3의 배수)

		
			 4 1, 4/2일때 안맞음 사각형의 틀은 별이지만 기본적으로 속은 공백이고 빗금이 별입니다.
			**** ****
			**** * **
			**** ** *
			**** ****
**********			 
**@@*@@*@*
*@@*@@*@@*
*@*@@*@@**
**@@*@@*@*
*@@*@@*@@*
*@*@@*@@**
**@@*@@*@*
*@@*@@*@@*
**********
	for(i = 1; i <= n; i++)
	{
		for(j = 1; j <= n; j++)
		{
			if ( i == 1 || i == n || j == 1 || j == n )
				printf("*");
			else if ( (i+j-1)%k == 0 )
				printf("*");
			else
				printf(" ");
							 
		*/
	}

}
