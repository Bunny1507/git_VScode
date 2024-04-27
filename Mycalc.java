public class Mycalc

{

    int  sum(int a , int b)
    {
        return a+b;

    }



    public static void main(String args[]){
        Mycalc calc = new Mycalc();
        System.out.println("Sum is :"+calc.sum(10,20));

}

}