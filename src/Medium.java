public class Medium {
private String Titel;
private String Genre;
private Double Erscheinungsdatum;
private String Kommentar;
    public Medium(String Titel, String Genre, Double Erscheinungsdatum, String Kommentar){
        this.Titel = Titel;
        this.Genre = Genre;
        this.Erscheinungsdatum = Erscheinungsdatum;
        this.Kommentar = Kommentar;

    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public Double getErscheinungsdatum() {
        return Erscheinungsdatum;
    }

    public void setErscheinungsdatum(Double erscheinungsdatum) {
        Erscheinungsdatum = erscheinungsdatum;
    }

    public String getKommentar() {
        return Kommentar;
    }

    public void setKommentar(String kommentar) {
        Kommentar = kommentar;
    }
}
