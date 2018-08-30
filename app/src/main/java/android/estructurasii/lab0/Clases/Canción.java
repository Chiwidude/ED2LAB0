package android.estructurasii.lab0.Clases;

public class Canción {
    private String Nombre;
    private double Duración;
    private String Artista;
    private String Album;


    public Canción(String Nombre_, double Duración_, String Artista_, String Album_) {
        this.setNombre(Nombre_);
        this.setDuración(Duración_);
        this.setAlbum(Album_);
        this.setArtista(Artista_);

    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getDuración() {
        return Duración;
    }

    public void setDuración(double duración) {
        Duración = duración;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

}
