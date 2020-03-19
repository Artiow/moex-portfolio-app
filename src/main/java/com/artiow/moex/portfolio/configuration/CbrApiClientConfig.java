package com.artiow.moex.portfolio.configuration;

import com.artiow.cbr.api.CentralBankClient;
import com.artiow.cbr.api.CentralBankResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CbrApiClientConfig {

    @Bean
    public CentralBankResource centralBankResource(RestTemplate restTemplate) {
        return new CentralBankClient(restTemplate);
    }
}
