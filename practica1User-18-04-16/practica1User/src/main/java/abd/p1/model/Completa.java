package abd.p1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@IdClass(CompletaPreguntaClave.class)
public class Completa {
	@Id
	@ManyToOne
	private Usuario usuario;	
	@Id
	@ManyToOne
	private Opcion opcion;
	
	private short relevancia;
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
	public short getRelevancia() {
		return relevancia;
	}
	public void setRelevancia(short relevancia) {
		this.relevancia = relevancia;
	}
}
