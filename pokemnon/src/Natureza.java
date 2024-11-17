public class Natureza {

    private String nome;
    private String aumento;
    private String reduzido;

    public Natureza(){

    }

    public Natureza(String nome, String aumento, String reduzido) {
        this.reduzido = reduzido;
        this.aumento = aumento;
        this.nome = nome;
    }




    public String getAumento() {
        return aumento;
    }

    public void setAumento(String aumento) {
        this.aumento = aumento;
    }

    public String getReduzido() {
        return reduzido;
    }

    public void setReduzido(String reduzido) {
        this.reduzido = reduzido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Natureza{" +
                "nome='" + nome + '\'' +
                ", aumento='" + aumento + '\'' +
                ", reduzido='" + reduzido + '\'' +
                '}';
    }
}
