package advancedbasic4;

import java.util.Date;

public class FoodProducts {

    private static int productCode;
    private String productName;
    private Date MfgDate, ExpDate;
    double pricePerUnit;

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public Date getMfgDate(){
        return MfgDate;
    }
    public void setMfgDate(){
        this.MfgDate = MfgDate;
    }
    public Date getExpDate(){
        return ExpDate;
    }
    public void setExpDate(){
        this.ExpDate = ExpDate;
    }

}
