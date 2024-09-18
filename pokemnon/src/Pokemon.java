public class Pokemon {
    private int nivel;
    private String tipo;
    private String genero;
    private int hpmax;
    private int hpAtual;
    private String ataque;
    private String nome;
    private int inicialhpAtual;
    private Treinador t;
    private Pokedex pokedex;
    private Inicial inicial;

 

    public Pokemon(String nome, int nivel, String tipo, String genero, int hpmax, int hpAtual, String ataque) {
        this.nome = nome;
        this.nivel = nivel;
        this.tipo =  tipo;
        this.genero = genero;
        this.hpmax = hpmax;
        this.hpAtual = hpAtual;
        this.ataque = ataque;
        
        this.inicialhpAtual = hpmax;
    
    }
    
public String toString(){
return  nome+
"\nNivel: " +nivel;

}


   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
   
 
    public String getGenero() {
        return genero;
    }

   
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public int getHpmax() {
        return hpmax;
    }

  
    public void setHpmax(int hpmax) {
        this.hpmax = hpmax;
    }

    
    public int getHpAtual() {
    
        return hpAtual;
    }

    public void setHpAtual(int hpAtual) {
        this.hpAtual = hpAtual;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    
    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }
    


   

    
    public int getInicialhpAtual(Treinador tr) {
        
        return inicialhpAtual;
    }
    
    
    public void setInicialhpAtual(int inicialhpAtual) {

        this.inicialhpAtual = inicialhpAtual;
    }


    
    public Pokedex getPokedex() {
        return pokedex;
    }

    
    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }

   
}
