package lab2.ex5;

public class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Calculator calculator = new Calculator();
        calculator.go(2,5,'+');
        calculator.go(2,5,'-');
        calculator.go(2,5,'*');
        calculator.go(10,2,'/');

    }


}