package com.joon;

public class ArrayClass {

	public static void main(String[] args) {	
		// 0, 1, 2, 3, 4 �ε��� ��ȣ
		int[] intArr = {10,20,30,40,50}; // ���� ������ ��
		// ������ ���� Ȯ�� ���
		System.out.println("intArr�� �����Ͱ���:"+ intArr.length); // 5
		
		// intArr�� �����͵��� ���ϰ� ���� ���,
		// 1. �� index�� �̿��Ͽ� ������ ���� ������(�����Ͽ�) ���ϸ� �ȴ�!!
		int sum = intArr[0]+ intArr[1]+ intArr[2]+intArr[3] +intArr[4];
		// �ݺ���: for(�ݺ��������� ����� ���� ����; �ݺ����� ���߱� ���� ����; ����/����) {
		//       ������ ��(true)�̾��� ��� �ؾ��� �ϵ�....;
		//           }
		int sum2 = 0; //���� �����ϴ� ����. �����ϴ� ������ �ʱⰪ �ʿ� ex) int sum2; -x
		for(int n=0; n<5; n++ ) { // n++: n=n+1�� ����
		System.out.println("n�� ������:"+ n);	/*n�� ������:1
		n�� ������:2
		n�� ������:3
		n�� ������:4
		*/
		sum2= sum2 + intArr[n];
		System.out.println("������:"+ sum2); // 150
		
		}
		
	}

}
