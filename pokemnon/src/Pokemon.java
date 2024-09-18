public class Pokemon {
    private int nivel;
    private String tipo;
    private String genero;
    private int hpmax;
    private int hpAtual;
    private String ataque;
    private String nome;
    private int inicialhpmax;
    private int inicialhpAtual;
    private Treinador t;
    private Pokedex pokedex;


    public Pokemon(String nome, int nivel, String tipo, String genero, int hpmax, int hpAtual, String ataque) {
        this.nome = nome;
        this.nivel = nivel;
        this.tipo =  tipo;
        this.genero = genero;
        this.hpmax = hpmax;
        this.hpAtual = hpAtual;
        this.ataque = ataque;
    
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


    /**
     * @return int return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * @return String return the ataque
     */
    public String getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }
    


    /**
     * @return int return the inicialhpmax
     */
    public int getInicialhpmax() {
        return inicialhpmax;
    }

    /**
     * @param inicialhpmax the inicialhpmax to set
     */
    public void setInicialhpmax(int inicialhpmax) {
        this.inicialhpmax = inicialhpmax;
    }

    /**
     * @return int return the inicialhpAtual
     */
    public int getInicialhpAtual() {
        this.t.getPokemoninicial().inicialhpAtual = inicialhpAtual;
        return inicialhpAtual;
    }
    
    /**  
     * @param inicialhpAtual the inicialhpAtual to set
     */
    public void setInicialhpAtual(int inicialhpAtual) {
        
        this.inicialhpAtual = inicialhpAtual;
    }

}
