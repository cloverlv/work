package 第一次上机;

public class Rect extends Shap2D {
	
	protected float h,w;
	public Rect(float xx, float yy, float hh, float ww) {
		super(xx, yy);
		this.h=hh;
		this.w=ww;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float Area() {
		// TODO Auto-generated method stub
		return (float)h*w;
	}

}
