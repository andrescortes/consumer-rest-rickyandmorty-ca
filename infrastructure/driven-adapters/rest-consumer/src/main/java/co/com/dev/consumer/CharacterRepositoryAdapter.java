package co.com.dev.consumer;

import co.com.dev.model.character.Character;
import co.com.dev.model.character.Gender;
import co.com.dev.model.character.Status;
import co.com.dev.model.character.gateways.CharacterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Log
@Component
public class CharacterRepositoryAdapter implements CharacterRepository {
    @Autowired
    private CharacterConsumer characterConsumer;

    @Override
    public Flux<Character> getCharacters() {
        return characterConsumer.getAllCharacters();
    }

    @Override
    public Mono<Character> getCharacterById(Integer characterId) {
        return characterConsumer.getCharacter(characterId);
    }

    @Override
    public Flux<Character> getCharactersByQuery(String name, Status status, String species,
        String type, Gender gender) {
        return null;
    }
}
