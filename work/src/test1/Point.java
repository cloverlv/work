package test1;

public class Point {
	int x , y;
	Point(int x1,int y1){
		x = x1;
		y = y1;
	}
	Point(){
		this (0, 0);
	}
	void moveTo(int x1, int y1){
		x = x1;
		y = y1;
	}
}
