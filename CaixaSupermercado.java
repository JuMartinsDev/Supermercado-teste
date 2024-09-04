package br.fiap.model;

public class CaixaSupermercado {
	
	private long id;
	private double  imposto;
	private double total;
	private String cpf;
	private int quantidade;
	
	//armazenar a descrição dos produtos
	private String cupomFiscal;

	public CaixaSupermercado(String cpf) {
		this.cpf = cpf;
		this.imposto=0;
		this.total=0;
		this.quantidade=0;
		this.cupomFiscal="Super FIAP";
	}

	public long getId() {
		return id;
	}

	public double getImposto() {
		return imposto;
	}

	public double getTotal() {
		return total;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getCupomFiscal() {
		return cupomFiscal;
	}

	public void adiciona(int qtd, double valor, String produto) {
		this.quantidade+=qtd;
		this.total+=qtd*valor;
		
		String linha = String.format("%s\t%d X  %.2f\t %.2f", produto, qtd, valor, qtd*valor);
		this.cupomFiscal=cupomFiscal + "\n" + linha;
	}
	
	public void adiciona(int qtd , double valor,
			String produto , String classificacao ) {
		
		this.adiciona(qtd, valor, produto);
		
		double aux = qtd*valor;
		double aliquota=0;

		if(classificacao.equals("alimento")) {
			aliquota=3;
		}else {
			if(classificacao.equals("limpeza")) {
				aliquota=5;
			}else {
				if(classificacao.equals("fumo")) {
					aliquota=9;
				}else {
					if(classificacao.equals("bebida")) {
						aliquota=8;
					}else {
						if(classificacao.equals("higiene")) {
							aliquota=4;
						}else {
						if(classificacao.equals("outro")) {
							aliquota=10;
							
					}}}}}}
		this.imposto=this.imposto+aux*aliquota/100;
		}
	

}
