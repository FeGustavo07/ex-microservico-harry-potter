package com.letscode.aluno.services;

import com.letscode.aluno.payloads.AlunoGetResponse;
import com.letscode.aluno.payloads.AlunoRequest;
import com.letscode.aluno.payloads.AlunoResponse;

import java.util.List;

public interface AlunoService {
    AlunoResponse create(AlunoRequest alunoRequest);
    AlunoGetResponse getById(Long id);

    List<AlunoResponse> getAll();
}
