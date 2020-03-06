package epam.task6;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	public static final Logger LOGGER=LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		list l=new list();
		LOGGER.info("Enter Your Choice \n1.Insert\n2.Delete\n3.Search\n4.view\n5.Exit");
		int ch=sc.nextInt();
		boolean bo=true;
		while(bo) {
		switch(ch)
		{
		case 1:LOGGER.info("Enter element");
				int ele=sc.nextInt();
				LOGGER.info("Enter position");
				int pos=sc.nextInt();
				l.insert(pos, ele);
				break;
		case 2:
			LOGGER.info("Enter element");
			int ele1=sc.nextInt();
			l.remove(ele1);
			break;
		case 3:
			LOGGER.info("Enter element");
			int ele2=sc.nextInt();
			boolean b=l.search(ele2);
			if(b)
			{
				LOGGER.info("Element Found");
			}
			else
				LOGGER.info("Element not found");
			break;
		case 4:
			l.printelements();
		case 5:
			return;
		}
		LOGGER.info("Do You Want to continue ,\nif yes enter 1 or 0");
		int a=sc.nextInt();
		if(a==1)
		{
			bo=true;
		}
		else
			bo=false;
	}
	}


}
