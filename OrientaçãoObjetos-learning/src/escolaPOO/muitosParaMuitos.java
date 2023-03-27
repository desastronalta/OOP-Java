package escolaPOO;
import escola.Diciplina;
import escola.Professor;
public class muitosParaMuitos {

	public static void main(String[] args) {
		Diciplina diciplina1 = new Diciplina();
		diciplina1.setNome("matematica");
		diciplina1.setCargaHoraria(80);
	
		Diciplina diciplina2 = new Diciplina();
		diciplina2.setNome("portugues");
		diciplina2.setCargaHoraria(80);
		
		Professor prof1 = new Professor();
		prof1.setNome("pedro");
		prof1.setMatricula("231");
		prof1.setSalario(1200);
		prof1.setFormacaoAcad("licenciado");
		
		Professor prof2 = new Professor();
		prof2.setNome("jose");
		prof2.setMatricula("897");
		prof2.setSalario(1500);
		prof2.setFormacaoAcad("licenciado");
		
		prof1.addDciplina(diciplina1);
		diciplina1.addProf(prof1);
		
		prof1.addDciplina(diciplina2);
		diciplina2.addProf(prof1);
		
		prof2.addDciplina(diciplina1);
		diciplina1.addProf(prof2);
		
		prof2.addDciplina(diciplina2);
		diciplina2.addProf(prof2);
		
		//listando as diciplinas do jao
		for (int i = 0; i < prof1.quantDiciplina();i++) {
			//Diciplina diciplina = prof1.getDiciplina(i);
			//System.out.println(diciplina.getNome());
			System.out.println(diciplina1.getProf(i).getNome());
		}
		for(int i = 0; i < diciplina1.quantProf();i++) {
			//uma forma de fazer 
			//Professor prof = diciplina1.getProf(i);
			//System.out.println(prof.getNome());
			System.out.println(prof1.getDiciplina(i).getNome());
		//esse segundo metodo é muito mais eficiente
		}
	}

}
