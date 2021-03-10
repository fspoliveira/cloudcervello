package br.com.cloudcervello.celepar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cloudcervello.celepar.dto.request.CloudCervelloRequestDTO;
import br.com.cloudcervello.celepar.service.CloudCervelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/ticket")
@Api(value = "Cloud Cervello")
public class CloudCervello {

	@Autowired
	private CloudCervelloService cloudCervelloService;

	@PostMapping(value = "/create")
	@ApiOperation(value = "Create a ticket in Cervello")
	public ResponseEntity<?> createTicket(@RequestBody CloudCervelloRequestDTO cloudCervelloRequestDTO) {
		return new ResponseEntity<>(cloudCervelloService.createTicket(cloudCervelloRequestDTO), HttpStatus.OK);
	}

}
