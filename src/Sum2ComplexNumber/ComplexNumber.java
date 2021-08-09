package Sum2ComplexNumber;

public class ComplexNumber {
    double real;
    double image;
    ComplexNumber(double a,double b){
        this.real = a;
        this.image = b;
    }
    public static void main(String[] args){
       ComplexNumber z1 = new ComplexNumber(3,4);
       ComplexNumber z2 = new ComplexNumber(4,5);
       double sumreal = z1.real+ z2.real;
       double sumimage = z1.image + z2.image;
       System.out.println("Sum of 2 Complex Numbers is:\nZ = "+sumreal+" + "+sumimage+"i .");
    }
}