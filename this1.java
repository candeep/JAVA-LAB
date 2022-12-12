class demo
{
	int a,b,c;
	demo(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class this1
{
public static void main(String args[])
{
	demo ob=new demo(10,20,30);
	ob.display();
}}
