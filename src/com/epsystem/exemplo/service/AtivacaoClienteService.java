package com.epsystem.exemplo.service;

import com.epsystem.exemplo.modelo.Cliente;
import com.epsystem.exemplo.noticacao.NotificadorEmail;

public class AtivacaoClienteService {

	public void Ativar(Cliente cliente) {
		cliente.ativar();
		NotificadorEmail noticador = new NotificadorEmail();
		noticador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
