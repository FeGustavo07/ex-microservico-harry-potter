package com.letscode.aluno.payloads.clients;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class ChaveSeletoraInfo {

    @JsonProperty(value = "sorting-hat-choice")
    private UUID chaveSeletora;
}
