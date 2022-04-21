package com.letscode.aluno.entities;

import com.letscode.aluno.payloads.clients.ChaveSeletoraInfo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "aluno")
@Getter @Setter
public class Aluno {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String serie;
    @Column(name = "chave_seletora")
    private UUID chaveSeletora;
}
