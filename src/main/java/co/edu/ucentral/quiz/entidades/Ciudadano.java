package co.edu.ucentral.quiz.entidades;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ciudadanos")
@Builder
@ToString
public class Ciudadano {

        @Id
        @Column (name = "ciudadano_codigo")
        private int codigo;

        @Column (name ="ciudadano_nombres", length = 10)
        private String nombres;

        @Column(name = "ciudadano_apellidos", length = 10)
        private String apellidos;

        @Column(name = "ciudadano_edad")
        private int edad;

        @Column(name = "ciudadano_Sexo", length = 1)
        private String sexo;

}
