class CalculaArea
{

    public int circle()
    {
       double area;
        double p=3.14;
        int r = 3;
        System.out.println("The radius of the circle is " + r);
       area = r*r*p;
        System.out.println("Area of a circle is " + area);
        return 0;
    }

public  int rectangle ()
    {
        

        System.out.println(" length of Rectangle: =20");
        int length = 20;

        System.out.println(" the width of Rectangle:=10");
        int width = 10;

        //Area = length*width;
        int area = length * width;

        System.out.println("Area of Rectangle is:" + area);
        return 0;
    }

    public int square()
    {
        int side=5, area;
        

        System.out.println(" value of the sides of square = 5");
        

        area = side * side;

        System.out.println("Area of Square : " + area);
        return 0;
    }
    public static void main(String[] args){
    	CalculaArea b =new CalculaArea();
    	b.circle();
    	b.rectangle();
    	b.square();
    	}
}
    
