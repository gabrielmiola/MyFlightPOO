package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private int totalVoos = 0;
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	//ex 1 sobrecarga
	public Voo(Rota rota,Duration duracao){
		totalVoos++;
		this.rota = rota;
		this.duracao = duracao;
	}

	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		totalVoos++;
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO;
	}
	
	public Rota getRota() {
		return rota;
	}
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public Duration getDuracao() {
		return duracao;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

	public int getTotalVoos(){
		return totalVoos;
	}

	public String toString() { return rota + "- Data: " + datahora + " - Duração: " + duracao + " - Status: " + status + "\n";}
}
