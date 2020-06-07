class Overloading_3
{
    void numcalc(int num, char ch)
    {
        if(ch=='s')
        {
            System.out.println(num*num);
        }
        else 
        {
            System.out.println(num*num*num);
    }
}
    void numcalc(int a, int b, char ch)
    {
        if(ch=='p')
        {
            System.out.println(a*b);
        }
        else
        {
            System.out.println(a+b);
    }
}
      }
    