package DTO.DtoToDAO;

import DAO.Notas.notas;
import DTO.notasGenerales;

public class ToDAO {
	
	public static notas notasGeneralesToDAO( notasGenerales General)
	{
		notas notasDTO = new notas();
		notasDTO.setMd_uuid(General.getMd_uuid());
		notasDTO.setMd_fch(General.getMd_fch());
		notasDTO.setCod_alumno(General.getCod_alumno());
		notasDTO.setNota_evaluacion(General.getNota_evaluacion());
		notasDTO.setCod_evaluacion(General.getCod_evaluacion());

		return notasDTO;
	}

}
