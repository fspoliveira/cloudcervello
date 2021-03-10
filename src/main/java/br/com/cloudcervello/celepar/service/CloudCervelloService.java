package br.com.cloudcervello.celepar.service;

import org.springframework.stereotype.Service;

import br.com.cloudcervello.celepar.dto.request.CloudCervelloRequestDTO;
import br.com.cloudcervello.celepar.dto.response.CloudCervelloResponseDTO;

@Service
public class CloudCervelloService {

	public CloudCervelloResponseDTO createTicket(CloudCervelloRequestDTO CloudCervelloRequestDTO) {
		return CloudCervelloResponseDTO.builder().ticketNumber("TESTE").build();
	}	

}
