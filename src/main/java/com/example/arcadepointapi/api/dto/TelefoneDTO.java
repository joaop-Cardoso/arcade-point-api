package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Telefone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TelefoneDTO {

    private Long id;

    private  String telefone;

    public static TelefoneDTO create(Telefone telefone) {
        ModelMapper modelMapper = new ModelMapper();
        TelefoneDTO dto = modelMapper.map(telefone, TelefoneDTO.class);
        dto.telefone = telefone.getTelefone();
        return dto;
    }
}