package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Pessoa;
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
    private TelefoneDTO telefone;
    private LocalidadeDTO localidade;

    public static PessoaDTO create(Pessoa pessoa) {
        ModelMapper modelMapper = new ModelMapper();
        PessoaDTO dto = modelMapper.map(pessoa, PessoaDTO.class);
        return dto;
    }
}