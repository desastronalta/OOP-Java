package escolaPOO;

import escola.Diciplina;

public class EscolaPOO {

	public static void main(String[] args) {
		Diciplina diciplina = new Diciplina();
		String matematica = "matematica";
		diciplina.setNome(matematica);
		int cargaHoraria = 320;
		diciplina.setCargaHoraria(cargaHoraria);
		
		System.out.println(diciplina.getNome());
		System.out.println(diciplina.getCargaHoraria());
		}

}
