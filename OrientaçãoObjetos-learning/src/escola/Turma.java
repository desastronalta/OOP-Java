package escola;

import java.util.ArrayList;

public class Turma {
	private String sigla;
	private int ano;
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;
	private ArrayList<Diciplina> diciplinas;
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Turma() {
	// utilizado para inicializar uma nova lista assim que chamarmos o método construtor.
		alunos = new ArrayList<Aluno>();
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
		}
	public void removAluno(Aluno aluno) {
		alunos.remove(aluno);
		}
	public int quantAluno() {
		return alunos.size();
	}
	public Aluno getAluno(int i) {
		
		return alunos.get(i);
	}
}
