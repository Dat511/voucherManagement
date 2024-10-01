/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vouchermanagement;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      
        Address transAddress = new Address("123 Main St", "CityA", "StateA", "12345");
        Address shipAddress = new Address("456 Oak St", "CityB", "StateB", "67890");

       
        Customer customer = new Customer("C01", "Dat", transAddress, shipAddress, 1, "0357***104");

        
        System.out.println(customer);

       
        Address transAddress2 = new Address("789 Pine St", "CityC", "StateC", "13579");
        Address shipAddress2 = new Address("321 Elm St", "CityD", "StateD", "24680");

        Customer customer2 = new Customer("C02", "Duong", transAddress2, shipAddress2, 0, "00123***456");

 
        System.out.println(customer2);

      
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            items.add(new Item(
                "P" + i,                         
                "Item " + i,                        
                "Unit " + i,                       
                new Random().nextDouble() * 100,    
                new String[]{"http://www.youtube.com/image" + i},  
                "Description for item " + i       
            ));
        }

        
        List<PurchaseOrder> purchaseOrders = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            purchaseOrders.add(new PurchaseOrder(
                "PO" + i,                          
                "Cus" + i,                        
                "Vendor" + i,                    
                items,                          
                "2024-09-" + (i + 1),               
                "Admin",                           
                new Random().nextInt(2),            
                "2024-10-" + (i + 1)                
            ));
        }

        
        System.out.println(items.get(0));
        System.out.println(purchaseOrders.get(0));

      
        ShopeeVoucher shopeeVoucher1 = new ShopeeVoucher(
            "SHPV01", 20, 50000, 200000, "2024-01-01", "2024-12-31", 1
        );
        ShopeeVoucher shopeeVoucher2 = new ShopeeVoucher(
            "SHPV02", 30, 100000, 300000, "2024-02-01", "2024-12-31", 1
        );

       
        ShopVoucher shopVoucher1 = new ShopVoucher(
            "SPV01", 15, 30000, 150000, "2024-01-01", "2024-06-30", 0
        );
        ShopVoucher shopVoucher2 = new ShopVoucher(
            "SPV02", 25, 50000, 200000, "2024-03-01", "2024-12-31", 1
        );
        ShopVoucher shopVoucher3 = new ShopVoucher(
            "SPV03", 10, 20000, 100000, "2024-01-01", "2024-05-31", 0
        );

      
        ShipVoucher shipVoucher1 = new ShipVoucher(
            "SHPV03", 10, 20000, 100000, "2024-01-01", "2024-12-31", 1
        );
        ShipVoucher shipVoucher2 = new ShipVoucher(
            "SHPV04", 15, 30000, 150000, "2024-02-01", "2024-08-31", 0
        );
        ShipVoucher shipVoucher3 = new ShipVoucher(
            "SHPV05", 5, 10000, 50000, "2024-04-01", "2024-12-31", 1
        );

   
        System.out.println(shopeeVoucher1);
        System.out.println(shopeeVoucher2);

        System.out.println(shopVoucher1);
        System.out.println(shopVoucher2);
        System.out.println(shopVoucher3);

        System.out.println(shipVoucher1);
        System.out.println(shipVoucher2);
        System.out.println(shipVoucher3);
    }
}