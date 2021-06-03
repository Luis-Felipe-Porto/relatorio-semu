package ma.gov.semu.unidadademovel.domain.utils;


public enum Deficiencia {
	MOTORA("Motora"),
	VISUAL("Visual"),
	MENTAL("Mental"),
	AUDITIVA("Auditiva");
	
	private String deficiencia;
	
	private Deficiencia(String df) {
		this.deficiencia =df;
	}
	public String getDeficiencia() {
		return deficiencia;
	}
}
