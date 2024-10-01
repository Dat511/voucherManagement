/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vouchermanagement;

/**
 *
 * @author Admin
 */
import java.util.List;

public class PurchaseOrder {
    private String PO_Id;
    private String Cus_Id;
    private String Vendor_Id;
    private List<Item> ListItems;
    private String createdOn;
    private String createdBy;
    private int status;
    private String deliveryDate;

    public PurchaseOrder(String PO_Id, String Cus_Id, String Vendor_Id, List<Item> ListItems,
            String createdOn, String createdBy, int status, String deliveryDate) {
        this.PO_Id = PO_Id;
        this.Cus_Id = Cus_Id;
        this.Vendor_Id = Vendor_Id;
        this.ListItems = ListItems;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.status = status;
        this.deliveryDate = deliveryDate;
    }

   

    public String getPO_Id() {
        return PO_Id;
    }

    public void setPO_Id(String PO_Id) {
        this.PO_Id = PO_Id;
    }

    public String getCus_Id() {
        return Cus_Id;
    }

    public void setCus_Id(String Cus_Id) {
        this.Cus_Id = Cus_Id;
    }

    public String getVendor_Id() {
        return Vendor_Id;
    }

    public void setVendor_Id(String Vendor_Id) {
        this.Vendor_Id = Vendor_Id;
    }

    public List<Item> getListItems() {
        return ListItems;
    }

    public void setListItems(List<Item> ListItems) {
        this.ListItems = ListItems;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{\n"
                + "  PO_Id='" + PO_Id + "',\n"
                + "  Cus_Id='" + Cus_Id + "',\n"
                + "  Vendor_Id='" + Vendor_Id + "',\n"
                + "  ListItems=\n" + ListItems + ",\n"
                + "  createdOn='" + createdOn + "',\n"
                + "  createdBy='" + createdBy + "',\n"
                + "  status=" + status + ",\n"
                + "  deliveryDate='" + deliveryDate + "'\n"
                + '}';
    }
}