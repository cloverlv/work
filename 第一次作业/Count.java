package ��һ����ҵ;

public class Count {
	private int serialNumber;
	private static int counter = 0;
	public Count ()	{
		counter++;
		serialNumber = counter;
	}
}
