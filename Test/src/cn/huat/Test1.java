package cn.huat;

public class Test1 {

	public static void main(String[] args) {
		
		Integer a = new Integer(1);
		Integer b = 1;
		int c = 1;
		
		System.out.println(a==b);//==�Ƚ����������ַ
		System.out.println(a.equals(b));//equals�Ƚ�������������
		System.out.println(a==c);//true a�Զ������int�����ٺ�c�Ƚ�
//����has-a ����use-a �̳�is-a
	}

}
