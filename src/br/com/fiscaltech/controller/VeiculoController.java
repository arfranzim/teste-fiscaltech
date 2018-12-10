package br.com.fiscaltech.controller;

import org.springframework.stereotype.Controller;

@Controller
public class VeiculoController {

	public String execute() {
		System.out.println("..executando veiculo controller..");
		return "ok";
	}
}
