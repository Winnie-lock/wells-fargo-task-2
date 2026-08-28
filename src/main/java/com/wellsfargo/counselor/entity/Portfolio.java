package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "portfolios")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "portfolio_id")
    private Long portfolioId;

    @Column(name = "portfolio_name", nullable = false)
    private String portfolioName;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "portfolio_type")
    private String portfolioType;

    @Column(name = "currency")
    private String currency;

    @Column(name = "uptime")
    private String uptime;

    @Column(name = "current_value")
    private Double currentValue;

    @Column(name = "target_return")
    private Double targetReturn;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    protected Portfolio() {}

    public Portfolio(String portfolioName, LocalDate createdDate, String portfolioType,
                     String currency, String uptime, Double currentValue, Double targetReturn, Client client) {
        this.portfolioName = portfolioName;
        this.createdDate = createdDate;
        this.portfolioType = portfolioType;
        this.currency = currency;
        this.uptime = uptime;
        this.currentValue = currentValue;
        this.targetReturn = targetReturn;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getPortfolioType() {
        return portfolioType;
    }

    public void setPortfolioType(String portfolioType) {
        this.portfolioType = portfolioType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    public Double getTargetReturn() {
        return targetReturn;
    }

    public void setTargetReturn(Double targetReturn) {
        this.targetReturn = targetReturn;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
