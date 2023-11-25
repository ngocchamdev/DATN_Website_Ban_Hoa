package com.fpoly.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpoly.model.Account;

import com.fpoly.service.AccountService;



@RestController
@RequestMapping("/rest")
public class AdminAccountRestController {
	@Autowired
	AccountService accservice;
		
	@GetMapping("/account")
	public ResponseEntity<List<Account>> getAll(Model model){
		return ResponseEntity.ok(accservice.findAll());
	}

}
