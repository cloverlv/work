package 泛型方法实例;

import	java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestHello {
	//泛型
	public static <T> void DisplayArray(T[] anArray)
	{
		for(T t:anArray)
		{
			System.out.println(t);//默认调用了toString()
			System.out.println("----");
		}
	}
	public static void main(String[] args) {
//		String[] strArray={"ABC","DEF","HIJ"};
//		DisplayArray(strArray);
//		
//		Integer[] intArray={1,2,3,4,5};
//		DisplayArray(intArray);
//		
//		Car[] carArray=new Car[2];
//		carArray[0]=new Car("奔驰",3,4);
//		carArray[0]=new Car("宝马",3,4);
//		DisplayArray(carArray);
		
		Map<Integer,String> map=new HashMap<>();
		map.put(2,"ABC");
		map.put(4,"8784");
		System.out.println(map.get(4));
		
		HashMap<String,Car> carmap=new HashMap<String,Car>();
		carmap.put("奔驰",new Car("奔驰",3,4));
		carmap.put("宝马",new Car("宝马",1,3));
		System.out.println(carmap.get("奔驰"));
		System.out.println(carmap.size());
	
		
		
		
	}
}
