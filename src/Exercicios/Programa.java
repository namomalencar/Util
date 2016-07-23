package Exercicios;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {

		//Primeiro Cliente
		Cliente c1;
		c1 = new Cliente();
		c1.email = "namomalencar@gmail.com";

		//Segundo Cliente
		Cliente c2;
		c2 = new Cliente();
		c2.email = "segundo@teste.com";

		c2.mostrarEmailDeDoisClientes(c1, c2);
		System.out.println("=================================");

		//Terceiro Cliente
		Cliente c3;
		c3 = new Cliente();
		c3.email = "terceiro@teste.com";

		c3.mostrarEmailDeTresClientes(c1, c2, c3);
		System.out.println("=================================");
		
		//Array
		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		Cliente c4;
		c4 = new Cliente();
		c4.email = "quarto@teste.com";
		clientes.add(c4);
		Cliente c5;
		c5 = new Cliente();
		c5.email = "quinto@teste.com";
		clientes.add(c5);
		System.out.println("=================================");
		c5.mostrarEmailViaArray(clientes);
	}

}
