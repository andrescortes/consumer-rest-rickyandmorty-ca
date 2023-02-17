package co.com.dev.api.character;

import co.com.dev.api.character.dto.CharacterDTO;
import co.com.dev.api.character.transformers.CharacterWebTransformer;
import co.com.dev.model.commons.ex.ApplicationException;
import co.com.dev.usecase.characters.CharactersUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@AllArgsConstructor
public class QueryCharactersService {

    //    private final MyUseCase useCase;
    @Autowired
    private final CharactersUseCase useCase;
    @Autowired
    private CharacterWebTransformer characterWebTransformer;

    @GetMapping("/characters")
    public Flux<CharacterDTO> getCharacters() {
        log.info("Get characters operation");
        return useCase.getCharacters()
            .map(character -> characterWebTransformer.characterToCharacterDTO(character))
            .onErrorResume(err -> Mono.error(
                new ApplicationException("Something wrong with cause: " + err.getMessage())));
    }

}
