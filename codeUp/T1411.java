package codingTest.codeUp;

import java.util.Scanner;

public class T1411 {

	public static void main(String[] args) {
		/*
		 * 우리는 1부터 N까지의 숫자가 차례대로 적힌 N장의 카드 묶음을 가지고 있다. 
		 * 그런데 이 카드 묶음을 옮기는 중 실수로 땅에 떨어뜨려 그 중 한 장을 잃어버렸다.
		   여러분은 땅에 떨어진 카드 묶음을 읽어서 빠진 하나의 카드 번호를 찾아 출력해야 한다.
		   첫 줄에는 한 장을 잃어버리기 전 카드의 전체 장수 N이 주어져 있다. 단 . 3 <= N <= 50 이다. 
		   
		   이어지는 N-1개의 각 줄에는 한 장이 빠진 카드 묶음의 카드 숫자가 하나씩 순서 없이 나열되어 있다.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];

		for (int i = 1; i < n; i++) {
			//scanner로 받은 숫자를 인덱스에 넣고 0으로 바꾼다면?
			int k = sc.nextInt();
			arr[k] = 1; 
		}
		
		for (int i = 1; i < n+1; i++) {
			if(arr[i] != 1 && i != n+1) System.out.print(i);
		}
	}

}
/*
 * int main(){
	int n, card[55], i, k;
	scanf("%d", &n);
	for(i=0; i<55; i++)
        card[i]=0;
	for(i = 0; i < n -1; i++){
		scanf("%d", &k);
		card[k]=1;
	}
	for(i = 1; i <= n; i++)
		if (card[i] == 0){
			printf("%d", i);
			return 0;
		}	
}
 * 
 * 
 * 
 * 
 * */

