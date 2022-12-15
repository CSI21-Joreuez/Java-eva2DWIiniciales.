package Controlador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.Notas.notas;
import DTO.notasGenerales;
import Implementaciones.Querys;

public class AppControlador {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Querys consulta = context.getBean(Querys.class);
		consulta.buscarPorEva("PR");
		System.out.println(consulta.buscarPorEva("PR"));
		}
	
	
	
}
