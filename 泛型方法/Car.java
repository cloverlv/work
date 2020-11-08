package 泛型方法实例;

public class Car {	//Object
	String name;
	double tank;
	double oilConsumption;
	public Car()
	{
		
	}
	
	public Car(String name,double tank,double oilConsumption){
		this.name=name;
		this.tank=tank;
		this.oilConsumption=oilConsumption;
	}
	
	public void gas(double gasl){
		tank = tank+gasl;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", tank=" + tank + ", oilConsumption=" + oilConsumption + "]";
	}

	public boolean run(){
		if(tank>0){
			return true;
		}
		return false;
	}
}
