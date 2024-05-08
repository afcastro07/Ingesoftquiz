package co.edu.ucentral.quiz.servicios;

import co.edu.ucentral.quiz.entidades.Ciudadano;
import co.edu.ucentral.quiz.operaciones.OperacionesCiudadano;
import co.edu.ucentral.quiz.repositorio.RepositorioCiudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosCiudadano implements OperacionesCiudadano {

    @Autowired
    RepositorioCiudadano repositorioCiudadano ;

    @Override
    public Ciudadano crear(Ciudadano ciudadano) {
        return null;
    }

      @Override
    public List<Ciudadano> consultarT() {
        return repositorioCiudadano.findAll();
    }


}
