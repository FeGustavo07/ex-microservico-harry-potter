package com.letscode.aluno.clients;

import com.letscode.aluno.payloads.clients.ChaveSeletoraInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class GetChaveSeletora {

    //https://api-harrypotter.herokuapp.com/sortinghat.

    @Value("https://api-harrypotter.herokuapp.com/sortinghat")
    private String url;

    public ChaveSeletoraInfo execute() {

        RestTemplate template = new RestTemplate();
        org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<ChaveSeletoraInfo> chaveSeletoraInfoResponseEntity = template.exchange(
                url,
                HttpMethod.GET,
                entity,
                ChaveSeletoraInfo.class);

        return chaveSeletoraInfoResponseEntity.getBody();
    }
}
