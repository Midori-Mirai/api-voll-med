package med.voll.api_voll_med.medico;

public record DatosListaMedico(
        String nombre,
        String email,
        String documento,
        Especialidad especialidad) {

    /*Crear constructor personalizado del record*/

    public DatosListaMedico(Medico medico) {
        this(
                medico.getNombre(),
                medico.getEmail(),
                medico.getDocumento(),
                medico.getEspecialidad());
    }
}
