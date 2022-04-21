package com.letscode.aluno.services.Impl;

import com.letscode.aluno.clients.GetCasa;
import com.letscode.aluno.clients.GetChaveSeletora;
import com.letscode.aluno.entities.Aluno;
import com.letscode.aluno.payloads.AlunoGetResponse;
import com.letscode.aluno.payloads.AlunoRequest;
import com.letscode.aluno.payloads.AlunoResponse;
import com.letscode.aluno.repositories.AlunoRepository;
import com.letscode.aluno.services.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements AlunoService {

    private final AlunoRepository alunoRepository;
    private final GetChaveSeletora getChaveSeletora;
    private final GetCasa getCasa;

    @Override
    public AlunoResponse create(AlunoRequest alunoRequest) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoRequest.getNome());
        aluno.setSerie(alunoRequest.getSerie());
        aluno.setChaveSeletora(getChaveSeletora.execute().getChaveSeletora());
        alunoRepository.save(aluno);
        return new AlunoResponse(aluno);
    }

    @Override
    public AlunoGetResponse getById(Long id) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow();
        AlunoGetResponse alunoGetResponse = new AlunoGetResponse(aluno);
        alunoGetResponse.setCasa(getCasa.execute(aluno.getChaveSeletora()).getNome());
        return alunoGetResponse;
    }

    @Override
    public List<AlunoResponse> getAll() {
        return AlunoResponse.toResponse(
                alunoRepository.findAll()
        );
    }
}
