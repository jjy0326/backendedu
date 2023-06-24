package com.joon;

public class ForIfTestClass {

	public static void main(String[] args) {
		int[] age={27,34,28,26,41,28,42,29,29,32};
		
		// 1.나이의 합(ageSum) 구하기
       int ageSum = 0;
       int count =age.length;
       
       for(int n=0; n<count; n++) {
    	   ageSum = ageSum +age[n];
       }
		System.out.println("나이의 합은:"+ageSum);
		
		// 2. 평균 나이(ageAvg) 구하기
		float ageAvg = ageSum / count;
		System.out.println("평균나이는 "+ageAvg);
		
		// 3. 평균 나이보다 많은 인원 수(num) 구하기
		int num = 0;
	      for(int n=0; n<count; n++) {
	    	   if(ageAvg < age[n]) {
	    		   num= num+1; // ++num; 도 가능
	    	   }
	       }
	
		System.out.println("평균 나이보다 많은인원수:"+num);
		
		
		// 문자열을 저장하고 싶을 경우 데이터 타입은: String
		// 문자열은 반드시 ""으로 기입해야 한다!!
		String t1="a";
		String t2="abc";
		String t3="ㄱ";
	    String t4="가";
	    String t5="값";
		// "영문, 특수기호(뛰어쓰기 포함), 숫자" => 한 글자당 1byte
	    // " 한글" => 한 글자당 2byte (참고: Oracle은 3byte)
	    
		String[] name={"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
		

        int[] pay={460,200,250,300,300,200,350,200,400,440};
		
        // 금여가 300 (three)인 사람의 이니셜을 출력하기
        // 1.금여(pay)가 300(==) 사람찾기 =>if()
        //int count를 for()

       for(int idx=0; idx<count; idx++) {
    	   if(pay[idx]==300) {
    		   System.out.println("300인 사원 이니셜:"+name[idx]);
    	   };
    	   
    	   
       }
       
       //2. 문자열 연산을 이용 , 문자열 +숫자도 가능 => 결과는 문자열
       String str= "";
       str = str +"KKH "; // "KKH"
       str = str +"LLT "; // "KKH LLT"
       str = str +"CCC "; // "KKH LLT CCC"
       
       
       //index           0      1      2   3      4     5     6      7    8     9 
       //String[] name={"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
	   //int[] pay={460,200,250,300,300,200,350,200,400,440};
       // count =>10
       str= ""; //""
       for(int idx=0; idx< count; idx++) {
    	   if(pay[idx]==300) {
    		   // "HST" + "HTX" + " "
    		   str = str +name[idx] + " "; // HST HTW 
    		
    	   }
    	   
    	   
       }
       System.out.println("300인 사원 이니셜"+str);
	}
	
	// ArrayList 

}
