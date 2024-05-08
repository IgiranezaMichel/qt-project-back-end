package com.qtprojectbackend.services;

import java.util.UUID;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qtprojectbackend.modal.AccountHolder;
import com.qtprojectbackend.repository.AccountHolderRepository;

@Service
public class AccountHolderService {
@Autowired private AccountHolderRepository accountHolderRepository;
public String saveAccount(AccountHolder accountHolder){
   try {
    accountHolder.setPassword(BCrypt.hashpw(accountHolder.getPassword(), BCrypt.gensalt()));
    return accountHolderRepository.save(accountHolder).getName()+" saved successful";
   } catch (Exception e) {
    return e.getMessage();
   }
}
public String deleteAccount(UUID id){
    try {
        AccountHolder accountHolder=this.findById(id);
        accountHolderRepository.delete(accountHolder);
        return accountHolder.getName()+" Account deleted successful";
    } catch (Exception e) {
       return "Account not found";
    }
}
public AccountHolder findById(UUID id){
    return accountHolderRepository.findById(id).orElseThrow();
}
public AccountHolder findByEmail(String email){
    return accountHolderRepository.findByEmail(email);
}
public AccountHolder login(String email,String password){
   AccountHolder accountHolder= accountHolderRepository.findByEmail(email);   
    return accountHolder;
}
}
