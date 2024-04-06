package Group.med.voll.api.controllers;

import Group.med.voll.api.domain.medico.Medico;
import Group.med.voll.api.dto.medico.DadosCadastroMedicoDTO;
import Group.med.voll.api.dto.medico.DadosListagemMedico;
import Group.med.voll.api.repositories.MedicosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return this.medicosRepository.findAll(paginacao).map(DadosListagemMedico::new);
    }
}
