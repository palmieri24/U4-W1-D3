import it.epicode.Chiamata.Chiamata;
import it.epicode.sim.sim;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 2");

        sim sim1 = new sim("+39 3494278804");
        sim1.aggiungiCredito(20);

        Chiamata[] listaChiamate = new Chiamata[5];
        listaChiamate[0] = new Chiamata("+39 343098909", 20);
        listaChiamate[1] = new Chiamata("+39 349217264", 1);
        listaChiamate[2] = new Chiamata("+39 356234567", 7);
        listaChiamate[3] = new Chiamata("+39 346234786", 1);
        listaChiamate[4] = new Chiamata("+39 340129384", 13);
        sim1.setListaChiamate(listaChiamate);
        sim1.stampaDati();
        }
    }