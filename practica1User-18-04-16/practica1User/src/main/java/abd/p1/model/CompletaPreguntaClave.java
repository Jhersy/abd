package abd.p1.model;

import java.io.Serializable;

@SuppressWarnings("serial") 
public class CompletaPreguntaClave implements Serializable{
	
private Usuario usuario;
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
public Opcion getOpcion() {
	return opcion;
}
public void setOpcion(Opcion opcion) {
	this.opcion = opcion;
}
private Opcion opcion;
	
	

}
