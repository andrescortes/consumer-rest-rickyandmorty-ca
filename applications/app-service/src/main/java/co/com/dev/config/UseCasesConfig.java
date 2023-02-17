package co.com.dev.config;

import co.com.dev.model.character.gateways.CharacterRepository;
import co.com.dev.usecase.characters.CharactersUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.dev.usecase", includeFilters = {
    @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")}, useDefaultFilters = false)
public class UseCasesConfig {

/*    @Bean
    public CharactersUseCase charactersUseCase(CharacterRepository repository) {
        return new CharactersUseCase(repository);
    }*/
}
