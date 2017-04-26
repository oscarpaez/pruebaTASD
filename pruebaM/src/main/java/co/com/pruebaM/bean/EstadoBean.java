package co.com.pruebaM.bean;

//import javax.faces.application.FacesMessage;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
//import javax.faces.context.FacesContext;


import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import co.com.pruebaM.dao.EstadoDao;
import co.com.pruebaM.entyties.Estado;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class EstadoBean implements Serializable{
	
	private Estado estado;
	private List<Estado> listaEstodo;
	
	public void salvar(){
		
		try {
			EstadoDao dao = new EstadoDao();
			dao.merge(estado);
			nuevo();
			listaEstodo = dao.listar();
			Messages.addGlobalInfo( "Salvo el Estado");
			
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error al salvar Estado");
			ex.printStackTrace();
		}
		 
//		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", msg);
//		
//		FacesContext context = FacesContext.getCurrentInstance(); 
//		context.addMessage(null, message);
//		System.out.println("entro");
	}
	
	@PostConstruct
	public void listar(){
		
		try {
			EstadoDao dao = new EstadoDao();
			listaEstodo =  dao.listar();
			
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error al salvar Estado");
			ex.printStackTrace();
		}
	}
	
	public void borrar(ActionEvent evento){
		
		try {
			estado = (Estado) evento.getComponent().getAttributes().get("estadoSeleccionado");
			EstadoDao dao = new EstadoDao();
			dao.borrar(estado);
			listaEstodo =  dao.listar();
			Messages.addGlobalInfo("Se elimino el estado");			
			
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error al salvar Estado");
			ex.printStackTrace();
		}
	}
	
	public void editar(ActionEvent evento){
		
		try {
			estado = (Estado) evento.getComponent().getAttributes().get("estadoSeleccionado");
			/*EstadoDao dao = new EstadoDao();
			dao.buscar(estado.getCodigo());
			listaEstodo =  dao.listar();
			Messages.addGlobalInfo("Se elimino el estado");	*/		
			
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error al salvar Estado");
			ex.printStackTrace();
		}
	}
	
	public void nuevo(){
		estado = new Estado(); 
	}

	public Estado getEstado() {
		return estado;
	}

	public List<Estado> getListaEstodo() {
		return listaEstodo;
	}

	public void setListaEstodo(List<Estado> listaEstodo) {
		this.listaEstodo = listaEstodo;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}
