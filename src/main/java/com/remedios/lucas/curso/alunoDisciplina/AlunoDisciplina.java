package com.remedios.lucas.curso.alunoDisciplina;


import jakarta.persistence.*;
import jakarta.validation.Valid;

@Table(name="alunoDisciplinas")
@Entity(name="alunoDisciplinas")
public class AlunoDisciplina {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAlunoDisciplina;

    Long idAluno;

    String nomeAluno;

    Long idDisciplina;
    String nomeDisciplina;

    String nomeProfessor;
     Double nota1;
     Double nota2;
    Double notaAtividade;
    Double media;

    public AlunoDisciplina(Long idAlunoDisciplina, Long idAluno, String nomeAluno, Long idDisciplina, String nomeDisciplina, String nomeProfessor, Double nota1, Double nota2, Double notaAtividade, Double media) {
        this.idAlunoDisciplina = idAlunoDisciplina;
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProfessor = nomeProfessor;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaAtividade = notaAtividade;
        this.media = media;
    }

    public AlunoDisciplina() {
    }

    public AlunoDisciplina(@Valid DadosCadastroAlunoDisciplina dados) {
        super();
    }

    public AlunoDisciplina(Long idAlunoDisciplina) {
        this.idAlunoDisciplina = idAlunoDisciplina;
    }

    public void atualizarInformacoes(@Valid DadosAtualizarAlunoDisciplina dados){
        if(dados.idAluno()!=null){
            this.idAluno = dados.idAluno();
        }
        if(dados.idDisciplina()!=null){
            this.idDisciplina = dados.idDisciplina();
        }
        if(dados.nota1()!=null){
            this.nota1 = dados.nota1();
        }
        if(dados.nota2()!=null){
            this.nota2 = dados.nota2();
        }
        if(dados.notaAtividade()!=null){
            this.notaAtividade = dados.notaAtividade();
        }
    }
    public Long getIdAlunoDisciplina() {
        return idAlunoDisciplina;
    }

    public void setIdAlunoDisciplina(Long idAlunoDisciplina) {
        this.idAlunoDisciplina = idAlunoDisciplina;
    }

    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Long getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNotaAtividade() {
        return notaAtividade;
    }

    public void setNotaAtividade(Double notaAtividade) {
        this.notaAtividade = notaAtividade;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }




}
