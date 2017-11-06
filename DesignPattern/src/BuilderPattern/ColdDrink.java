package BuilderPattern;

public abstract class ColdDrink implements Item {

	@Override
	public abstract String name() ;

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();

}
