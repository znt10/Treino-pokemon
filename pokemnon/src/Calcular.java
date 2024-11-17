import java.util.Scanner;

public class Calcular {
    private Lutar lutar;
    

    public Calcular (){

    }
    
    

    Scanner sc = new Scanner(System.in);

    public double calcular(Pokemon pokemon){

        System.out.println("Qual pokeboll q usar\n==1 POKÉ BALL \n==2 GREAT BALL \n==3 ULTRA BALL\n==4 MASTER BALL\n==5 DESEJA SAIR?");
        int op = sc.nextInt();
        double chance = 0.0;
        double hpRatio = (double) (pokemon.getStatus().getHp() - pokemon.getStatus().getHp()) / pokemon.getStatus().getHp();
        if (hpRatio == 0.0) {
            hpRatio = 0.01;
        }
        switch (op) {
            case 1:
                chance = hpRatio * 1.0;
            break;
            case 2:
                chance = hpRatio * 1.5;
            break;
            case 3:
                chance = hpRatio * 2.0;
            break;
            case 4:
                chance = 999.0;
            break;
            default:
            System.out.println("SAIU");
            chance = 0;
            break;
        }
    return chance;



    
}


    /**
     * @return Lutar return the lutar
     */
    public Lutar getLutar() {
        return lutar;
    }

    /**
     * @param lutar the lutar to set
     */
    public void setLutar(Lutar lutar) {
        this.lutar = lutar;
    }

}
