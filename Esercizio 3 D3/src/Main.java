import it.epicode.article.Article;
import it.epicode.cart.Cart;
import it.epicode.client.Client;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 3");

            Client aldo = new Client("1234", "Aldo", "Baglio", "aldo@baglio.com", new Date());
            Article telefono = new Article("Iphone", "Super", 1000);
            telefono.aggiungiPezziAMagazzino(20);
            System.out.println(telefono);
            Article tv = new Article("Samsung", "Mediocre", 500);
            Cart carrelloDiAldo = new Cart(aldo);

            Article[] listaArticoliComprati = { telefono, tv };
            carrelloDiAldo.setElencoArticoli(listaArticoliComprati);
            System.out.println(carrelloDiAldo.getTotaleCostoArticoli());
        }
        }

