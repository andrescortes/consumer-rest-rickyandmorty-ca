package co.com.dev.api.character;

import co.com.dev.api.character.dto.CharacterDTO;
import co.com.dev.api.character.transformers.CharacterWebTransformer;
import co.com.dev.model.commons.ex.ApplicationException;
import co.com.dev.usecase.characters.CharactersUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@AllArgsConstructor
public class QueryCharacterService {


    private final CharactersUseCase useCase;
    @Autowired
    private CharacterWebTransformer characterWebTransformer;

    @GetMapping("/characters/{characterId}")
    public Mono<CharacterDTO> getCharacters(@PathVariable Integer characterId) {
        log.info("Get characters operation: {}", characterId);
        return useCase.getCharacterById(characterId)
            .map(character -> characterWebTransformer.characterToCharacterDTO(character))
            .switchIfEmpty(
                Mono.error(new ApplicationException("No found character whit id: " + characterId)));
    }
}
