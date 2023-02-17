package co.com.dev.api.character.transformers;


import co.com.dev.api.character.dto.CharacterDTO;
import co.com.dev.model.character.Character;
import org.mapstruct.Mapper;

@Mapper
public interface CharacterWebTransformer {


    CharacterDTO characterToCharacterDTO(Character character);
}
