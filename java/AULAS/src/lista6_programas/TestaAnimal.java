package lista6_programas;

import lista6_objetos.Cachorro;
import lista6_objetos.Cavalo;
import lista6_objetos.Preguica;

public class TestaAnimal {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro("Scooby",12, "Au Au", "Vira Lata Caramelo");
		Cavalo manco = new Cavalo("Alazão", 8, "Pocotó", "Médio");
		Preguica ora = new Preguica("Sid", 40, "...", "Arvre");
		
		System.out.println(dog.getNome());
		dog.movimento();
		System.out.println(manco.getNome());
		manco.movimento();
		System.out.println(ora.getNome());
		ora.movimento();
		

	}

}
