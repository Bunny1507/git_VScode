public class Mycalc

{
    int  sum(int a , int b)
    {
        return a+b;
    }
    int  diff(int a , int b)
    {
        return a-b;
    }
    int  Div(int a , int b)
    {
        return a/b;
    }



    public static void main(String args[]){
        Mycalc calc = new Mycalc();
        System.out.println("Sum is :"+calc.sum(10,20));
        System.out.println("diff is :"+calc.diff(10,20));
        System.out.println("Div is :"+calc.Div(10,20));
}

}