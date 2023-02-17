package co.com.dev.consumer;

import co.com.dev.consumer.dto.CharacterDTO;
import co.com.dev.consumer.dto.DataResponseDTO;
import co.com.dev.consumer.transformers.CharacterDataTransformer;
import co.com.dev.model.character.Character;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class CharacterConsumer /* implements Gateway from domain */ {

    @Autowired
    private WebClient client;
    @Autowired
    private CharacterDataTransformer characterDataTransformer;

    @Value("${adapter.restconsumer.url}")
    private String url;
    private String CHARACTER_URL = "/character";


    public Flux<Character> getAllCharacters() {
        log.info("Fetching getCharacters from {}", url + CHARACTER_URL);
        return client
            .get()
            .uri(url + CHARACTER_URL)
            .retrieve()
            .bodyToMono(DataResponseDTO.class)
            .flatMapIterable(DataResponseDTO::getResults)
            .map(characterDataTransformer::characterDTOToCharacter);
    }

    public Mono<Character> getCharacter(Integer characterId) {
        log.info("Fetching getCharactersbyId from {}", url + CHARACTER_URL + "/" + characterId);

        return client
            .get()
            .uri(url + CHARACTER_URL + "/" + characterId)
            .retrieve()
            .bodyToMono(CharacterDTO.class)
            .map(characterDataTransformer::characterDTOToCharacter);
    }
}
