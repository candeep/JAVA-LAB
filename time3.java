class time
{
	long seconds=0,min=0,hrs=0;
	time()
	{
		System.out.println("00:00:00");
	}
	time(long a)
	{
		seconds=a%60;
		min=a/60;
	if (min>59)
	{
		hrs =min/60;
		min=min%60;
	}
	}
	time(long minutes,long a)
	{
		seconds =a%60;
		min=a/60;
		min+=minutes;
		if(min>59)
		{
		hrs= min/60;
		min=min%60;
		}
	}
	time (long h,long m ,long a)
	{
		hrs=h;
		min=m;
		seconds=a;
	}
	void display()
	{
		System.out.println(hrs+":"+min+":"+seconds);
	}
}
class time3
{
	public static void main(String args[])
	{
		time t1=new time(906);
		t1.display();
		time t2=new time(11,3601);
		t2.display();
		time t3 =new time(6,32,15);
		t3.display();
	}
}