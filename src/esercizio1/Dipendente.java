package esercizio1;

public class Dipendente {

	private double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	public DipendentiLivello livello;
	public DipendenteDipartimento dipartimento;

	public Dipendente(String matricola, DipendenteDipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.importoOrarioStraordinario = 30;
		this.stipendio = this.stipendioBase;
		this.livello = DipendentiLivello.OPERAIO;
	}

	public Dipendente(double stipendioBase, String matricola, double stipendio, double importoOrarioStraordinario,
			DipendentiLivello livello, DipendenteDipartimento dipartimento) {
		this.stipendioBase = stipendioBase;
		this.matricola = matricola;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;

	}

	// METODI GET
	public double _getStipendioBase() {
		return this.stipendioBase;
	}

	public String _getMatricola() {
		return this.matricola;
	}

	public double _getStipendio() {
		return this.stipendio;
	}

	public double _getImportoOrarioStraordinario() {
		return this.importoOrarioStraordinario;
	}

	public DipendenteDipartimento _getDipendentiDipartimento() {
		return this.dipartimento;
	}

	public DipendentiLivello _getDipendentiLivello() {
		return this.livello;
	}

	// METODI SET
	public void _setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public void _setDipendenteDipartimento(DipendenteDipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	// METODI CLASSE
	public String stampaDatiDipendente() {
		return this.matricola + " " + this.stipendio + " " + this.stipendioBase + " " + this.importoOrarioStraordinario
				+ " " + this.dipartimento + " " + this.livello;
	}

	public DipendentiLivello promuovi() {
		switch (this.livello) {
		case OPERAIO:
			this.livello = DipendentiLivello.IMPIEGATO;
			this.stipendio = this.stipendioBase * 1.2;
			break;
		case IMPIEGATO:
			this.livello = DipendentiLivello.QUADRO;
			this.stipendio = this.stipendioBase * 1.5;
			break;
		case QUADRO:
			this.livello = DipendentiLivello.DIRIGENTE;
			this.stipendio = this.stipendioBase * 2;
			break;
		case DIRIGENTE:
			System.out.println("ERRORE IL DIRIGENTE NON PUò ESSERE PROMOSSO");
			break;
		default:
			break;
		}

		return this.livello;
	}

	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente._getStipendio() / 13;
	}

	public static double calcolaPaga(Dipendente dipendente, double oreStraordinario) {
		return dipendente._getStipendio() / 13 + dipendente._getImportoOrarioStraordinario() * oreStraordinario;
	}
}
