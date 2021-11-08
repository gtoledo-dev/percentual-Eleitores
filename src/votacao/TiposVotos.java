package votacao;

public class TiposVotos {
	
	public Double totalEleitores;
	public Double validos;
	public Double votosBrancos;
	public Double nulos;
	
	public Double percentualVotosValidos() {
		return (validos / totalEleitores) * 100;
	}
	
	public Double percentualVotosBrancos() {
		return (votosBrancos / totalEleitores) * 100;
	}
	
	public Double percentualNulos() {
		return (nulos / totalEleitores) * 100;
	}
	
	@Override
	public String toString() {
		return "Percentual dos votos válidos: " + String.format("%.2f", percentualVotosValidos());
	}
	
	
	
	
	
	

}
