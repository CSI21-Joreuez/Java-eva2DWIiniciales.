package DAO.Notas;

import java.util.Date;

import jakarta.persistence.*;
@Entity
@Table(name="eva_tch_notas_evaluacion", schema="sc_evaluacion")
public class notas {

	public Integer getId_nota_evaluacion() {
		return id_nota_evaluacion;
	}
	public void setId_nota_evaluacion(Integer id_nota_evaluacion) {
		this.id_nota_evaluacion = id_nota_evaluacion;
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
	public notas() {
		super();
	}
	public notas(String md_uuid, Date md_fch, String cod_alumno, Integer nota_evaluacion, String cod_evaluacion) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}
	@Id
	@Column(name="id_nota_evaluacion")
	private Integer id_nota_evaluacion;
	
	@Column(name="md_uuid")
	private String md_uuid;
	@Column(name="md_fch")
	private Date md_fch;
	
	@Column(name="cod_alumno")
	private String cod_alumno;
	
	@Column(name="cod_alumno")
	private Integer nota_evaluacion;
	
	@Column(name="cod_alumno")
	private String cod_evaluacion;
	
	@Override
	public String toString() {
		return "notas [id_nota_evaluacion=" + id_nota_evaluacion + ", md_uuid=" + md_uuid + ", md_fch=" + md_fch
				+ ", cod_alumno=" + cod_alumno + ", nota_evaluacion=" + nota_evaluacion + ", cod_evaluacion="
				+ cod_evaluacion + "]";
	}
}
