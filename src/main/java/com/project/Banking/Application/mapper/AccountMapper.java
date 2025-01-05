package com.project.Banking.Application.mapper;


import com.project.Banking.Application.dto.AccountDto;
import com.project.Banking.Application.entity.Account;

public class AccountMapper {
    public static  Account mapToAccount(AccountDto accountDto){

        Account account=new Account(
//                accountDto.getId(),
//                accountDto.getAccountHolderName(),
//                accountDto.getBalance()
                accountDto.id(),
                accountDto.accountHolderName(),
                accountDto.balance()
        );


                return account;
    }
    public static   AccountDto mapToAccountDto(Account account){
        AccountDto accountDto=new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                   account.getBalance()
        );
        return accountDto;
    }



}
