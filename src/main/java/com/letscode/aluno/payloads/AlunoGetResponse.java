package com.letscode.aluno.payloads;

import com.letscode.aluno.entities.Aluno;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class AlunoGetResponse {
    private String nome;
    private String serie;
    private UUID chaveSeletora;
    private String casa;

    public AlunoGetResponse(Aluno aluno) {
        this.nome = aluno.getNome();
        this.serie = aluno.getSerie();
        this.chaveSeletora = aluno.getChaveSeletora();
    }
}
