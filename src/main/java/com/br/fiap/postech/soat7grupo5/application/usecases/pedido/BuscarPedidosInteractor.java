package com.br.fiap.postech.soat7grupo5.application.usecases.pedido;

import java.util.List;

import com.br.fiap.postech.soat7grupo5.application.gateways.PedidoGateway;
import com.br.fiap.postech.soat7grupo5.domain.entity.Pedido;

public class BuscarPedidosInteractor {

	private PedidoGateway pedidoGateway;
	
	public BuscarPedidosInteractor(PedidoGateway pedidoGateway) {
		this.pedidoGateway = pedidoGateway;
	}

	public List<Pedido> buscarPedidos() {
		return pedidoGateway.buscarPedidos();
	}
}
