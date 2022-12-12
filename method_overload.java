
class sample
{
  int length,breadth;
  void room()
  {
    System.out.println("method with no parameters");
  }
  void room(int l)
  {
    System.out.println("method with single parameter");
    length=l;
    breadth=l;
  }
  void room(int l,int b)
  {
    System.out.println("method with Two parameters");
    length=l;
    breadth=b;    
  }
  int volume()
  {
    return (length*breadth);
  }
}
class method_overload
{
  public static void main(String args[])
  {
    int vol;
    sample ob=new sample();
    ob.room();
    ob.room(2);
    vol=ob.volume();
    System.out.println(vol);
    ob.room(2,4);
    vol=ob.volume();
    System.out.println(vol);
  }
}