package 第一次上机;

public class Circle extends Shap2D {
	protected float r;
	public Circle(float xx, float yy,float rr) {
		super(xx, yy);
		this.r=rr;
		// TODO Auto-generated constructor stub
	}
	
	public float Area() {
		// TODO Auto-generated method stub
		return (float) (Math.PI*r*r);
	}

}
