import java.util.Scanner;

public class Calcular {
    private Lutar lutar;
    

    public Calcular (Lutar lutar){
        this.lutar = lutar;
    }
    
    

    Scanner sc = new Scanner(System.in);

    public double calcular(Pokemon pokemon){

        System.out.println("Qual pokeboll q usar\n==1 POKÉ BALL \n==2 GREAT BALL \n==3 ULTRA BALL\n==4 MASTER BALL");
        int op = sc.nextInt();
        double chance = 0.0;
        double hpRatio = (double) (pokemon.getHpmax() - pokemon.getHpAtual()) / pokemon.getHpmax();
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
            System.out.println("Opçao invalida, pokebola normal foi lançanda");
                chance = hpRatio * 1.0;
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
