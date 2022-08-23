public class Pessoa {
    private int rg;
    private String nome;

    public Pessoa() {
        rg = 0;
        nome = "";
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
