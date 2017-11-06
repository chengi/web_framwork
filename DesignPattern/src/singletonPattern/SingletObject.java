package singletonPattern;

public class SingletObject {

	private static SingletObject instance = 
						new SingletObject();
	private SingletObject(){};//���췽��˽�У�ֻ���ڲ�����
	
	public static SingletObject getInstance(){
		return instance;
	}
	
}