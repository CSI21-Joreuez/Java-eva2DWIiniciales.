package DTO;

import java.util.Date;

public class notasGenerales {

	@Override
	public String toString() {
		return "notasGenerales [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", cod_alumno=" + cod_alumno
				+ ", nota_evaluacion=" + nota_evaluacion + ", cod_evaluacion=" + cod_evaluacion + ", desc_evaluacion="
				+ desc_evaluacion + "]";
	}
	public String getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	public Date getMd_fch() {
		return md_fch;
	}
	public void setMd_fch(Date md_fch) {
		this.md_fch = md_fch;
	}
	public String getCod_alumno() {
		return cod_alumno;
	}
	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}
	public Integer getNota_evaluacion() {
		return nota_evaluacion;
	}
	public void setNota_evaluacion(Integer nota_evaluacion) {
		this.nota_evaluacion = nota_evaluacion;
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
	public notasGenerales(String md_uuid, Date md_fch, String cod_alumno, Integer nota_evaluacion,
			String cod_evaluacion, String desc_evaluacion) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
		this.desc_evaluacion = desc_evaluacion;
	}
	private String md_uuid;
	private Date md_fch;
	private String cod_alumno;
	private Integer nota_evaluacion;
	private String cod_evaluacion;
	private String desc_evaluacion;

}
