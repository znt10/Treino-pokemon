import java.util.Random;
import java.util.Scanner;

public class Evolucao {
    Scanner sc = new Scanner(System.in);
    Random ra = new Random();

    public void evoluir(Treinador t,Pokemon p){
        Pokemon poke = t.getPokemoninicial();
        int subir = t.xp(p);


        int nivel = poke.getNivel();
        if (t.getPokedex().pokemons.size() >= 1 || t.getPokedex().derrotados.size() >= 1) {
            t.getPokedex().getDerrotados().clear();
            System.out.println("Seu pokemon subiu de nivel " + nivel +" para " + (nivel + subir) );
            poke.setNivel(nivel+subir);
            t.getPokemoninicial().calcularstatus();
            String nome = t.getPokedex().getEvolucoes().getFirst();
            String nome1 = t.getPokedex().getEvolucoes().getLast();

            if(poke.getNivel()>= 16 && nome != poke.getNome()){
                System.out.println("Seu pokemon esta evoluindo");
                System.out.println("Evoluio pra " + nome);
                t.getPokemoninicial().setNome(nome);

            } else if(poke.getNivel() >= 36 && nome1 != poke.getNome()) {
                System.out.println("Seu pokemon esta evoluindo");
                System.out.println("Evoluio pra " + nome1);
                t.getPokemoninicial().setNome(nome1);
            }

        }

    }


}
