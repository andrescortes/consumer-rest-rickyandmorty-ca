package co.com.dev.model.character.gateways;

import co.com.dev.model.character.Character;
import co.com.dev.model.character.Gender;
import co.com.dev.model.character.Status;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CharacterRepository {

    Flux<Character> getCharacters();

    Mono<Character> getCharacterById(Integer characterId);
    Flux<Character> getCharactersByQuery(String name, Status status, String species, String type,
        Gender gender);
}
