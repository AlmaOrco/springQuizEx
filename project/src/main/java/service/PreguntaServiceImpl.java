package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import domain.Pregunta;
import domain.Trabajo;

@Service
public class PreguntaServiceImpl {

    private List<Pregunta> preguntas;
    private List<String> respuestas;
    private List<Trabajo> trabajos;
    private String name;
    private Trabajo trabajo;

    public PreguntaServiceImpl() {
                trabajos = new ArrayList<Trabajo>();
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("UnidadCurso");
		EntityManager em = emf.createEntityManager();

		TypedQuery<Trabajo> consultaTr = em.createQuery("SELECT a FROM Trabajo a", Trabajo.class);
        for (Trabajo t : consultaTr.getResultList()) {
            trabajos.add(t);
        }
		em.close();
    }
    
    public void cargarPreguntas(String idTrabajo){
        preguntas = new ArrayList<Pregunta>();
        respuestas = new ArrayList<String>();

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("UnidadCurso");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Pregunta> consulta = em.createQuery("SELECT p FROM Pregunta p WHERE trabajo_id = :idTrabajo", Pregunta.class);
        consulta.setParameter("idTrabajo", idTrabajo);
        for (Pregunta p : consulta.getResultList()) {
            System.out.println(p.getTexto());
            preguntas.add(p);
            respuestas.add("");
        }
            System.out.println(idTrabajo);
            System.out.println("preguntas cargadas");
        em.close();
    }

    public void setName(String name) {
       this.name=name;
    }

    public String getName() {
      return name;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public Pregunta getPregunta(int id) {
        if(id <= preguntas.size()) {
          return preguntas.get(0);
        }
        return null;
    }

    public void setRespuesta(int i, String resp) {
       respuestas.set((i-1),resp);
    }

    public List<Trabajo> getTrabajos() {
        return trabajos;
    }
}
