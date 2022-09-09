package com.cc;
class myname
{
	private String name;
	private int Age;
	

	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return Age;
	}
	public void setAge(int Age)
	{
		this.Age=Age;
	}
}
public class Main {
	public static void main(String[] args)
	{
		myname T=new myname();
		T.setname("Darshan ");
		T.setAge(20);
		System.out.println(T.getname());
		System.out.println(T.getAge());
	}
}

