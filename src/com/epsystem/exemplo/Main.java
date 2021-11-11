package com.epsystem.exemplo;

import com.epsystem.exemplo.modelo.Cliente;
import com.epsystem.exemplo.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@xyz.com", "34999-4455");
		Cliente maria = new Cliente("maria", "maria@xut.com", "934444-2233");
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();
		ativacaoCliente.Ativar(joao);
		ativacaoCliente.Ativar(maria);
	}
}
