package ��һ���ϻ�;

public class Testhello extends Shap2D{

	public Testhello(float xx, float yy) {
		super(xx, yy);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Shap2D sh=new Circle(3.0f,4.0f,9.0f);
		Shap2D re=new Rect(9.0f,5.9f,10f,8f);
		
		System.out.println(sh.Area());
		System.out.println(re.Area());
		System.out.println("����ͼ��֮��ľ����ǣ�"+re.distance(sh));
		Testhello th=new Testhello(2,5);
		System.out.println("����ͼ��֮��ľ����ǣ�"+re.distance(th));
	}

	@Override
	public float Area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
