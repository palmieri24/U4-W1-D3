import it.epicode.Rettangolo.Rettangolo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 1");
        System.out.println();

        System.out.println("Rettangolo 1");
        Rettangolo ret1 = new Rettangolo(10, 30);
        stampaRettangolo(ret1);
        System.out.println();

        System.out.println("Rettangolo 2");
        Rettangolo ret2 = new Rettangolo(15, 40);
        stampaRettangolo(ret2);
        System.out.println();
        stampaDueRettangoli(ret1, ret2);
    }

    public static void stampaRettangolo(Rettangolo rettangolo){
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2){
        System.out.println("Rettangolo 1: ");
        stampaRettangolo(rett1);

        System.out.println();
        System.out.println("Rettangolo 2: ");
        stampaRettangolo(rett2);

        int sommaArea = rett1.calcolaArea() + rett2.calcolaArea();
        int sommaPerimetri = rett1.calcolaPerimetro() + rett2.calcolaPerimetro();

        System.out.println();

        System.out.println("Somma perimetri: " + sommaPerimetri);

        System.out.println();

        System.out.println("Somma area: " + sommaArea);
    }
}


