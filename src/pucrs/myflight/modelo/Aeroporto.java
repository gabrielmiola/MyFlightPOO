package pucrs.myflight.modelo;

public class Aeroporto {
	private String codigo;
	private String nome;
	private Geo loc;
	private int totalAeroportos = 0;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		totalAeroportos++;
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public Aeroporto(String codigo, String nome, double latitude, double longitude) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = new Geo(latitude, longitude);
	}
	

	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}

	public int getTotalAeroportos() {
		return totalAeroportos;
	}

	@Override
	public String toString() { return nome + "(" + codigo + ")" + " : " + loc + "\n";}
}
