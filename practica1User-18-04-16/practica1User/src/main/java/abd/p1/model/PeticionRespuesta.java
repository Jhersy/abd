package abd.p1.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PeticionRespuesta extends Mensaje {
	@ManyToOne
	private Pregunta pregunta;

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}
}
