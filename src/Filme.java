public class Filme extends Medium {
private String Regisseur;
private Double Spielzeit;
private String UHD;
private String HD;
public Filme(String Titel, String Regisseur, Double Spielzeit, String UHD, String HD, String Kommentar, Double Erscheinungsdatum, String Genre){
super(Titel, Kommentar, Erscheinungsdatum, Genre);
this.Regisseur = Regisseur;
this.Spielzeit = Spielzeit;
this.UHD = UHD;
this.HD = HD;
}

    public String getRegisseur() {
        return Regisseur;
    }

    public void setRegisseur(String regisseur) {
        Regisseur = regisseur;
    }

    public Double getSpielzeit() {
        return Spielzeit;
    }

    public void setSpielzeit(Double spielzeit) {
        Spielzeit = spielzeit;
    }

    public String getUHD() {
        return UHD;
    }

    public void setUHD(String UHD) {
        this.UHD = UHD;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }
}
