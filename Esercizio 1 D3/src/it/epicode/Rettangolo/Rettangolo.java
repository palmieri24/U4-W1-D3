package it.epicode.Rettangolo;

public class Rettangolo {
int altezza;
int larghezza;

public Rettangolo(int alt, int largh){
    this.altezza = alt;
    this.larghezza = largh;
}

public int calcolaArea() {
    return altezza * larghezza;
}

public int calcolaPerimetro(){
    return (altezza + larghezza) * 2;
}

}

