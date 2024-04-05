package Group.med.voll.api.controllers;

import Group.med.voll.api.domain.medico.Medico;
import Group.med.voll.api.dto.medico.DadosCadastroMedicoDTO;
import Group.med.voll.api.repositories.MedicosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicosRepository medicosRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedicoDTO dados){
        this.medicosRepository.save(new Medico(dados));
    }
}
