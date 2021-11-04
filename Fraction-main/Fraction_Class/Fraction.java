/**
 * Fraction class 
 * @Dylan Wang 
 * @Ver 0.0.0.0.1
 */

public class Fraction
{
    private int numer, denom;

    /**Default fraction,
     * 0/1
     */
    public Fraction(){
        numer = 0;
        denom = 1;
    }

    /**Fraction with int parameters,
     * numerator/denomenator
     */
    public Fraction(int num, int den){
        numer = num;
        setDenom(den);
    }

    /**Fraction with String parameter,
     * "numerator/denomenator"
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

    /**Numerator getter,
     * int parameter
     */
    public int getNumer(){ return numer; }

    /**Denomenator getter,
     * int parameter
     */
    public int getDenom(){ return denom; }

    /**Numerator setter,
     * int parameter
     * 
     */
    public void setNumer(int num){ numer = num; }

    /**Denomenator setter,
     * int parameter
     */
    public void setDenom(int den){
        if(den != 0) {
            denom = den;
        } else {
            denom = 1;
            System.out.println("Denominator can't be zero!");
        }
    }

    /**Output method,
     * returns fraction as a string
     */
    public String toString(){
        return numer + "/" + denom;
    }
}
