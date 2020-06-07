class Overloading_area
{
    void area (int l, int b)
    {
        System.out.println("The area of the square is" + l*b);
    }
    void area (double l, double b)
    {
        System.out.println("The area of the rectangle is" + l*b);
    }
    void area ( double r)
    {
        double pi= 3.14;
        double ra= r*r;
        System.out.println("The area of the circle is" + pi*ra);
    }
    public static void main()
    {
        Overloading_area obj= new Overloading_area();
        obj.area(3,9);
        obj.area(5.2,2.3);
        obj.area(7.4);
    }
}