package pucrs.myflight.modelo;

public class Aeronave {
	private String codigo;
	private String descricao;
	private int capacidade;
	private int totalAeronaves = 0;

	public Aeronave(String codigo, String descricao, int capacidade) {
		totalAeronaves++;
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade(){
		return capacidade;
	}

	public int getTotalAeronaves(){
		return totalAeronaves;
	}

	public String toString() { return "Codigo: " + codigo + "- Descrição: " + descricao + " - Capacidade: " + capacidade + "\n";}
}
