package co.com.dev.consumer.transformers;


import co.com.dev.consumer.dto.CharacterDTO;
import co.com.dev.model.character.Character;
import org.mapstruct.Mapper;

@Mapper
public interface CharacterDataTransformer {

    Character characterDTOToCharacter(CharacterDTO characterDTO);
}
