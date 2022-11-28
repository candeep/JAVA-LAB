import java.util.*;
class employee
{
	String name,id;
	long sal;
	int hrs;
	Scanner scan=new Scanner(System.in);
	void getinfo()
		{
			System.out.println("Enter Employee name,id,sal,hrs:");
			name=scan.next();
			id=scan.next();
			sal=scan.nextLong();
			hrs=scan.nextInt();
		}
	void AddSal()
		{
			if (sal<500)
			{
				sal=sal+10;
			}
		}
	void AddWork()
		{
			if (hrs>6)
			{
				sal=sal+5;
			}
		}
	void display()
		{
			System.out.println((name)+"  "+(id)+"  "+(sal)+"  "+(hrs));	
		}
}
class employeetest
{
public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter no.of Employee: ");
	int n=scan.nextInt();
	employee arr[]=new employee[n];
	for (int i=0;i<n;i++)
	{
		employee e=new employee();
 		e.getinfo();
		e.AddSal();
		e.AddWork();
		arr[i]=e;
		
	}
	for (int i=0;i<n;i++)
	{
		arr[i].display();
	}

	}
}