class Overloading_sum
{
    void sum (double a, double b)
    {
        System.out.println(a+b);
       
    }
    void sum (int a, int b)
    {
        System.out.println(a+b);
        
    }
    public static void main()
    {
        Overloading_sum obj=new Overloading_sum ();
        obj.sum (3.4,8.6);
        obj.sum (8,3);
    }
}