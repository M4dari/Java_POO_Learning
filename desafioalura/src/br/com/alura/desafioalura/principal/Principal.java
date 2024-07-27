package br.com.alura.desafioalura.principal;

import br.com.alura.desafioalura.modelos.Musica;
import br.com.alura.desafioalura.modelos.Podcast;
import br.com.alura.desafioalura.modelos.Preferidas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Musica minhaMusica= new Musica();
		minhaMusica.setTitulo("By the way");
		minhaMusica.setCantor("Red hot chilli peppers");

		for(int i=0; i<1000; i++) {
			minhaMusica.reproduz();
		}
		
		for(int i=0; i<50; i++) {
			minhaMusica.daCurtida();
			}
			
			Podcast meuPodcast= new Podcast();
			
			meuPodcast.setHost("Lorelay Fox");
			meuPodcast.setTitulo("Para Tudo");
			
			for(int i=0; i<5000; i++) {
				meuPodcast.reproduz();
				}
			for(int i=0; i<1000; i++) {
				meuPodcast.daCurtida();
				}
		
		Preferidas minhasPreferidas = new Preferidas();
		
		minhasPreferidas.inclui(meuPodcast);
		minhasPreferidas.inclui(minhaMusica);
	}

}
