package domain;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;

import domain.Pregunta;

@Entity
public class Trabajo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String trabajo_id;
	private String titulo;
	private String grupo;
	
	@OneToMany(mappedBy="trabajo")
	private List<Pregunta> preguntas = new ArrayList<Pregunta>();
	
	public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setTrabajo_id(String trabajo_id) {
        this.trabajo_id = trabajo_id;
    }
    public String getTrabajo_id() {
        return this.trabajo_id;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public String getGrupo() {
        return this.grupo;
    }

    public void addPreguntas(Pregunta p) {
        this.preguntas.add(p);
    }
    public List<Pregunta> getPreguntas() {
        return this.preguntas;
    }
}
