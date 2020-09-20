package 第二次作业;

public class pub_test1 {
	private float fvar1;
	private float fvar2;
	private int ivar1;
	
	void main(String args[]){
		fvar2=sum_f_I(ivar1,fvar1);
		System.out.println(fvar2);
	}
	
	static float sum_f_I(int i,float f) {
		  return(i+f);
	}
}