public class eBooks extends Medium {
private String Autor;
private Double ISBN;
private int Seitenanzahl;
private String Auflage;
    public eBooks(String Titel, String Autor, Double ISBN, int Seitenanzahl, String Auflage, String Kommentar, Double Erscheinungsdatum, String Genre){
    super(Titel, Kommentar, Erscheinungsdatum, Genre);
    this.Autor = Autor;
    this.ISBN = ISBN;
    this.Seitenanzahl = Seitenanzahl;
    this.Auflage = Auflage;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public Double getISBN() {
        return ISBN;
    }

    public void setISBN(Double ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuflage() {
        return Auflage;
    }

    public void setAuflage(String auflage) {
        Auflage = auflage;
    }

    public int getSeitenanzahl() {
        return Seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        Seitenanzahl = seitenanzahl;
    }
}
