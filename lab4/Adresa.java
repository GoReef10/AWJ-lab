public class Adresa {
    private String numeStrada;
    private int numarBloc;

    public Adresa(String strada, int numar) {
        numeStrada = strada;
        numarBloc = numar;
    }

    public String toString() {
        return "numeStrada: " + numeStrada + " ,numarBloc: " + numarBloc;
    }

    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(!(o instanceof Adresa))
            return false;
        Adresa a = (Adresa) o;
        return this.numarBloc == a.numarBloc && this.numeStrada.equals(a.numeStrada);
    }

    public String getNumeStrada() {
        return numeStrada;
    }

    public int getNumarBloc() {
        return numarBloc;
    }

    public void setNumeStrada(String numeStrada) {
        this.numeStrada = numeStrada;
    }

    public void setNumarBloc(int numarBloc) {
        this.numarBloc = numarBloc;
    }
}
