package application01;

import java.util.Date;

import entities.Pedido;
import entities.enums.StatusPedido;

public class Program01 {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(123, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		StatusPedido sp1 = StatusPedido.ENTREGUE;
		StatusPedido sp2 = StatusPedido.valueOf("ENVIADO");
		
		System.out.println(sp1);
		System.out.println(sp2);
	}

}
