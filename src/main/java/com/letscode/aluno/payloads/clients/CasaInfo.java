package com.letscode.aluno.payloads.clients;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CasaInfo {
    @JsonProperty(value = "name")
    private String nome;
}
