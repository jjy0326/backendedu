package com.joon;

public class ForIfTestClass {

	public static void main(String[] args) {
		int[] age={27,34,28,26,41,28,42,29,29,32};
		
		// 1.������ ��(ageSum) ���ϱ�
       int ageSum = 0;
       int count =age.length;
       
       for(int n=0; n<count; n++) {
    	   ageSum = ageSum +age[n];
       }
		System.out.println("������ ����:"+ageSum);
		
		// 2. ��� ����(ageAvg) ���ϱ�
		float ageAvg = ageSum / count;
		System.out.println("��ճ��̴� "+ageAvg);
		
		// 3. ��� ���̺��� ���� �ο� ��(num) ���ϱ�
		int num = 0;
	      for(int n=0; n<count; n++) {
	    	   if(ageAvg < age[n]) {
	    		   num= num+1; // ++num; �� ����
	    	   }
	       }
	
		System.out.println("��� ���̺��� �����ο���:"+num);
		
		
		// ���ڿ��� �����ϰ� ���� ��� ������ Ÿ����: String
		// ���ڿ��� �ݵ�� ""���� �����ؾ� �Ѵ�!!
		String t1="a";
		String t2="abc";
		String t3="��";
	    String t4="��";
	    String t5="��";
		// "����, Ư����ȣ(�پ�� ����), ����" => �� ���ڴ� 1byte
	    // " �ѱ�" => �� ���ڴ� 2byte (����: Oracle�� 3byte)
	    
		String[] name={"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
		

        int[] pay={460,200,250,300,300,200,350,200,400,440};
		
        // �ݿ��� 300 (three)�� ����� �̴ϼ��� ����ϱ�
        // 1.�ݿ�(pay)�� 300(==) ���ã�� =>if()
        //int count�� for()

       for(int idx=0; idx<count; idx++) {
    	   if(pay[idx]==300) {
    		   System.out.println("300�� ��� �̴ϼ�:"+name[idx]);
    	   };
    	   
    	   
       }
       
       //2. ���ڿ� ������ �̿� , ���ڿ� +���ڵ� ���� => ����� ���ڿ�
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
       System.out.println("300�� ��� �̴ϼ�"+str);
	}
	
	// ArrayList 

}
