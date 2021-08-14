package advancedbasic2;

public class Vehicles {

    private int serial, engineCap;
    private String owner, describe;
    double price;

    void displayTax(){

        System.out.printf("%-10d %-20s %-10s %,-1.2f \t %5dcc\t %,10.2f\n",
                serial,
                owner,
                describe,
                price,
                engineCap,
                taxing());
    }

    Vehicles(){ }
    Vehicles(int serial, String owner,String describe, double price, int engineCap){
        this.serial = serial;
        this.owner = owner;
        this.describe = describe;
        this.price = price;
        this.engineCap = engineCap;
    }
    public int getSerial(){
        return serial;
    }
    public void setSerial(int serial){
        this.serial = serial;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getDescribe(){
        return describe;
    }
    public void setDescribe(String describe){
        this.describe = describe;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getEngineCap(){
        return engineCap;
    }
    public void setEngineCap(int engineCap){
        this.engineCap = engineCap;
    }

    public double taxing(){
        double tax;
        if(engineCap<100)
            tax = price*0.01;
        else if(engineCap <=200)
            tax = price*0.03;
        else
            tax = price*0.05;
        return tax;
    }
}
