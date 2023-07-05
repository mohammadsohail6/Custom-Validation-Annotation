package com.sohail.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sohail.model.VoterDetail;

@RestController
public class TestController {

	@PostMapping("validate")
	public String validate(@Valid @RequestBody VoterDetail details) {
		return "Eligible for Vote";
	}
}
