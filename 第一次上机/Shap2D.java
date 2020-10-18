package 第一次上机;

public abstract class Shap2D {
	//图形位置
	protected float x,y;
	public Shap2D (float xx,float yy)
	{
		this.x=xx;
		this.y=yy;
	}
	//图形面积
	public abstract float Area();
	//求与另一个图形的距离
	public float distance(Shap2D shap)
	{
		float d=0;
		d=(float) Math.sqrt(Math.pow(this.x-shap.getX(), 2)+Math.pow(this.y-shap.getY(), 2));
		return d;
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}

}
