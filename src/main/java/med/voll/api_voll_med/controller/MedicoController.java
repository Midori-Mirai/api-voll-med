package med.voll.api_voll_med.controller;

import med.voll.api_voll_med.medico.DatosRegistroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @PostMapping /*No olvidar anotación POST para recibir*/
    public void registrar(@RequestBody DatosRegistroMedico datos){
        System.out.println(datos);
    }
}
