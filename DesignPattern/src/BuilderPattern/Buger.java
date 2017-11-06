package BuilderPattern;

public abstract class Buger implements Item {

	

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Paper();
	}

	@Override
	public abstract float price() ;

	@Override
	public abstract String name() ;

}
