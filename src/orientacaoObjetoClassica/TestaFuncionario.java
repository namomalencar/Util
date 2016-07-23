package orientacaoObjetoClassica;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.nome = "Hugo";
		f1.salario = 100;
		System.out.println("Salario atual: " + f1.salario);
		f1.recebeAumento(50);
		f1.calculaGanhoAnual();
		System.out.println("Salario depois do aumento: " + f1.salario);
		System.out.println(f1.calculaGanhoAnual());
		
		Funcionario f2 = new Funcionario();    
		f2.nome = "Danilo";
		f2.salario = 100;  
		Funcionario f3 = f2;
		
		
		
		/*
		 * f3.nome = "Danilo2";
		System.out.println(f2.nome);
		Funcionario f3 = new Funcionario();    
		f3.nome = "Danilo";
		f3.salario = 100;
		*/

		if (f2 == f3) {
		  System.out.println("iguais");
		} else {
		  System.out.println("diferentes");    
		}
		
		//f1.mostraComData();
		Data data = new Data(); // ligação!
		f1.dataDeEntradaObj = data;
		f1.dataDeEntradaObj.dia = 10;
		f1.dataDeEntradaObj.mes = 10;
		f1.dataDeEntradaObj.ano = 2016;
		f1.mostraComData();
		f1.dataDeEntradaObj.formatada();
		
	}

}
