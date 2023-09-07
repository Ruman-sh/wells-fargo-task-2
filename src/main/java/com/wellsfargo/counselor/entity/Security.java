package com.wellsfargo.counselor.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
      @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne()
    private Portfolio PortfolioId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasedate;

    @Column(nullable = false)
    private String purchaseprice;

     @Column(nullable = false)
    private String quantity;

    protected Security() {

    }
     public Security(String Name, String category, String purchasedate, String purchaseprice, String quantity) {
        this.Name = Name;
        this.category = category;
        this.purchasedate = purchasedate;
        this.purchaseprice = purchaseprice;
    }

    public Long getsecurityId() {
        return securityId;
    }

    public String getName() {
        return Name;
    }

    public void setFirstName(String Name) {
        this.Name = Name;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getpurchasedate() {
        return purchasedate;
    }

    public void setpurchasedate(String purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getpurchaseprice() {
        return purchaseprice;
    }

    public void setpurchaseprice(String purchaseprice) {
        this.purchaseprice = purchaseprice;
    }
     public String getquantity() {
        return quantity;
    }

    public void quantity(String quantity) {
        this.quantity = quantity;
    }
}
