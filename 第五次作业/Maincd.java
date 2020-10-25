package 第五次作业;

import java.util.Scanner;
public class Maincd{
	
	public static void main(String[] args)
	{
		CDManager cm=new CDManager();
		int count=1;
		while(count!=0)
		{
			System.out.print("----------------------------------------\n");
			System.out.print("which of following do you want to do:(1,2,3,4,0)\n");
			System.out.print("1.add cd.\n");
			System.out.print("2.find cd.\n");
			System.out.print("3.delete cd.\n");
			System.out.print("4.print all cds.\n");
			System.out.print("0.exit\n");
			
			count=Integer.parseInt(cm.inputstr());
			switch(count)
			{
			case 1:
				CD cd1=new CD();
				System.out.print("please input cd ID:");
				cd1.setID(cm.inputstr());
				System.out.print("please input cd Name:");
				cd1.setName(cm.inputstr());				
				System.out.print("please input cd Price:");
				try
				{
					float pc=Float.parseFloat(cm.inputstr());
					cd1.setPrice(pc);	
				}
				catch(NumberFormatException ne)
				{
					System.out.println("please input format number!");
				}
				System.out.print("please input cd press:");
				cd1.setPress(cm.inputstr());
				cm.addcd(cd1);
				System.out.print("insert successful!\n");
				break;
			case 2:
				System.out.println("please input ID of cd you want to find:");
				String id=cm.inputstr();
				CD fcd=cm.findcd(id);
				if(fcd.cdid!=null)
				{
					System.out.print("info of cd you want to find is:\n");
					fcd.print();
				}
				else
					System.out.print("There is no cd you want.\n");
				break;
			case 3:
				if(cm.deletecd()>0)
				{
					System.out.print("delete successful!\n");
				}
				else
					System.out.print("delete failed!\n");
				break;
			case 4:
				cm.printcd();
				break;
			case 5:
				break;
			}
			
		}
	}
}
class CD
{
  String cdid;
  String name;
  Float price;
  String press;

  public String setID(String ID)
  {
    return this.cdid = ID;
  }
  public String getID()
  {
  	return this.cdid;
  }
  public String setName(String Name)
  {
    return this.name = Name;
  }
  public Float setPrice(Float Price)
  {
    return this.price = Price;
  }
  public String setPress(String Press)
  {
    return this.press = Press;
  }
  public void print()
  {
  	System.out.println("ID:"+this.cdid+"\t"+"Name:"+this.name+"\t"+"Price:"+this.price+"\t"+"Press:"+this.press);
  }
}
class CDManager
{
  CD cd [ ] = new CD[500];
 
  private static int size = 0;
  public String inputstr()
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    return str;
  }
  public void addcd(CD mcd)
  {
  
    this.cd[size] = mcd;
    size++;
  }
  public CD findcd(String ID)
  {
  	CD flag = new CD( );
  	for(int i=0;i<size;i++)
  	{
  		if(cd[i].getID().equals(ID))
  		{
  			flag=cd[i];
  		}
  	}
  	return flag;
  }
  public int deletecd()
  {
  		if(size>0)
  		{
  			size--;
  			return 1;
  		}
  		else
  			return 0;
  }
  public void printcd()
  {
  	System.out.println("Number of vector elements is "+size +",and they are:");
    for(int i=0;i<size;i++)
    {
    	cd[i].print();
    }
  }
}
