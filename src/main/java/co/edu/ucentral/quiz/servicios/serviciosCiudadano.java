package co.edu.ucentral.quiz.servicios;

import co.edu.ucentral.quiz.entidades.Ciudadano;
import co.edu.ucentral.quiz.operaciones.OperacionesCiudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviciosCiudadano implements OperacionesCiudadano {

    @Autowired
    RepositorioCiudadano repositorioCiudadano ;

    @Override
    public Ciudadano crear(Ciudadano ciudadano) {
        return null;
    }

    @Override
    public Ciudadano actualizar(Ciudadano ciudadano) {
        return null;
    }

    @Override
    public void borrar(Ciudadano ciudadano) {

    }

    @Override
    public List<Ciudadano> consultarT() {
        return repositorioCiudadano.findAll();
    }

    @Override
    public Ciudadano consultarPK(int pk) {
        return null;
    }
}
