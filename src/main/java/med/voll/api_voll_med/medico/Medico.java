package med.voll.api_voll_med.medico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api_voll_med.direccion.Direccion;


@Entity(name = "Medico")/*Crea tabla*/
@Table(name = "medicos")/*Cambia nombre a la tabla*/
@Getter /*Coloca todos los getters*/
@NoArgsConstructor /*implementa un constructor default*/
@AllArgsConstructor /*implementa un constructor personalizado con todos los parametros*/
@EqualsAndHashCode(of = "id") /*Identifica que dos objetos son iguales si tienen el mismo ID*/
public class Medico {
    @Id/*Indica que esle id*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*Id incremental*/
    private Long id;
    private Boolean activo;
    private String nombre;
    private String email;
    private String telefono;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;

    @Embedded
    private Direccion direccion;

    public Medico(DatosRegistroMedico datos) {
        this.id = null;
        this.activo = true;
        this.nombre = datos.nombre();
        this.email = datos.email();
        this.telefono = datos.telefono();
        this.documento = datos.documento();
        this.especialidad = datos.especialidad();
        this.direccion = new Direccion(datos.direccion());
    }

    public void actualizarInformaciones(@Valid DatosActualizacionMedico datos) {
        if(datos.nombre() != null){
            this.nombre = datos.nombre();
        }
        if(datos.telefono() != null){
            this.telefono = datos.telefono();
        }
        if(datos.direccion() != null){
            this.direccion.actualizarDireccion(datos.direccion());
        }
    }
}
/*Medico y Direccion es la clase representante como entidade JPA*/
/*Anotaciones Lombok para evitar escribir tanto código*/
