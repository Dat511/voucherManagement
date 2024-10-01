/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vouchermanagement;

/**
 *
 * @author Admin
 */

public class ShopeeVoucher extends Voucher {

   
    public ShopeeVoucher(String VID,
            int discountInPercentage,
            int maxDiscount,
            int minPOValue,
            String applyFromDate,
            String applyToDate,
            int applyToCusType) {
        super(VID, 
                discountInPercentage,
                maxDiscount, 
                minPOValue, 
                applyFromDate, 
                applyToDate, 
                applyToCusType);
    }

    
    @Override
    public String toString() {
        return "ShopeeVoucher{\n" + super.toString() + "}";
    }
}