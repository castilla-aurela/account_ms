package com.misiontic.account_ms.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Account {
    @Id
    private String userId;
    private Integer balance;
    private Date LastChange;

    public Account(String userId, Integer balance, Date lastChange) {
        this.userId = userId;
        this.balance = balance;
        LastChange = lastChange;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Date getLastChange() {
        return LastChange;
    }

    public void setLastChange(Date lastChange) {
        LastChange = lastChange;
    }
}
