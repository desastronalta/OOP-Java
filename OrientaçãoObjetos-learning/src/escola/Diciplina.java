package escola;

import java.util.ArrayList;

public class Diciplina {
	private String nome;
	private int cargaHoraria;
	ArrayList<Aluno> alunos;
	ArrayList<Professor> professores;
	ArrayList<Turma> turmas;
	public String getNome() {
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		if(cargaHoraria > 0) {
		this.cargaHoraria = cargaHoraria;
		}
	}			
	public Diciplina() {
		professores = new ArrayList<Professor>();
	}
	public void addProf(Professor prof) {
		professores.add(prof);
	}
	public void removeProf(Professor prof) {
		professores.remove(prof);
	}
	public int  quantProf() {
		return professores.size();
	}
	public Professor getProf(int i) {
		return professores.get(i);
	}
}