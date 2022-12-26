import java.util.*;
class static1
{
    static int a=5;
    static int b;
    static void method(int x)
    {
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+x);
    }
static
{
b=a*3;
}
public static void main (String[] args) {
    staticdemo obj=new staticdemo();
    obj.method(5);
}
}