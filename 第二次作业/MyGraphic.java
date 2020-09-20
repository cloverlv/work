package 第二次作业;

abstract class amygraphic{//定义一个图形抽象类
	int width;//宽等
	int height;//高等
	float hh;//梯形
	float r;//圆的半径
	int area;
	abstract void area();//定义面积的抽象方法
}

class Rectangle extends amygraphic{//定义一个矩形类
	void area() {
		width=3;
		height=7;
		area=width*height;
		System.out.println("矩形的周长是："+2*(width+height)+"");
		System.out.print("矩形的面积是："+area+"\n");
	}
}

class deltaaa extends amygraphic{//定义一个三角形类
	void area() {
		width=6;//这里的width代表底
		height=7;//高
		area=width*height/2;
		System.out.print("三角形的面积是："+area+"\n");
	}
}

class circle extends amygraphic{//定义一个圆类
	 void area() {
		 final float PI=3.14f;
		 r=3.0f;
		 System.out.print("圆的面积是："+r*r*PI+"\n");
		 System.out.print("圆的周长是："+2*PI*r);
	 }
}
public class MyGraphic {
	 public static void main(String[] args) { // TODO 自动生成的方法存根
	 Rectangle a=new Rectangle();
	 a.area();
	 deltaaa bDelta=new deltaaa();
	 bDelta.area();
	 circle circle=new circle();
	 circle.area();
	 }
}