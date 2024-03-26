package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Localidade;
import com.example.arcadepointapi.model.entity.Pessoa;
import com.example.arcadepointapi.model.entity.Telefone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PessoaDTO {

    private Long id;
    private boolean adm;
    private String cpf;
    private String nome;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private Long idTelefone;
    private Long idLocalidade;

    public static PessoaDTO create(Pessoa pessoa) {
        ModelMapper modelMapper = new ModelMapper();
        PessoaDTO dto = modelMapper.map(pessoa, PessoaDTO.class);
        dto.adm = pessoa.isAdm();
        dto.cpf = pessoa.getCpf();
        dto.nome = pessoa.getNome();
        dto.logradouro = pessoa.getLogradouro();
        dto.numero = pessoa.getNumero();
        dto.complemento = pessoa.getComplemento();
        dto.bairro = pessoa.getBairro();
        dto.cep = pessoa.getCep();
        return dto;
    }
}