public class Driver
{
    public static void main(String[]args){
        Fraction f1 = new Fraction("5/1");
        Fraction f2 = new Fraction("5/0");
        Fraction f3 = new Fraction(3,1);
        Fraction f4 = new Fraction(f1);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(f4.toString());
    }
}
