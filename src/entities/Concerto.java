package entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Concerto extends Evento {

	@Column(name = "genere")
	private Genere genere;

	@Column(name = "inStreaming")
	private boolean inStreaming;

	public void setGenere(Genere genere) {
		this.genere = genere;
	}

	public Genere getGenere() {
		return genere;
	}

	public void setInStreaming(boolean inStreaming) {
		this.inStreaming = inStreaming;
	}

	public boolean getInStreaming() {
		return inStreaming;
	}

	public Concerto() {

	}

	public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti, Location location, Genere genere, boolean inStreaming) {
		super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
		setGenere(genere);
		setInStreaming(inStreaming);
	}

	@Override
	public String toString() {
		return "Concerto [genere=" + genere + ", inStreaming=" + inStreaming + "]";
	}

}
