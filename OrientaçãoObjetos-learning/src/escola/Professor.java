package escola;

import java.util.ArrayList;

public class Professor extends Pessoa {
	private String formacaoAcad;
	private int salario;
	private ArrayList<Aluno> alunos;
	private ArrayList<Diciplina> diciplinas;
	private ArrayList<Turma> turmas;
	public String getFormacaoAcad() {
		return formacaoAcad;
	}

	public void setFormacaoAcad(String formacaoAcad) {
		this.formacaoAcad = formacaoAcad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public static void aplicarAvaliacao() {
		
	}
	public Professor() {
		diciplinas = new ArrayList<Diciplina>();
		turmas = new ArrayList<Turma>();
		alunos = new ArrayList<Aluno>();
		}
	public void addDciplina(Diciplina diciplina) {
		diciplinas.add(diciplina);
	}
	public void removDiciplina(Diciplina diciplina) {
		diciplinas.remove(diciplina);
		}
	public int quantDiciplina() {
		return diciplinas.size();
	}
	public Diciplina getDiciplina(int i) {
		
		return diciplinas.get(i);
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
	