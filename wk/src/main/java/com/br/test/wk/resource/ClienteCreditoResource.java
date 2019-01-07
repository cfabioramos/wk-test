package com.br.test.wk.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.test.wk.model.ClienteCreditoModel;
import com.br.test.wk.repository.ClienteCreditoRepository;
import com.br.test.wk.resource.to.ClienteCreditoTO;

@RestController("/clienteCredito")
public class ClienteCreditoResource {
	
	@Autowired
	private ClienteCreditoRepository repository;

	@PostMapping
	public @ResponseBody ClienteCreditoModel post(@RequestBody ClienteCreditoTO clienteCreditoTO) {
		
		System.out.println(clienteCreditoTO);
		
		ClienteCreditoModel model = clienteCreditoTO.getModel();
		
		System.out.println(model);
		
		repository.save(model);
		
		return model;
	}
	
}
