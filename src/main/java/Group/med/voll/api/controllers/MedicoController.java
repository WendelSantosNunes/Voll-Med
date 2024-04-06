package Group.med.voll.api.controllers;

import Group.med.voll.api.domain.medico.Medico;
import Group.med.voll.api.dto.medico.DadosCadastroMedicoDTO;
import Group.med.voll.api.dto.medico.DadosListagemMedico;
import Group.med.voll.api.repositories.MedicosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<DadosListagemMedico> listar() {
        return this.medicosRepository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}
