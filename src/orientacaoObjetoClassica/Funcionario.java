package orientacaoObjetoClassica;

public class Funcionario {

	String nome;
	double salario;
	String dataDeEntrada;
	String departamento;
	String rg;
	Boolean estaAtivo;
	Data dataDeEntradaObj;

	public Funcionario() {

	}

	void recebeAumento(double aumento) {
		this.salario = this.salario + aumento;
	}

	String calculaGanhoAnual() {
		return "O ganho anual de " + this.nome + " �: " + (this.salario * 12);
	}
	
	void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Salario: "+this.salario);
		System.out.println("Data De Entrada: "+this.dataDeEntrada);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("RG: "+this.rg);
		System.out.println("estaAtivo: "+this.estaAtivo);
	}
	
	void mostraComData(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Salario: "+this.salario);
		System.out.println("Data De Entrada");
		System.out.println("Dia: "+this.dataDeEntradaObj.dia);
		System.out.println("Dia: "+this.dataDeEntradaObj.mes);
		System.out.println("Dia: "+this.dataDeEntradaObj.ano);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("RG: "+this.rg);
		System.out.println("estaAtivo: "+this.estaAtivo);
	}

}
