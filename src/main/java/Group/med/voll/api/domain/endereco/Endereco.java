package Group.med.voll.api.domain.endereco;

import Group.med.voll.api.dto.endereco.DadosEnderecoDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEnderecoDTO dadosEnderecoDTO) {
        this.logradouro = dadosEnderecoDTO.logradouro();
        this.bairro = dadosEnderecoDTO.bairro();
        this.cep = dadosEnderecoDTO.cep();
        this.numero = dadosEnderecoDTO.numero();
        this.complemento = dadosEnderecoDTO.complemento();
        this.cidade = dadosEnderecoDTO.cidade();
        this.uf = dadosEnderecoDTO.uf();
    }
}
