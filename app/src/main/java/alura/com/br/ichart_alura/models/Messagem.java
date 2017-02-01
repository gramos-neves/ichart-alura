package alura.com.br.ichart_alura.models;

/**
 * Created by gui on 30/01/2017.
 */

public class Messagem {

    private String texto;
    private int id;

    public Messagem(String texto, int id) {
        this.texto = texto;
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
