import java.util.Scanner;

public class Curar {
    Scanner sc = new Scanner(System.in);
    public void heal(Pokemon poke){
        int tot = poke.getStatus().getHpmax() - poke.getStatus().getHp();
        int hpi = poke.getStatus().getHp();

        System.out.println("Qual poçao quer usar");
        System.out.println("1=Potion");
        System.out.println("2=Super Potion");
        System.out.println("3=Hyper Potion");
        System.out.println("4=Full Restore");
        sc.nextLine();
        int opci = sc.nextInt();

        switch (opci) {
            case 1:
                if(hpi + 20 > poke.getStatus().getHpmax()){

                    int heal = poke.getStatus().getHpmax() - poke.getStatus().getHp();
                    System.out.println("CUROU " + heal);
                    poke.getStatus().setHp(poke.getLutar().atualizarHpPokemon(poke, 0) + heal);
                    System.out.println(poke.getStatus().getHp());
                }else {
                    System.out.println("CUROU " + 20);
                    poke.getStatus().setHp(poke.getLutar().atualizarHpPokemon(poke, 0)+ 20);
                    System.out.println(poke.getStatus().getHp());}
                break;
            case 2:
                if(hpi + 60 > poke.getStatus().getHpmax()){
                    int heal = poke.getStatus().getHpmax() - poke.getStatus().getHp();
                    System.out.println("CUROU " + heal);
                    poke.getStatus().setHp(poke.getLutar().atualizarHpPokemon(poke, 0) + heal);
                    System.out.println(poke.getStatus().getHp());
                }else {
                    System.out.println("CUROU " + 60);
                    poke.getStatus().setHp(poke.getLutar().atualizarHpPokemon(poke, 0) + 60);
                    System.out.println(poke.getStatus().getHp());}
                break;
            case 3:
                if(hpi + 80 > poke.getStatus().getHpmax()){

                    int heal = poke.getStatus().getHpmax() - poke.getStatus().getHp();
                    System.out.println("CUROU " + heal);
                    poke.getStatus().setHp(poke.getLutar().atualizarHpPokemon(poke, 0) + heal);
                    System.out.println(poke.getStatus().getHp());
                }else {
                    System.out.println("CUROU " + 80);
                    poke.getStatus().setHp(poke.getLutar().atualizarHpPokemon(poke, 0)+ 80);
                    System.out.println(poke.getStatus().getHp());}
                break;
            case 4:
                System.out.println("CUROU o HP TOTAl");
                poke.getStatus().setHp(poke.getLutar().atualizarHpPokemon(poke, 0)+ tot);
                System.out.println(poke.getStatus().getHp());
                break;
            default:
                System.out.println("OP invalida");
        }


    }}

