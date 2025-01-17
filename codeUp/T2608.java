package codingTest.codeUp;

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
//n의 n승을 어떻게 구할 것인가? 
가 아니라
경우의 수는 n의 2개, 모든 투표는 n의 n승개
출력 예시를 표현해야하는군.
반복문을 돌면서 해보자.
* 1) 바깥쪽 for문에서 한명의 투표결과인 O,안쪽은 X
* 2) 배열에 담는 건 어떨까?
* 바깥 for문 1행은 n의 1번째 반복한 안쪽 for문(OX의 조합 -
* 2행은 n의 2번째 반복한 OX의 조합
*/
		int n = 3;
		int v = 1;
		for(int i = 0; i < n * n; i++) {
			for (int j = 0; j < n; j++) {
				String vote = v < 0 ? "X" : "O";
				System.out.print(vote);
				v = -v;
			}
			System.out.println();
		} 
		
		
	}

}
