package co.edu.ucentral.quiz.controlador;

import co.edu.ucentral.quiz.entidades.Ciudadano;
import co.edu.ucentral.quiz.servicios.ServiciosCiudadano;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class controladorCiudadanos {

    @Autowired
    ServiciosCiudadano serviciosCiudadano;

    @GetMapping({  "/ciudadano/lista"})
    public String listarCiudadanos(Model model){
        model.addAttribute("listaciudadanosT",serviciosCiudadano.consultarT());

        for (Ciudadano elciudadano : serviciosCiudadano.consultarT()){
            System.out.println( elciudadano);
        }
        return "listaciudadanos";
    }

    @GetMapping({  "/ciudadano/nuevo"})
    public String cargarCiudadanoModal(Model model){
        Ciudadano ciudadanollenar = new Ciudadano();

        model.addAttribute("ciudadanollenar",ciudadanollenar);
        return "formcreacarro";
    }
}
