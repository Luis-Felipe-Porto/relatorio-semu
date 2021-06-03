package ma.gov.semu.unidadademovel.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ma.gov.semu.unidadademovel.domain.utils.Deficiencia;
import ma.gov.semu.unidadademovel.domain.utils.Escolaridade;
import ma.gov.semu.unidadademovel.domain.utils.EstadoCivil;
import ma.gov.semu.unidadademovel.domain.utils.Etinia;
import ma.gov.semu.unidadademovel.domain.utils.Renda;



@Entity
public class FichaCadastro {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;
	@Enumerated(EnumType.STRING)
	private Renda renda;
	@Enumerated(EnumType.STRING)
	private Escolaridade escolariade;
	@Enumerated(EnumType.STRING)
	private Deficiencia deficiencia;
	@Enumerated(EnumType.STRING)
	private Etinia etinia;
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public Renda getRenda() {
		return renda;
	}
	public Deficiencia getDeficiencia() {
		return deficiencia;
	}
	public Escolaridade getEscolariade() {
		return escolariade;
	}
	public Etinia getEtinia() {
		return etinia;
	}
}
