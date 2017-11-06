package BridgePattern;

public class Circle extends Shape {

	protected Circle(int x,int y,int radius,DrawAPI drawAPI) {
		super(drawAPI);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	private int x,y,radius;
	@Override
	protected void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}

}
