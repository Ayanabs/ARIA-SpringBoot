package org.accimt.aria.config;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LlmConfig {

    @Value("${langchain4j.ollama.chat-model.base-url}")
    private String baseUrl;

    @Value("${langchain4j.ollama.chat-model.model-name}")
    private String modelName;

    @Bean(name = "ollamaChatModel")
    public ChatModel chatLanguageModel() {
        return OllamaChatModel.builder()
                .baseUrl(baseUrl)
                .modelName(modelName)
                .think(false)
                .temperature(0.0)
                .topP(0.9)
                .topK(40)
                .timeout(java.time.Duration.ofSeconds(180))
                .returnThinking(false)
                .build();
    }
}
