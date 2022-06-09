package com.init.usuario.rest;

import com.init.usuario.dao.AccountsDAO;
import com.init.usuario.entitys.Account;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("accounts")
public class AccountsRest {
    
    @Autowired
	private AccountsDAO AccountsDAO;

	@GetMapping
	public ResponseEntity<List<Account>> getAccount(){
		List<Account> account = AccountsDAO.findAll();
		return ResponseEntity.ok(account);
	}

	@RequestMapping(value = "{accountId}")
	public ResponseEntity<Account> getAccountById(@PathVariable("accountId") Long accountId){
		try {
			Optional<Account> optionalAccount = AccountsDAO.findById(accountId);
			return ResponseEntity.ok(optionalAccount.get());
		}catch (Exception exception){
			return ResponseEntity.noContent().build();
		}
		/*if (optionalAccount.isPresent()){
			return ResponseEntity.ok(optionalAccount.get());
		} else {
			return ResponseEntity.noContent().build();
		}*/
	}

	@PostMapping 
	public ResponseEntity<Account> createAccount(@RequestBody Account account){
		try {
			Account newAccount = AccountsDAO.save(account);
			return ResponseEntity.ok(newAccount);
		}catch (Exception exception){
			System.out.println(exception);
			return ResponseEntity.noContent().build();
		}
	}

	@DeleteMapping(value = "{accountId}")
	public ResponseEntity<Void> deleteAccount(@PathVariable("accountId") Long accountId){
		try {
			AccountsDAO.deleteById(accountId);
			return ResponseEntity.ok(null);
		}catch (Exception exception){
			System.out.println(exception);
			return ResponseEntity.noContent().build();
		}
	}

	@PutMapping
	public ResponseEntity<Account> updateAccount(@RequestBody Account account){
		try {
			Optional<Account> optionalAccount = AccountsDAO.findById(account.getId());
			Account updateAccount = optionalAccount.get();
			updateAccount.setNumber(account.getNumber());
			updateAccount.setType(account.getType());
			AccountsDAO.save(updateAccount);
			return ResponseEntity.ok(updateAccount);
		}catch (Exception exception){
			System.out.println(exception);
			return ResponseEntity.noContent().build();
		}
		/*if (optionalAccount.isPresent()){
			Account updateAccount = optionalAccount.get();
			updateAccount.setNumber(account.getNumber());
			updateAccount.setType(account.getType());
			AccountsDAO.save(updateAccount);
			return ResponseEntity.ok(updateAccount);
		} else {
			return ResponseEntity.noContent().build();
		}*/
	}
}
