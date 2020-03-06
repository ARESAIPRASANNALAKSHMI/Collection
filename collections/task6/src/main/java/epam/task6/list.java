package epam.task6;
import java.util.ArrayList; 
public class list {
	ArrayList<Integer> arrlist = new ArrayList<Integer>(10);
	list()
	{
	 arrlist.add(10);
	 arrlist.add(15);
	 arrlist.add(20);
	 arrlist.add(25);
	 arrlist.add(30);
	 arrlist.add(35);
	 arrlist.add(40);
	 arrlist.add(45);
	 arrlist.add(50);
	 arrlist.add(55);
	}
	public void insert(int index,int element)
	{
		arrlist.add(index,element);
	}
	public void remove(int element)
	{
		int n=arrlist.indexOf(element);
		arrlist.remove(n);
	}
	public boolean search(int element)
	{
		boolean a=arrlist.contains(element);
		return a;
	}
	public void printelements()
	{
		for(int i=0;i<arrlist.size();i++)
		{
			System.out.println(arrlist.get(i));
		}
	}


}
