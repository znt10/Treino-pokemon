
import java.util.Random;

public class Pokebola {




   

public void Cap(Treinador t,Pokemon p,Calcular calcular){

    Random random = new Random();
           
            double chanceCaptura = calcular.calcular(p);
            
            double numeroAleatorio = random.nextDouble();
            
            
        
            while(chanceCaptura <= numeroAleatorio){

                System.out.println("pokebola foi lancada");
                System.out.println();
                System.out.println(p.getNome() + " escapou");
                numeroAleatorio = random.nextDouble();
                System.out.println();
                chanceCaptura = calcular.calcular(p);
               
            }
                    
            if(chanceCaptura >= numeroAleatorio || chanceCaptura == 999.0){
                System.out.println("pokebola foi lancada");
                t.adicinarPokemonTreinador(p);
                System.out.println("\nPokemon "+ p.getNome() + "\nfoi capturado com sucesso");}
            
}}