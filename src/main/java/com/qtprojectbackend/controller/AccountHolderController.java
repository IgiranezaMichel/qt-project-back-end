package com.qtprojectbackend.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import com.qtprojectbackend.modal.AccountHolder;
import com.qtprojectbackend.services.AccountHolderService;

@Controller
public class AccountHolderController {
@Autowired private AccountHolderService accountHolderService;
@MutationMapping
public String createAccount(@Argument(name = "accountHolderInput")AccountHolder accountHolder){
    return accountHolderService.saveAccount(accountHolder);
}
@MutationMapping
public String deleteAccount(@Argument(name = "id")UUID id){
    return accountHolderService.deleteAccount(id);
}
@MutationMapping
public AccountHolder findByEmail(@Argument(name = "email")String email){
    return accountHolderService.findByEmail(email);
}
@MutationMapping
public AccountHolder login(@Argument(name = "email")String email,@Argument(name = "password")String password){
    return accountHolderService.login(email,password);
}
}
