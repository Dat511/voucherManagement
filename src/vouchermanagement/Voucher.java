/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vouchermanagement;

/**
 *
 * @author Admin
 */
public class Voucher {
    private String VID;                
    private int discountInPercentage;  
    private int maxDiscount;           
    private int minPOValue;            
    private String applyFromDate;      
    private String applyToDate;        
    private int applyToCusType;        

  
    public Voucher(String VID, 
            int discountInPercentage,
            int maxDiscount, 
            int minPOValue,
            String applyFromDate,
            String applyToDate,
            int applyToCusType) {
        this.VID = VID;
        this.discountInPercentage = discountInPercentage;
        this.maxDiscount = maxDiscount;
        this.minPOValue = minPOValue;
        this.applyFromDate = applyFromDate;
        this.applyToDate = applyToDate;
        this.applyToCusType = applyToCusType;
    }

   
    public String getVID() {
        return VID;
    }

    public void setVID(String VID) {
        this.VID = VID;
    }

    public int getDiscountInPercentage() {
        return discountInPercentage;
    }

    public void setDiscountInPercentage(int discountInPercentage) {
        this.discountInPercentage = discountInPercentage;
    }

    public int getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(int maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public int getMinPOValue() {
        return minPOValue;
    }

    public void setMinPOValue(int minPOValue) {
        this.minPOValue = minPOValue;
    }

    public String getApplyFromDate() {
        return applyFromDate;
    }

    public void setApplyFromDate(String applyFromDate) {
        this.applyFromDate = applyFromDate;
    }

    public String getApplyToDate() {
        return applyToDate;
    }

    public void setApplyToDate(String applyToDate) {
        this.applyToDate = applyToDate;
    }

    public int getApplyToCusType() {
        return applyToCusType;
    }

    public void setApplyToCusType(int applyToCusType) {
        this.applyToCusType = applyToCusType;
    }

   
    @Override
    public String toString() {
        return "Voucher{\n" +
                "  VID='" + VID + "',\n" +
                "  discountInPercentage=" + discountInPercentage + "%,\n" +
                "  maxDiscount=" + maxDiscount + ",\n" +
                "  minPOValue=" + minPOValue + ",\n" +
                "  applyFromDate='" + applyFromDate + "',\n" +
                "  applyToDate='" + applyToDate + "',\n" +
                "  applyToCusType=" + applyToCusType + "\n" +
                '}';
    }
}
