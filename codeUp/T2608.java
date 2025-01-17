package codingTest.codeUp;

import java.util.Scanner;

public class T2608 {

	public static void main(String[] args) {
/*
정보 동아리 회장을 선출하려고 한다.
올해는 단일 후보만 등록하여 찬반 투표를 실시하였다.
n명의 학생이 O, X로 의사 표현을 한다면 나올 수 있는 경우를 모두 출력하시오.
예를 들어 2명이 투표하는 경우 나올 수 있는 경우는
OO
OX
XO
XX
이다.
투표자 수 n이 정수로 입력된다.(1 <= n <= 7)
나올 수 있는 모든 경우의 수를 출력한다.
찬성은 알파벳 대문자 O, 반대는 알파벳 대문자 X로 표시한다.

경우의 수는 2의 n승
* 
n이 3이면 2의 3승
각 투표자 1인의 O의 갯수 2의 3승의 절반인 4
2진수를 어떻게 표현하나요.
2의 n승에서부터 0까지 하나씩 빼면서 이진수 출력?!!?!!?!??!
이것을 어떻게 하지요?!?!?!?!?
두가지 경우의 수라면 이진수를 떠올리도록 하자.
이때 출력 순서도 고려하자!! 보아하니 O이 먼저 나오는게 0이고 X가 1이면 큰 자리가 나중에 나완다는 느낌. 
111이면 근데 7인데? 000은 0이니까 7 6 5 4 3 2 1 0 하면 8개군 그럼 그냥 2의 n승 -1 하면 돼
0에서부터 2의 n승-1까지 이진수의 형태로 출력해봅시다. how?!
하나의 숫자를 이진수로 표현하는 건 배웠는데?!!?!?!?
그거를 다시 for문으로?!?!?!?!
일단 해보자.
혹시 비트 연산자라ㅡㄹ?!?!?!?!?!?
OOO
OOX
OXO
OXX
XOO
XOX
XXO
XXX
O를 0으로 보고 X를 1로 봐서 2진수를  작은것부터 출력하는 거라고 볼수 있겠네요


*/	
		Scanner sc = new Scanner(System.in);
		int scan = sc.nextInt(); //2진수 자리수 - 2의 3승 계산할 계획
		int[] arr = new int[1 << scan]; // 자리값 8을 표현할 배열

		// 이진법으로 변환할 숫자는 for문의 인덱스 값으로 하고, 인덱스 값을 따로 지정
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = 0;
			while (j < scan) {
				arr[j++] = i % 2;
				i /= 2;
			}
			for (int k = scan - 1; k >= 0; k--) {
				 String answer = arr[k] == 0 ? "O" : "X" ;
				 System.out.print(answer);
			}
			System.out.println();
			i = cnt++;
		}
		
		
	}

}

/* 코드 길이:726 byte(s) / 수행 시간:80 ms / 메모리 :18316 kb
 * 코드 길이:408 byte(s) / 수행 시간:0 ms / 메모리 :1084 kb
 * #include<stdio.h>

int n;
char ox[] = {'O', 'X'};
char str[9];

void back(int len, int k)
{
	if(len == n - 1)
	{
		str[len] = ox[k];
		printf("%s\n", str);
		return ;
	}
	else 
	{
		str[len] = ox[k];
		back(len + 1, 0);
		back(len + 1, 1);
	}
}
main()
{
	scanf("%d", &n);
	str[n] = '\0';
	back(0, 0);
	back(0, 1);
}

 * 
 * 
 * 
 * 
 * 
 * */
