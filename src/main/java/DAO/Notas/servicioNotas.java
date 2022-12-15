package DAO.Notas;

import java.util.List;

public interface servicioNotas {

	public void insertarNota(notas nota);
	public List<notas> buscarPorCod(int cod_alumno);
	public List<notas> buscarPorEva(String cod_evaluacion );


}
