package entities;

import javax.persistence.Entity;

@Entity
public class GaraDiAtletica extends Evento {

	/*
	 * @OneToMany(mappedBy = "gara", cascade = CascadeType.ALL)
	 * 
	 * @OrderBy("nome DESC") private Set<Persona> listaAtleti;
	 * 
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "persona_id", referencedColumnName = "id") private Persona
	 * vincitore;
	 * 
	 * public void setListaAtleti(Set<Persona> listaAtleti) { this.listaAtleti =
	 * listaAtleti; }
	 * 
	 * public Set<Persona> getListaAtleti() { return listaAtleti; }
	 * 
	 * public void setVincitore(Persona vincitore) { this.vincitore = vincitore; }
	 * 
	 * public Persona getVincitore() { return vincitore; }
	 * 
	 * public GaraDiAtletica() {
	 * 
	 * }
	 * 
	 * public GaraDiAtletica(Set<Persona> listaAtleti, Persona vincitore) {
	 * setListaAtleti(listaAtleti); setVincitore(vincitore); }
	 * 
	 * @Override public String toString() { String infoGara = "GaraDiAtletica: [";
	 * 
	 * for (Persona persona : listaAtleti) { infoGara += "atleta:" +
	 * persona.getNome() + ","; } infoGara += "vincitore:" + vincitore + "]";
	 * 
	 * return infoGara; }
	 */

}
