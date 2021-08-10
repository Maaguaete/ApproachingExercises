package sum2complexnumber;

public class SumComplexNumberGiven {
    double real;
    double image;
    SumComplexNumberGiven(double a, double b){
        this.real = a;
        this.image = b;
    }
    public static void main(String[] args){
       SumComplexNumberGiven z1 = new SumComplexNumberGiven(3,4);
       SumComplexNumberGiven z2 = new SumComplexNumberGiven(4,5);
       double sumreal = z1.real+ z2.real;
       double sumimage = z1.image + z2.image;
       System.out.println("Sum of 2 Complex Numbers is:\nZ = "+sumreal+" + "+sumimage+"i .");
    }
}