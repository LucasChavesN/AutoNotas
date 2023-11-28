package com.remedios.lucas.curso.alunoDisciplina;

public record DadosDetalhamentoAlunoDisciplina(
        Long idAlunoDisciplina,

        Long idDisciplina,
        String nomeDisciplina,
        String nomeProfessor,
        String nomeAluno,
        Double nota1,
        Double nota2,
        Double notaAtividade,
        Double media,
        String feedback
) {

    public DadosDetalhamentoAlunoDisciplina(AlunoDisciplina alunoDisciplina){
        this(alunoDisciplina.getIdAlunoDisciplina(),
                alunoDisciplina.getIdDisciplina(),
                alunoDisciplina.getNomeDisciplina(),
                alunoDisciplina.getNomeProfessor(),
                alunoDisciplina.getNomeAluno(),
                alunoDisciplina.getNota1(),
                alunoDisciplina.getNota2(),
                alunoDisciplina.getNotaAtividade(),
                alunoDisciplina.getMedia(),
                alunoDisciplina.getFeedback());
    }
}
