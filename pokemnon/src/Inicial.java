import java.util.Scanner;

public class Inicial{


    Scanner sc = new Scanner(System.in);
    Ataques a1 = new Ataques("Vine Whip",45,25,100,"grama","fisico","dano");
    Ataques a2 = new Ataques("ember",45,25,20,"fogo","especial","dano");
    Ataques a3 = new Ataques("water gun",45,25,100,"agua","especial","dano");
    Status status1 = new Status(65,65,45,49,49,45);
    Status status2 = new Status(50,60,65,43,52,39);
    Status status3 = new Status(64,50,43,65,48,44);
    Pokemon p1 = new Pokemon("Bulbasar", 5, "grama", "macho",status1,a1);
    Pokemon p2 = new Pokemon("Charmander", 5, "fogo", "macho",status2,a2);
    Pokemon p3 = new Pokemon("Squirtle", 5, "agua", "macho", status3,a3);




    public void pokemoninicial(Treinador treinador) {
    p1.calcularstatus();
    p2.calcularstatus();
    p3.calcularstatus();

        System.out.println("Escolha seu Pokémon inicial:");
        System.out.println("1 - Bulbasar\n2 - Charmander\n3 - Squirtle");
        
        int op = sc.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("Agora seu inicial é Bulbasar");
                treinador.setPokemoninicial(p1);
                treinador.getPokedex().addEvoluco("Ivysaur");
                treinador.getPokedex().addEvoluco("Venusaur");

                break;
            case 2:
                System.out.println("Agora seu inicial é Charmander");
                treinador.setPokemoninicial(p2);
                treinador.getPokedex().addEvoluco("Charmeleon");
                treinador.getPokedex().addEvoluco("Charizard");
                break;
            case 3:
                System.out.println("Agora seu inicial é Squirtle");
                treinador.setPokemoninicial(p3);
                treinador.getPokedex().addEvoluco("Wartortle");
                treinador.getPokedex().addEvoluco("Blastoise");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
    

    

}