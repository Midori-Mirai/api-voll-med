package med.voll.api_voll_med.direccion;

public record DatosDireccion(String calle,
                             String numero,/*opcional*/
                             String complemento,/*opcional*/
                             String barrio,
                             String codigo_postal,
                             String ciudad,
                             String estado) {
}
