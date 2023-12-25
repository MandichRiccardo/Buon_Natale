public class Main {
    public static void main(String[] args) {
        int totRighe = Interazione.input("quante righe metto per i rami?");
        String rami = stampaRami(0, totRighe);
        String tronco = stampaTronco(totRighe/3, totRighe);
        Interazione.output(rami + tronco + "Buon natale a Tutti!!!");
    }

    public static String stampaRami(int i, int tot){
        if(i==tot){
            return calcolaSpazi(i, tot) + stampaRamo(i+1) + calcolaSpazi(i, tot) + "\n";
        }
        return calcolaSpazi(i, tot) + stampaRamo(i+1) + calcolaSpazi(i, tot) + "\n" + stampaRami(i+1, tot);
    }
    public static String calcolaSpazi(int i, int tot){
        return elencaSpazi(tot+2-i);
    }
    public static String elencaSpazi(int a){
        if(a == 0) return "";
        return " " + elencaSpazi(a-1);
    }
    public static String stampaRamo(int i){
        if(i==1) return "*";
        return "*" + stampaRamo(i-1) + "*";
    }

    public static String stampaTronco(int i, int tot){
        if(i==1) return calcolaSpazi(1, tot) + "***" + calcolaSpazi(1, tot) + "\n";
        return stampaTronco(i-1, tot) + calcolaSpazi(1, tot) + "***" + calcolaSpazi(1, tot) + "\n";
    }
}