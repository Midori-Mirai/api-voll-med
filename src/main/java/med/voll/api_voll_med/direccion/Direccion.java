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

    public void actualizarDireccion(DatosDireccion datos) {
        if(datos.calle() != null){
            this.calle = datos.calle();
        }
        if(datos.numero() != null){
            this.numero = datos.numero();
        }
        if(datos.complemento() != null){
            this.complemento = datos.complemento();
        }
        if(datos.barrio() != null){
            this.barrio = datos.barrio();
        }
        if(datos.codigo_postal() != null){
            this.codigo_postal = datos.codigo_postal();
        }
        if(datos.ciudad() != null){
            this.ciudad = datos.ciudad();
        }
        if(datos.estado() != null){
            this.estado = datos.estado();
        }
    }
}
