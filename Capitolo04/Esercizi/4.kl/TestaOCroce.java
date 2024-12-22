public class TestaOCroce {
    public String dammiTestaOCroce() {
        PariODispari pariODispari = new PariODispari();
        return switch(pariODispari.dammiPariODispari()) {
            case "Pari" -> "Testa";
            case "Dispari" -> "Croce";
            default -> "C'è un Bug!!!";
        };
    }
}
