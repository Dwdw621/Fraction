/**
 * Fraction class 
 * @Dylan Wang 
 * @Ver 0.0.0.0.1
 */

public class Fraction
{
    private int numer, denom;

    /**Default fraction
     */
    public Fraction(){
        numer = 0;
        denom = 1;
    }

    /**Fraction with int parameters
     */
    public Fraction(int num, int den){
        numer = num;
        setDenom(den);
    }

    /**Fraction with String parameter
     */
    public Fraction(String str){
        int i = str.indexOf("/");
        numer = Integer.parseInt(str.substring(0, i));
        setDenom(Integer.parseInt(str.substring(i+1)));
    }

    /**Fraction with Fraction object parameter
     */
    public Fraction(Fraction f){
        numer = f.numer;
        denom = f.denom;
    }

    /**Output method,
     * returns fraction as a string
     */
    public String toString(){
        return numer + "/" + denom;
    }

    /**Numerator getter
     */
    public int getNumer(){ return numer; }

    /**Denomenator getter
     */
    public int getDenom(){ return denom; }

    /**Numerator setter
     * 
     */
    public void setNumer(int num){ numer = num; }

    /**Denomenator setter
     */
    public void setDenom(int den){
        if(den != 0) {
            denom = den;
        } else {
            denom = 1;
            System.out.println("Denominator can't be zero!");
        }
    }

    public static int GCF(int n, int d){
        int min = Math.min(n, d);
        int max = Math.max(n, d);
        int r = 0;
        for(int i = max%min; i != 0; i = max%min){
            max = min;
            min = i;
            r=min;
        }
        //if(r==0) r = 1;
        return r;
    }

    public void reduce(){
        int gcf = GCF(numer, denom);
        numer /= gcf;
        denom /= gcf;
    }

    /**Multiply two fraction with two parameters
     */
    public static Fraction mult(Fraction a, Fraction b){
        Fraction ans = new Fraction(a.numer * b.numer, a.denom * b.denom);
        ans.reduce();
        return ans;
    }

    /**Multiply two fraction with one parameter
     */
    public void mult(Fraction a){
        numer *= a.numer;
        denom *= a.denom;
    }

    public static Fraction div(Fraction a, Fraction b){
        Fraction ans = new Fraction(a.numer * b.denom, a.denom * b.numer);
        ans.reduce();
        return ans;
    }
}
