package DAO.catNotas;

import jakarta.persistence.*;

@Entity
@Table(name="eva_cat_evaluacion",schema="sc_evaluacion")
public class catNotas {

	@Column(name="cod_evaluacion")
	private String cod_evaluacion;
	
	@Column(name="desc_evaluacion")
	private String desc_evaluacion;

	public catNotas(String cod_evaluacion, String desc_evaluacion) {
		super();
		this.cod_evaluacion = cod_evaluacion;
		this.desc_evaluacion = desc_evaluacion;
	}

	public catNotas() {
		super();
	}

	public String getCod_evaluacion() {
		return cod_evaluacion;
	}

	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}

	public String getDesc_evaluacion() {
		return desc_evaluacion;
	}

	public void setDesc_evaluacion(String desc_evaluacion) {
		this.desc_evaluacion = desc_evaluacion;
	}
	
	
}
