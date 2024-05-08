package com.qtprojectbackend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qtprojectbackend.modal.AccountHolder;
@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolder,UUID> {

    AccountHolder findByEmail(String email);

    AccountHolder findByEmailAndPassword(String email, String password);

}
