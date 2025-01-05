package com.project.Banking.Application.controller;


import com.project.Banking.Application.dto.AccountDto;
import com.project.Banking.Application.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private AccountService accountService;


    public AccountController(AccountService accountService) {
       this.accountService=accountService;
    }


    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        System.out.println("Account created");
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);

    }

    //Get account
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id) {
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }

    //Deposit
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id, @RequestBody Map<String,Double>request){
        Double amount=request.get("amount");
        AccountDto accountDto=accountService.deposit(id,amount);
    return ResponseEntity.ok(accountDto);
    }

    //withdraw
    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id, @RequestBody Map<String,Double>request) {
        Double amount = request.get("amount");
        AccountDto accountDto = accountService.withdraw(id, amount);
        return ResponseEntity.ok(accountDto);
    }



    //Get all accounts
        @GetMapping
        public ResponseEntity<List<AccountDto>> getAllAccounts(){
            List<AccountDto>accounts=accountService.getAllAccounts();
            return ResponseEntity.ok(accounts);
        }

        //delete account
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
        return ResponseEntity.ok("The account is deleted sucessfully");
    }
    }






