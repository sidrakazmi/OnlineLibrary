package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/v1/")

public class ShipWreckController {

	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<ShipWreck> listAll() {
		return Repository.findAll();
	}
}
