package 第一次作业;

public class Count {
	private int serialNumber;
	private static int counter = 0;
	public Count ()	{
		counter++;
		serialNumber = counter;
	}
}
