package com.project.Banking.Application.dto;

import lombok.*;


//@Getter
//@Setter
//@NoArgsConstructor

//@Getter
//@AllArgsConstructor
//@Data
//we can also use record class for this
/*public class AccountDto {

    public  AccountDto(Long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    private Long id;
    private String accountHolderName;
    private double balance;

    public AccountDto() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}*/
public record AccountDto(Long id,String accountHolderName,double balance){
    //the fields are immutable can't be changge
}


