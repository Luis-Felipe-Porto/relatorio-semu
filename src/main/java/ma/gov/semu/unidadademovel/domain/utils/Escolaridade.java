package ma.gov.semu.unidadademovel.domain.utils;

public enum Escolaridade {
	
	ANALFABETA("Analfabeta"),
	ENS_FUN_INCOMPLETO("Ens Fun Incompleto"),
	ENS_FUN_COMPLETO("Ens Fun Completo"),
	ENS_MED_INCOMPLETO("Ens Medio Incompleto"),
	ENS_MED_COMPLETO("Ens Medio Completo"),
	SUPERIOR_INCOMPLETO("Ens Superior Incompleto"),
	SUPERIOR_COMPLETO("Ens Superior Completo");
	
	private String escolaridade;
	
	private Escolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
}
