package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia){
        empresas.add(cia);
    }

    public ArrayList<CiaAerea> listarTodas(){
        return empresas;
    }

    public CiaAerea buscarPorCodigo(String cod){
        for(CiaAerea a: empresas){
            if(a.getCodigo() == cod)
            return a;
        }
        return null;
	}
	
	public CiaAerea buscarPorNome(String cod){
        for(CiaAerea a: empresas){
            if(a.getNome() == cod)
            return a;
        }
        return null;
    }

    public String toString() {
        String aux = "\nCiasAereas\n- - - - - - - - - - -\n";
        for (CiaAerea a : empresas) {
            aux = aux + a.toString() + "\n";
        }
        return aux;
    }
}
