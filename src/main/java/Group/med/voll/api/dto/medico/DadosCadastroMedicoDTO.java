package Group.med.voll.api.dto.medico;

import Group.med.voll.api.dto.endereco.DadosEnderecoDTO;

public record DadosCadastroMedicoDTO(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEnderecoDTO dadosEndereco) {
}
