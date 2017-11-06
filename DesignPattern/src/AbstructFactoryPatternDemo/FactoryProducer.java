package AbstructFactoryPatternDemo;

public class FactoryProducer {

	public static AbstructFactory getFactory(String choice){
		
		//返回值类型为父类，返回的具体对象为子类对象，子类工厂继承父类工厂抽象类
		if(choice.equals("color"))
			return new ColorFactory();
		if(choice.equals("shape"))
			return new ShapeFactory();
		
		return null;
		
	}
}
