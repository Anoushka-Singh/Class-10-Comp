class Time
{
    int hr, min, sec;
    double ans;
    
   void accept ()
    {
         hr= 1;
         min= 52;
         sec= 46;
    }
    void convert()
    {
         hr=(1*60*60);
         min=(52*60);
         sec=(46*1);
         ans =(hr+min+sec);
        
    }
    void result()
    {
        System.out.println("Total time in seconds is"  + ans);
    }
}
        