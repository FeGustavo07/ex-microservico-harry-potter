package com.letscode.aluno.clients;

import com.letscode.aluno.payloads.clients.CasaInfo;
import com.letscode.aluno.payloads.clients.ChaveSeletoraInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class GetCasa {

    @Value("https://api-harrypotter.herokuapp.com/house/{chave}")
    private String url;

    public CasaInfo execute(UUID chave) {

        RestTemplate template = new RestTemplate();
        org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<CasaInfo> casaInfoResponseEntity = template.exchange(
                url,
                HttpMethod.GET,
                entity,
                CasaInfo.class,
                chave);


        return casaInfoResponseEntity.getBody();
    }

}
