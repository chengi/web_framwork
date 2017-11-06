package AbstructFactoryPatternDemo;

public class ColorFactory extends AbstructFactory {

	@Override
	public Color getColor(String color) {

		if(color==null)
			return null;
		if(color.equals("red"))
			return new Red();
		if(color.equals("green"))
			return new Green();
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

//	public Color getColor(String color){
//		if(color==null)
//			return null;
//		if(color.equals("red"))
//			return new Red();
//		if(color.equals("green"))
//			return new Green();
//		
//		return null;
//	}
}
