import java.util.Scanner;

public class Treinar {
    Scanner sc = new Scanner(System.in);

    public void treinar(Treinador t, Evolucao evo) {
        while (true) {
            Ataques a2 = new Ataques("Tackle", 40, 35, 100, "Normal", "fisico");
            Ataques a3 = new Ataques("Thunderbolt", 90, 15, 100, "Electric", "especial");
            Ataques a4 = new Ataques("Heal Bell", 0, 5, 100, "Normal", "especial");

            Status status1 = new Status(20, 20, 45, 35, 30, 45);
            Status status3 = new Status(55, 40, 50, 50, 90, 65);
            Status status4 = new Status(250, 5, 5, 35, 105, 30);

            Pokemon p1 = new Pokemon("caterpie", 2, "inseto", "femia", status1, a2);
            Pokemon p3 = new Pokemon("Pikachu", 25, "eletrico", "macho", status3, a3);
            Pokemon p4 = new Pokemon("Chansey", 50, "normal", "femia", status4, a4);


            System.out.println("1==Facil");
            System.out.println("2==Media");
            System.out.println("3==Dificil");

            int op = sc.nextInt();
            if (op == 1) {
                p1.getStatus().setHp(p1.getStatus().getHpmax());
                t.jogaPokemon(t,p1);
            } else if (op == 2) {
                p3.getStatus().setHp(p3.getStatus().getHpmax());
                t.jogaPokemon(t,p3);

            } else if (op == 3) {
                p4.getStatus().setHp(p4.getStatus().getHpmax());
                t.jogaPokemon(t,p4);
            }
            if ( t.getPokemoninicial().getStatus().getHp() <= 0) {
                break;
            }
            System.out.println("1==Ficar\n2==Sair");
            int op2 = sc.nextInt();

             if(op2 == 2){
                break;
            }


        }
    }
}