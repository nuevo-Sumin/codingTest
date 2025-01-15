package codingTest.codeUp;

import java.util.Scanner;

public class T1510 {

	public static void main(String[] args) {
/* 2차원 배열
마방진(magic square)이란 가로, 세로, 대각선의 합이 같은 사각형을 말한다.
홀수 n을 입력으로 받아 n*n 홀수 마방진을 만들어 보자.
만드는 방법은 여러가지 방법이 있지만, 아래와 같은 방법을 이용하여 구현해보자.
구현 방법:
1. 시작은 첫 행, 한 가운데 열에 1을 둔다.
2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어간다.
3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어간다.
4. 열은 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화없음.

마방진의 크기인 n이 입력된다.(n은 50보다 작은 홀수인 자연수)
*
* n = 3
* 816
* 357
* 492
* 
*/	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		arr[0][n / 2] = 1;
		int j = 0;
		int k = n / 2;
		
		for(int i = 2; i <= n * n; i++) {
			if (i % n == 1) {
				j = j + 1 == n? j + 1 - n: j + 1;
			} else {
				j = j - 1 < 0 ? j - 1 + n : j - 1;
				k = k + 1 == n ? k + 1 - n : k + 1;
			}
			arr[j][k] = i;
			
		}
		
		for (int[] is : arr) {
			for (int a : is) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}

/*
 * 1) for문의 시작위치를 int a = 0, b = n/2 로 시작하면 초기 위치 지정이 가능하니까 하드코딩 불필요
 * 2) if문에 넣었던 (n보다 크면 n+1 어쩌고) 기준을 % 나머지를 쓰면 간단하게 정리 가능.
 * 
int main()
{
	int n, i, j, d[50][50], m = 1, a, b;

	scanf("%d", &n);
	for(i = a = 0, b = n / 2; i < n; i++)
	{
		for(j = 0; j < n; j++)
		{
			d[a][b] = m++;
			if(j == n - 1) break;
			a = (a - 1 + n) % n;
			b = (b + 1) % n;
		}
		a = (a + 1) % n;
	}

	for(i = 0; i < n; i++, puts(""))
		for(j = 0; j < n; j++)
			printf("%d ", d[i][j]);
	return 0;
}
 * 
 * 
 * 
 * 
 * */
