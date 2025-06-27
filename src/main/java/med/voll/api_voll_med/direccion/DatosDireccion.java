package med.voll.api_voll_med.direccion;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DatosDireccion(@NotNull String calle,
                             String numero,/*opcional*/
                             String complemento,/*opcional*/
                             @NotNull String barrio,
                             @NotNull @Pattern(regexp = "\\d{5}") String codigo_postal,
                             @NotNull String ciudad,
                             @NotNull String estado) {
}
