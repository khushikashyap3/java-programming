import java.util.*;

public class XYZ
{
static void swap (int x, int y)
{
int temp = x;
x = y;
y = temp;
System.out.println ("Value of x is"  + x + " and Value of y is"  + y);
}

public static void main (String[] args)
{
int x= 10, y = 5;
swap (x,y);
}
}
