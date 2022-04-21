package com.letscode.aluno.controllers;

import com.letscode.aluno.payloads.AlunoGetResponse;
import com.letscode.aluno.payloads.AlunoRequest;
import com.letscode.aluno.payloads.AlunoResponse;
import com.letscode.aluno.services.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlunoResponse create(@RequestBody AlunoRequest alunoRequest) {
        return alunoService.create(alunoRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public AlunoGetResponse getById(@RequestParam Long id) {
        return alunoService.getById(id);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<AlunoResponse> getAll() {
        return alunoService.getAll();
    }



}
