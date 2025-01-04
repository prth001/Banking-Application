package com.project.Banking.Application.service;

import com.project.Banking.Application.dto.AccountDto;
import com.project.Banking.Application.entity.Account;

public interface AccounService {
    AccountDto createAccount(AccountDto account);
}
