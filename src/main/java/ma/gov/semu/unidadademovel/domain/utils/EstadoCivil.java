package ma.gov.semu.unidadademovel.domain.utils;

public enum EstadoCivil {
	
	SOLTEIRA("Solteira"),
	CASADA("Casada"),
	UNIAO_ESTAVEL("Uniao Estavel"),
	DIVORCIADA("Divorciada"),
	VIUVA("Viuva");
	
	private String estadoCivil;
	
	private EstadoCivil(String estado) {
		this.estadoCivil = estado;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
}
