package escolaPOO;
import escola.Aluno;
import escola.Turma;
import java.util.Date;
public class AssociacaoParaUm {
	public static void main(String[]args) {
		Turma turma1 = new Turma();
		turma1.setSigla("2A");
		turma1.setAno(2);
		
		System.out.println(turma1.getSigla());
		System.out.println(turma1.getAno());
		Aluno aluno1 = new Aluno();
		aluno1.setNome("jose");
		aluno1.setDataNascimento( new Date());
		aluno1.setMatricula("123");
		aluno1.setTurma(turma1);
		turma1.addAluno(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setDataNascimento( new Date());
		aluno2.setNome("ze");
		aluno2.setMatricula("124");
		aluno2.setTurma(turma1);
		turma1.addAluno(aluno2);
		
		
	}
}
