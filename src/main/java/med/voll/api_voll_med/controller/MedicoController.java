package med.voll.api_voll_med.controller;

import jakarta.validation.Valid;
import med.voll.api_voll_med.medico.DatosListaMedico;
import med.voll.api_voll_med.medico.DatosRegistroMedico;
import med.voll.api_voll_med.medico.Medico;
import med.voll.api_voll_med.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;

    @Transactional/*Para modificar en la base de datos*/
    @PostMapping /*No olvidar anotación POST para recibir datos, en este caso JSON*/
    public void registrar(@RequestBody @Valid DatosRegistroMedico datos){
        repository.save(new Medico(datos));
    }

    /*Esta es la parte de R de CRUD, el READ - Mostrar listado de médicos*/
    @GetMapping /*para enviar datos al front*/
    public Page<DatosListaMedico> listar(@PageableDefault(size = 10, sort = {"nombre"}) Pageable paginacion){
        return repository.findAll(paginacion).map(DatosListaMedico::new);
    }
}
