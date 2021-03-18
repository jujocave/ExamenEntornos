package evf.javadoc.original;

public class Artista {
    String nombreArtista;
/** comentario con mi nombre juan jose cabral vega **/
    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
    }
    public String setNombreArtista(){
        return nombreArtista;
    }
}