public class Municipio {
	private String uf;
	private int cod_uf;
	private int cod_mun;
	private String nome_mun;
	private int pop;
	
	public Municipio(String est, int codest, int cod, String nome, int hab) {
		uf = est;
		cod_uf = codest;
		cod_mun = cod;
		nome_mun = nome;
		pop = hab;
	}

	public String getUf() {
		return uf;
	}

	public int getCodigoUf() {
		return cod_uf;
	}

	public int getCodMunicipio() {
		return cod_mun;
	}

	public String getNomeMunicipio() {
		return nome_mun;
	}

	public int getPopulacao() {
		return pop;
	}

	@Override
	public String toString() {
		return uf + ", " +  cod_uf + ", " + cod_mun + ", " + nome_mun + ", " + pop;
	}



    public int compareTo(município populacao){
        if(pop<popuacao.pop)
        return 1;
        ese if (pop<populacao.pop)
        return -1;
        return 0;

    }
	
	
}