package AbstructFactoryPatternDemo;

public class FactoryProducer {

	public static AbstructFactory getFactory(String choice){
		
		//����ֵ����Ϊ���࣬���صľ������Ϊ����������๤���̳и��๤��������
		if(choice.equals("color"))
			return new ColorFactory();
		if(choice.equals("shape"))
			return new ShapeFactory();
		
		return null;
		
	}
}
