package co.com.dev;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.server.WebServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.server.reactive.ContextPathCompositeHandler;
import org.springframework.http.server.reactive.HttpHandler;
@Configuration
public class WebEntryConfig {

    @Bean
    public NettyReactiveWebServerFactory nettyReactiveWebServerFactory(Environment env) {
        return new NettyReactiveWebServerFactory() {
            @Override
            public WebServer getWebServer(HttpHandler httpHandler) {
                Map<String, HttpHandler> handlerMap = new HashMap<>();
                handlerMap.put(env.getProperty("server.servlet.context-path"), httpHandler);
                return super.getWebServer(new ContextPathCompositeHandler(handlerMap));
            }
        };
    }
}
