package med.voll.api_voll_med.controller;

import jakarta.validation.Valid;
import med.voll.api_voll_med.medico.*;
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
        return repository.findAllByActivoTrue(paginacion).map(DatosListaMedico::new);
    }

    @Transactional
    @PutMapping
    public void actualizar(@RequestBody @Valid DatosActualizacionMedico datos){
        var medico = repository.getReferenceById(datos.id());
        medico.actualizarInformaciones(datos);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){/*Pathvariable es para indicar que le estamos
    pasando la id como variable directo de la URL*/
        repository.deleteById(id);
    }
}
