package ma.gov.semu.unidadademovel.domain.utils;

public enum Etinia {
	NEGRA("Negra"),
	PARDA("Parda"),
	BRANCA("Branca"),
	AMARELA("Amarela"),
	INDIGENA("Idigina");
	
	private String etnia;
	
	private Etinia(String etinia) {
		this.etnia = etinia;
	}
	public String getEtnia() {
		return etnia;
	}
}
