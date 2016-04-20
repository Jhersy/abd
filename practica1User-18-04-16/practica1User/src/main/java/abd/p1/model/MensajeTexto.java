package abd.p1.model;

import javax.persistence.Entity;

@Entity
public class MensajeTexto extends Mensaje {
	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
