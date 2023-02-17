package co.com.dev.config;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DefaultBeansConfig {

    @Bean
    public Gson gson() {
        return new Gson();
    }
}
