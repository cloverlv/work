package 泛型方法实例;

import java.util.Random;

public class FruitGenerator<T> implements Generator<T> {

	private String[] fruits = new String[]{"Apple","Banana","Pear"};
	@Override
	public T next() {
		// TODO Auto-generated method stub
		Random rm=new Random();
		return (T)fruits[rm.nextInt(fruits.length)];
	}

}
