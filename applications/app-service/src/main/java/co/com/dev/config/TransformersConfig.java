package co.com.dev.config;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransformersConfig {

    @Bean
    public co.com.dev.api.character.transformers.CharacterWebTransformer characterWebTransformer() {
        return Mappers.getMapper(
            co.com.dev.api.character.transformers.CharacterWebTransformer.class);
    }

    @Bean
    public co.com.dev.consumer.transformers.CharacterDataTransformer characterDataTransformer() {
        return Mappers.getMapper(co.com.dev.consumer.transformers.CharacterDataTransformer.class);
    }
}
