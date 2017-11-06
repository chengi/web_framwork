package cn.huat;

public class Test1 {

	public static void main(String[] args) {
		
		Integer a = new Integer(1);
		Integer b = 1;
		int c = 1;
		
		System.out.println(a==b);//==比较两个对象地址
		System.out.println(a.equals(b));//equals比较两个对象内容
		System.out.println(a==c);//true a自动拆箱成int类型再和c比较
//关联has-a 依赖use-a 继承is-a
	}

}
