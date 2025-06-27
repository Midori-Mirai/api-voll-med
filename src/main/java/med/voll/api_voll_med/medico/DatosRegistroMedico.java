package med.voll.api_voll_med.medico;

import med.voll.api_voll_med.direccion.DatosDireccion;

public record DatosRegistroMedico(String nombre,
                                  String email,
                                  Integer telefono,
                                  String documento,
                                  Especialidad especialidad,
                                  DatosDireccion datosDireccion) {
}
