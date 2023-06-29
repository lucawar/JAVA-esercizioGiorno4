package esercizio1;

public class MainEsercizio1 {

	public static void main(String[] args) {

		Dipendente luca = new Dipendente(10000, "001", 13.000, 50, DipendentiLivello.OPERAIO,
				DipendenteDipartimento.PRODUZIONE);
		Dipendente aldo = new Dipendente(10000, "001", 13.000, 50, DipendentiLivello.OPERAIO,
				DipendenteDipartimento.PRODUZIONE);
		Dipendente giacomo = new Dipendente(12000, "003", 15.600, 60, DipendentiLivello.IMPIEGATO,
				DipendenteDipartimento.VENDITE);
		Dipendente antonio = new Dipendente(20000, "005", 26.000, 0, DipendentiLivello.DIRIGENTE,
				DipendenteDipartimento.AMMINISTRAZIONE);

		luca.promuovi();
		System.out.println(luca.stampaDatiDipendente());

		aldo.promuovi();
		System.out.println(aldo.stampaDatiDipendente());

		giacomo.promuovi();
		System.out.println(giacomo.stampaDatiDipendente());

		double stipendioMensile = Dipendente.calcolaPaga(luca, 5);
		System.out.println(stipendioMensile);

		String datiDipendenti = luca.stampaDatiDipendente() + "\n" + aldo.stampaDatiDipendente() + "\n"
				+ giacomo.stampaDatiDipendente() + "\n" + antonio.stampaDatiDipendente();

		System.out.println(datiDipendenti);

		double sommaStipendi = Dipendente.calcolaPaga(luca, 5) + Dipendente.calcolaPaga(aldo, 5)
				+ Dipendente.calcolaPaga(giacomo, 5) + Dipendente.calcolaPaga(antonio, 5);

		System.out.println(sommaStipendi);
	}

}
