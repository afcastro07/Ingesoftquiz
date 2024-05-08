package co.edu.ucentral.quiz.operaciones;

import co.edu.ucentral.quiz.entidades.Ciudadano;

import java.util.List;

public interface OperacionesCiudadano {
    public Ciudadano crear(Ciudadano ciudadano);
    public List<Ciudadano> consultarT();
}
