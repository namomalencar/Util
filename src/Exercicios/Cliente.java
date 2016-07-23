package Exercicios;

import java.util.ArrayList;

public class Cliente {
	String codigo;
	String nome;
	int idade;
	String CPF;
	String email;

	void mostrarEmailDeDoisClientes(Cliente c1, Cliente c2) {
		System.out.println(c1.email + ", " + c2.email);
	}

	void mostrarEmailDeTresClientes(Cliente c1, Cliente c2, Cliente c3) {
		System.out.println(c1.email + ", " + c2.email + ", " + c3.email);
	}

	void mostrarEmailDeUmCliente(Cliente c1) {
		System.out.println(c1.email);
	}

	void mostrarEmailViaArray(ArrayList<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			cliente.mostrarEmailDeUmCliente(cliente);
		}
	}

}
