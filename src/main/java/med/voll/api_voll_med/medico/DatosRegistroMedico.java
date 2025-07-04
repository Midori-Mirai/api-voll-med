package med.voll.api_voll_med.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api_voll_med.direccion.DatosDireccion;

public record DatosRegistroMedico(@NotBlank String nombre,
                                  @NotBlank @Email String email,
                                  @NotBlank String telefono,
                                  @NotBlank @Pattern(regexp = "\\d{9,12}") String documento,
                                  @NotNull Especialidad especialidad,
                                  @NotNull @Valid DatosDireccion direccion) {
}
