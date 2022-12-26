class main
{
    int sum(int...a)
    {
        int sum=0;
        for (int n:a)
        {
            sum=sum+n;
        }
        return sum;
    }
}
class variablelen
{ 
  public static void main(String args[])
  {
  main v=new main();
  System.out.println(v.sum(2,3,4,1,3,4,2,1));
  }
}    
