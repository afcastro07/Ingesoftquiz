package co.edu.ucentral.quiz.operaciones;

import co.edu.ucentral.quiz.entidades.Ciudadano;

import java.util.List;

public interface OperacionesCiudadano {
    public Ciudadano crear(Ciudadano ciudadano);
    public Ciudadano actualizar(Ciudadano ciudadano);
    public void borrar(Ciudadano ciudadano);
    public List<Ciudadano> consultarT();
    public Ciudadano consultarPK(int pk);

}
