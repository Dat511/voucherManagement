package vouchermanagement;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

public class ShipVoucher extends Voucher {

  
    public ShipVoucher(String VID,
            int discountInPercentage,
            int maxDiscount,
            int minPOValue,
            String applyFromDate
            , String applyToDate,
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
        return "ShipVoucher{\n" + super.toString() + "}";
    }
}
