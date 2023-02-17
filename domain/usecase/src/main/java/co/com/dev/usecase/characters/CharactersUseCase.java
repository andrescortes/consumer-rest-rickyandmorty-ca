package co.com.dev.usecase.characters;

import co.com.dev.model.character.Character;
import co.com.dev.model.character.Gender;
import co.com.dev.model.character.Status;
import co.com.dev.model.character.gateways.CharacterRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CharactersUseCase {

    private final CharacterRepository repository;

    public Flux<Character> getCharacters() {
        return repository.getCharacters();
    }

    public Mono<Character> getCharacterById(Integer characterId) {
        return repository.getCharacterById(characterId);
    }

    public Flux<Character> getCharacterQuery(String name, Status status, String species,
        String type, Gender gender) {
        return repository.getCharactersByQuery(name, status, species, type, gender);
    }
}
