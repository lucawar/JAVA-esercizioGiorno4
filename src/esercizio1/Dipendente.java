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
	public double getStipendioBase() {
		return this.stipendioBase;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public double getStipendio() {
		return this.stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return this.importoOrarioStraordinario;
	}

	public DipendenteDipartimento getDipendentiDipartimento() {
		return this.dipartimento;
	}

	public DipendentiLivello getDipendentiLivello() {
		return this.livello;
	}

	// METODI SET
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public void setDipendenteDipartimento(DipendenteDipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

}
