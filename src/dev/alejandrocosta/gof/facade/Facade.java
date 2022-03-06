package dev.alejandrocosta.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade 
{
	public void migrarCliente(String nome, String cpf)
	{
		
		String cidade = CepApi.getInstancia().recuperarCidade(cpf);
		String estado = CepApi.getInstancia().recuperarEstado(cpf);
		
		CrmService.gravarCliente(nome, cpf, cidade, estado);
	}
}
