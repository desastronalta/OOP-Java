package escola;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Pessoa {
	private Date dataNascimento;
	private Turma turma;
	private ArrayList<Professor> professores;
	private ArrayList<Diciplina> diciplinas;
	
	
public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	public ArrayList<Diciplina> getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(ArrayList<Diciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}

public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

public static void realizarAvaliacao() {
		
	}
}
