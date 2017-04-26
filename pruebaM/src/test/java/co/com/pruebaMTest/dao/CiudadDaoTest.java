package co.com.pruebaMTest.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import co.com.pruebaM.dao.CiudadDao;
import co.com.pruebaM.dao.EstadoDao;
import co.com.pruebaM.entyties.*;
public class CiudadDaoTest {
	
//	@Test
//	@Ignore
//	public void salvar(){
//		
//		EstadoDao dao = new EstadoDao();
//		
//		Estado estado = dao.buscar(3L);
//		
//		if(estado == null){
//			System.out.println("No se guardo la ciudad");
//		}
//		else{
//			Ciudad ciudad = new Ciudad();
//			ciudad.setNombre("Ibague");		
//			ciudad.setEstado(estado);
//			
//			CiudadDao daoC = new CiudadDao();
//			daoC.salvar(ciudad);
//			System.out.println("Se guardo la ciudad:" + ciudad.getNombre());
//		}
//	}
//	
//	@Test
//	@Ignore
//	public void listar(){
//		
//		CiudadDao dao = new CiudadDao();
//		List<Ciudad> resultado = dao.listar();
//		for (Ciudad ciudad : resultado){
//			System.out.println("Ciudad: "+ciudad.getNombre());
//			System.out.println("Estado: "+ciudad.getEstado().getNombre());
//			System.out.println("Sigla: " +ciudad.getEstado().getSigla());
//		}
//		
//	}
//	
//	@Test
//	@Ignore
//	public void buscar(){
//		
//		CiudadDao dao = new CiudadDao();
//		Ciudad ciudad = dao.buscar(1L);
//		System.out.println("Ciudad: "+ciudad.getNombre());
//		System.out.println("Estado: "+ciudad.getEstado().getNombre());
//		System.out.println("Sigla: " +ciudad.getEstado().getSigla());
//	}
//	
//	@Test
//	@Ignore
//	public void borrar(){
//		
//		CiudadDao dao = new CiudadDao();
//		Ciudad ciudad = dao.buscar(4L);
//		
//		if(ciudad == null){
//			System.out.println("No encontro el registro");
//		}
//		else{
//			dao.borrar(ciudad);
//			System.out.println("La Ciudad se elimino: "+ciudad.getNombre());
//		}
//		
//	}
//	@Test
//	@Ignore
//	public void editar(){
//		
//		CiudadDao dao = new CiudadDao();
//		Ciudad ciudad = dao.buscar(2L);
//		
//		if(ciudad == null){
//			System.out.println("No encontro el registro");
//		}
//		else{
//			Estado estado = new Estado();
//			EstadoDao daoE = new EstadoDao();
//			estado = daoE.buscar(3L);
//			ciudad.setNombre("Ibague");
//			ciudad.setEstado(estado);			
//			dao.editar(ciudad);
//			System.out.println("La Ciudad se edito: "+ciudad.getNombre());
//		}
//	}
//	
//	@Test
//	@Ignore
//	public void buscarPorCodigo(){
//		
//		Long codigo= 1L;
//		CiudadDao dao = new CiudadDao();
//		List<Ciudad> resultado = dao.buscarPorEstado(codigo);
//		for (Ciudad ciudad : resultado){
//			System.out.println("Ciudad: "+ciudad.getNombre());
//			System.out.println("Estado: "+ciudad.getEstado().getNombre());
//			System.out.println("Sigla: " +ciudad.getEstado().getSigla());
//		}
//		
//	}
	
	

}
