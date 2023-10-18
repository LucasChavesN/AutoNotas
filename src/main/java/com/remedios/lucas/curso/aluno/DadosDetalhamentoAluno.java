package com.remedios.lucas.curso.aluno;

public record DadosDetalhamentoAluno (
    Long id,
    String nome,
    String ra,
    String curso,
    String email,
    String cep,
    String logradouro
){
    public DadosDetalhamentoAluno(Aluno aluno){
        this(aluno.getId(),
                aluno.getNome(),
                aluno.getRa(),
                aluno.getCurso(),
                aluno.getEmail(),
                aluno.getCep(),
                aluno.getLogradouro()
        );
    }

}

