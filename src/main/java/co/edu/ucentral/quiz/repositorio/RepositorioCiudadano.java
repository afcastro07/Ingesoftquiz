package co.edu.ucentral.quiz.repositorio;

import co.edu.ucentral.quiz.entidades.Ciudadano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCiudadano extends JpaRepository<Ciudadano, Long>, JpaSpecificationExecutor<Ciudadano> {

}
