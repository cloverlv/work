package �ڶ�����ҵ;

abstract class amygraphic{//����һ��ͼ�γ�����
	int width;//���
	int height;//�ߵ�
	float hh;//����
	float r;//Բ�İ뾶
	int area;
	abstract void area();//��������ĳ��󷽷�
}

class Rectangle extends amygraphic{//����һ��������
	void area() {
		width=3;
		height=7;
		area=width*height;
		System.out.println("���ε��ܳ��ǣ�"+2*(width+height)+"");
		System.out.print("���ε�����ǣ�"+area+"\n");
	}
}

class deltaaa extends amygraphic{//����һ����������
	void area() {
		width=6;//�����width�����
		height=7;//��
		area=width*height/2;
		System.out.print("�����ε�����ǣ�"+area+"\n");
	}
}

class circle extends amygraphic{//����һ��Բ��
	 void area() {
		 final float PI=3.14f;
		 r=3.0f;
		 System.out.print("Բ������ǣ�"+r*r*PI+"\n");
		 System.out.print("Բ���ܳ��ǣ�"+2*PI*r);
	 }
}
public class MyGraphic {
	 public static void main(String[] args) { // TODO �Զ����ɵķ������
	 Rectangle a=new Rectangle();
	 a.area();
	 deltaaa bDelta=new deltaaa();
	 bDelta.area();
	 circle circle=new circle();
	 circle.area();
	 }
}