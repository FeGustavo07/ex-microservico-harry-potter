package com.letscode.aluno.payloads;

import lombok.Getter;

@Getter
public class AlunoRequest {
    private String nome;
    private String serie;
    private String chaveSeletora;
}
