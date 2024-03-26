package com.example.arcadepointapi.api.dto;


import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;



@Data
@NoArgsConstructor
@AllArgsConstructor

public class AnuncioDTO {

    private Long id;

    private Float valor;

    private Long idProduto;



    public static AnuncioDTO create(Anuncio anuncio) {
        ModelMapper modelMapper = new ModelMapper();
        AnuncioDTO dto = modelMapper.map(anuncio, AnuncioDTO.class);
        dto.valor = anuncio.getValor();
        return dto;
    }
}