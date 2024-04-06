package Group.med.voll.api.dto.medico;

import Group.med.voll.api.dto.endereco.DadosEnderecoDTO;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedicoDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecoDTO endereco
) {
}
