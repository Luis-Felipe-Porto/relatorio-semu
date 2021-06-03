package ma.gov.semu.unidadademovel.domain.utils;

public enum Renda {
	
	SEM("Sem"),
	BOLSA_FAMILIA ("Bolsa Familia"),
	UM_SALARIO_MIN ("Um Salario Minimo"),
	ATE_TRES_SALARIO_MIN ("Ate Tres Salario Minimo"),
	MAIS_TRES_SALARIO_MIN ("Mais de Tres Salario Minimo");
	
	private String renda;
	
	private Renda(String renda) {
		this.renda = renda;
	}
	public String getRenda() {
		return renda;
	}
}
