package com.joon;

public class ArrayClass {

	public static void main(String[] args) {	
		// 0, 1, 2, 3, 4 인덱스 번호
		int[] intArr = {10,20,30,40,50}; // 실제 데이터 값
		// 데이터 갯수 확인 방법
		System.out.println("intArr의 데이터갯수:"+ intArr.length); // 5
		
		// intArr의 데이터들을 합하고 싶을 경우,
		// 1. 각 index를 이용하여 각각의 값을 꺼내어(추출하여) 합하면 된다!!
		int sum = intArr[0]+ intArr[1]+ intArr[2]+intArr[3] +intArr[4];
		// 반복문: for(반복문내에서 사용할 변수 선언; 반복문을 멈추기 위한 조건; 증가/감소) {
		//       조건이 참(true)이었을 경우 해야할 일들....;
		//           }
		int sum2 = 0; //합을 누적하는 변수. 누적하는 변수는 초기값 필요 ex) int sum2; -x
		for(int n=0; n<5; n++ ) { // n++: n=n+1과 동일
		System.out.println("n의 현제값:"+ n);	/*n의 현제값:1
		n의 현제값:2
		n의 현제값:3
		n의 현제값:4
		*/
		sum2= sum2 + intArr[n];
		System.out.println("최종합:"+ sum2); // 150
		
		}
		
	}

}
