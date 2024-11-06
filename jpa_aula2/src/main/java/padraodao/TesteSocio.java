package padraodao;

import java.util.Date;

public class TesteSocio {

	public static void main(String[] args) {
		//objeto que será persistido no banco
		Socio socio = new Socio("Fuis", "Rua Kaslo", "256369", new Date());
		Socio socio2 = new Socio("Posle", "Rua Uisnnl", "365236", new Date());


		//criar DAO para persistir o objeto e chamar o método que salva
		SocioDAO objDAO = new SocioDAO();
		if (objDAO.salvar(socio))
			System.out.print("Sócio 1 foi salvo!!!");
		
		//modo mais otimizado
		if(new SocioDAO().salvar(socio2));
		System.out.print("Sócio 2 foi salvo!!!");

	}

}
