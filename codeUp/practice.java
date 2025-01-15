package codingTest.codeUp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class practice {
// 1차 풀이: 이중 for문 - 메모리 초과
// 2차 풀이: 2분탐색 - 조건 설정 실패, 메모리 초과
// 3차 풀이: 입력받는 값을 인덱스로 설정
	/*
	 * arr[2] =1, arr[52] =1, arr[23] = 1 식으로 
입력받은 값을 배열의 index로 사용합니다.
그 후  M개의 질문을 받을 때 arr[M의 질문] 을 출력한다면 
있는 값이면 1(아까 A를 받으면서 입력했으니까), 
없는 값이면 0(초기화된 배열)을 출력하게 됩니다. 
+ 입력받는 값을 줄인다.

Hashmap 을 써본다. Hashmap 빠르다고 함.
https://ikjo.tistory.com/37



*/
	/*
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] all = new int[100001];
////		
		int n = Integer.parseInt(br.readLine()); //입력할 갯수
		int[] A = new int[n]; //그 갯수로 배열 만들기
		int index;
		String s = br.readLine(); //"1 2 3 4 5 형태로 입력 받기"
		String arr[] = s.split(" ");
		for (int i = 0; i < n; i++) {
			index = Integer.parseInt(arr[i]);
			if (index <= 100000) {
				all[index] = 1;
			}
		}
		
		int q = Integer.parseInt(br.readLine());
		int[] B = new int[q];
		s = br.readLine();
		String arr1[] = s.split(" ");
		for (int i = 0; i < q; i++) {
			index = Integer.parseInt(arr1[i]);
			B[i] = all[index];
		}
		
		for(int i : B) {
			System.out.print(i + " ");
		}
		
	} // main
*/	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Boolean> map = new HashMap();
        int n = Integer.parseInt(br.readLine());
        int a, mul = 10;
        int temp = br.read();
        while(true){
            a = br.read();
            if (a==32 || a==10) { 
                map.put(temp, false);
                temp = 0;
                mul = 1;
                if(a==10) {
                    mul = 10;
                    break;
                }
            } else {
                temp += a*mul;
                mul *= 10;
            }
        }

        int m = Integer.parseInt(br.readLine());
        temp = br.read();
        while(true){
            a = br.read();
            if (a==32 || a==10 || a==-1) {
                if(temp!=0) {
                    if(map.containsKey(temp)) bw.write("1 ");
                    else bw.write("0 ");
                    temp = 0;
                    mul = 1;
                }
                if(a==10 || a==-1) break;
            } else {
                temp += a*mul;
                mul *= 10;
            }
        }
        bw.flush();
        bw.close();
    }
	
}// class
