package demo;

import java.util.*;

public class Loops 
{
	public void BreakLoop()
	{
		ArrayList<String> arrlist=new ArrayList<String>();
		arrlist.add("a2");
		arrlist.add("a3");
		arrlist.add("a4");
		arrlist.add("a5");
		for(int i=0;i<arrlist.size();i++)
		{
			if(i==2)
			{
				System.out.println("He he break");
				break;
			}
			System.out.println(arrlist.get(i));
		}
	}
	
	public void ContinueLoop()
	{
		ArrayList<String> arrlist=new ArrayList<String>();
		arrlist.add("a2");
		arrlist.add("a3");
		arrlist.add("a4");
		arrlist.add("a5");
		for(int i=0;i<arrlist.size();i++)
		{
			if(i==2)
			{
				System.out.println("He he continue");
				continue;
			}
			System.out.println(arrlist.get(i));
		}
	}

}
