/**
 * 
 */
package com.joon;
//package : 어느폴더안에 있는지 위치를 알려줌
// 항상 맨위에 존재해야함
/**
 * @author joon
 * 주석 테스트
 */
// public : 다른 클래스에 대한 접근 허가
// class: 클래스 선언을 위한 키워드
// VarClass: 클래스명 (첫글자 영문 대문자로 시작)
// 클래스 파일명 == 클래스명 == 생성자명
public class VarClass { //block 블록
	  // void: 메서드 내에서 반환 되는 값이 없을 경우, 지정하는 반환 타입
	  // main: 이 이름은 변경 불가!!!!
	  // String[]: 전달되는 데이터 타입
	  // args: 파라미터명(매개변수명). 외부에서 보내는 값을 전달받아 저장하는 변수

	public static void main(String[] args) { 
	 // 변수 선언: 데이터타입 변수명; / 데이터타입 변수명= 초기값;
	// 정수(int)를 저장받는 변수 선언
		int a;
		int b= 10;
		
    // 변수 사용: 선언된 변수에 대한 활용(사용)
		a= 10;
		b= 100;
	 //   c=10; c변수 선언이 없기 떄문에 오류(사용불가)!!!
		int d = a +b ;
		int f,g,h; //동일 타입변수를 한번에 만드는 방법
		f = 1000;
		//f = 3.14; 오류 : int를 써서 실수를 못씀
		// ***숫자 관련 타입: int(정수) / float(실수)
		// 논리 관련 타입: boolean(true/false)
		// 단일 문자 : char(단일 문자는 ''로 감싸서 설정)
		// 단일문자 - 원래 유니코드값을 가지고 있음 ***
		
		// 변수의 특징: 한 번에 하나의 값만 저장 가능!!!!
		f = 1000;
		// g = 10, 20 ,30; 오류- 하나의 값이 x
		
		// 변수명: 반드시 영문 소문자로 시작(관례), 다른 사람이 알아볼 수 있게 설명
		//    ex) 급여 : pay / 급여평균: payAvg(낙타기법)
		
		// 배열: 한번에 여러개의 값을 지정하는 변수 
		// 배열 선언: 데이터타입[ ] 배열명 = new 데이터타입[저장갯수];
		//          데이터타입 배열명 [ ]  = new 데이터타입[저장갯수]; (둘다가능)
		// 저장 갯수는 선언 이후에(초기값) 변경 불가능!!!!
		int[] intArr = new int[5]; // intArr에 선언값은 x 방만 설정
		int[] intArr2 = {10,20,30,40,50}; //  배열 값을 선언하면서 기입하는 방법
		intArr[0] = 100; //0 번 부터 시작. 5개였으니 4까지 한다
		intArr[1] = 200; 
		intArr[2] = 300; 
		intArr[3] = 400; 
		intArr[4] = 500; 
		// []:방은 인덱스 번호라 칭함
		// = : 대입연산자
		intArr2[0] = 10000;
		
		int result = intArr[4] + intArr2[4];
		System.out.println(result); // 550
		result = intArr[0]+ intArr[1] + intArr[2] + intArr[3] +intArr[4];
		System.out.println(result); //1500
		
		//intArr[5] = 22222; 오류뜸(아래 오류문구)
		/**Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at day1_var/com.joon.VarClass.main(VarClass.java:67)
		 * 
		 * Index 5 out of bounds for length 5: 인덱스 5번은 없으므로 결과값에 벗어남
		 */
		
		
		
		
		
		
	
		
           		
	
       		
		
	}

} // VarClass END
