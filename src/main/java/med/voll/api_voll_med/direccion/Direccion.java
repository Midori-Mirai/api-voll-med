package med.voll.api_voll_med.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*Direccion y Medico es la clase representante como entidade JPA*/
@Getter /*Coloca todos los getters*/
@NoArgsConstructor /*implementa un constructor default*/
@AllArgsConstructor /*implementa un constructor personalizado con todos los parametros*/
@Embeddable
public class Direccion {
    private String calle;
    private String numero; /* dato opcional para el usuario*/
    private String complemento;/*dato opcional para el usuario*/
    private String barrio;
    private String codigo_postal;
    private String ciudad;
    private String estado;

    public Direccion(DatosDireccion datosDireccion) {
        this.calle = datosDireccion.calle();
        this.numero = datosDireccion.numero(); /* dato opcional para el usuario*/
        this.complemento = datosDireccion.complemento();/*dato opcional el usuario*/
        this.barrio = datosDireccion.barrio();
        this.codigo_postal = datosDireccion.codigo_postal();
        this.ciudad = datosDireccion.ciudad();
        this.estado = datosDireccion.estado();
    }
}
