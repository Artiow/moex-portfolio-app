package com.artiow.moex.portfolio.configuration;

import com.artiow.moex.api.EngineClient;
import com.artiow.moex.api.EngineResource;
import com.artiow.moex.api.SecurityPaperClient;
import com.artiow.moex.api.SecurityPaperResource;
import com.artiow.moex.api.client.MoexApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MoexApiClientConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public MoexApiClient moexApiClient(RestTemplate restTemplate) {
        return new MoexApiClient(restTemplate);
    }


    @Bean
    public SecurityPaperResource securityPaperResource(MoexApiClient moexApiClient) {
        return new SecurityPaperClient(moexApiClient);
    }

    @Bean
    public EngineResource engineResource(MoexApiClient moexApiClient) {
        return new EngineClient(moexApiClient);
    }
}
