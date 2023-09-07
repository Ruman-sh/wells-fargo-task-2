package com.wellsfargo.counselor.entity;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Portfolio {
      @Id
    @GeneratedValue()
    private long PortfolioId;

    @OneToOne()
    private Client clientId;

    @Column(nullable = false)
    private String others1;

    @Column(nullable = false)
    private String others2;

    @Column(nullable = false)
    private String others3;

    protected Portfolio() {

    }
     public Portfolio(String others1, String others2, String others3) {
        this.others1 = others1;
        this.others2 = others2;
        this.others3 = others3;
    }

    public Long getPortfolioId() {
        return PortfolioId;
    }

    public String getothers1() {
        return others1;
    }

    public void setothers1(String other1) {
        this.others1 = other1;
    }

    public String getothers2() {
        return others2;
    }

    public void setothers2(String others2) {
        this.others2 = others2;
    }

    public String getothers3() {
        return others3;
    }

    public void setPhone(String others3) {
        this.others3 = others3;
    }

}
