package med.voll.api_voll_med.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api_voll_med.direccion.DatosDireccion;

public record DatosActualizacionMedico(
        @NotNull Long id,
        String nombre,
        String telefono,
        DatosDireccion direccion) {
}
