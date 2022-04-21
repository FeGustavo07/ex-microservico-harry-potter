package com.letscode.aluno.payloads;

import com.letscode.aluno.entities.Aluno;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
public class AlunoResponse {
    private Long id;
    private String nome;
    private String serie;
    private UUID chaveSeletora;

    public AlunoResponse(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.serie = aluno.getSerie();
        this.chaveSeletora = aluno.getChaveSeletora();
    }

    public static List<AlunoResponse> toResponse(List<Aluno> alunos) {
        return alunos.stream().map(AlunoResponse::new).collect(Collectors.toList());
    }

}
