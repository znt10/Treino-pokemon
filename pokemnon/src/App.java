public class App {
    public static void main(String[] args) throws Exception {
        
        Treinador t1 = new Treinador("jose", 5);
        Inicial i1 = new Inicial();
        Lutar l1 = new Lutar();
        Pokemon p1 = new Pokemon("caterpie", 2, "inseto", "femia", 120,120,"Tackle");

        Calcular c1 = new Calcular(l1);
    
        i1.pokemoninicial(t1);
        t1.jogaPokemon(t1,p1,c1);
        
        t1.buscaPokemon(p1);

}}

