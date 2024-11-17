public class Dano {





    public int CalculardanoInicial(Pokemon pokeinicial, Pokemon pokemon ) {
        Semdano(pokeinicial);
        int power = pokeinicial.getAtaque().getPower();
        int ataque = pokeinicial.getStatus().getAttack();
        int spattack = pokeinicial.getStatus().getSpattack();

        int spdefense = pokemon.getStatus().getDefense();
        int defense = pokemon.getStatus().getSpdefense();

        switch (pokemon.getAtaque().getTipoata()) {
            case "fisico":
                return ((2*pokemon.getNivel()/5 + 2)* power * (ataque / defense ) / 50) + 2;
            
            case "especial":
                return ((2*pokemon.getNivel()/5 + 2)* power * (spattack / spdefense ) / 50) + 2;
            default:
                break;}

    return 0;
}

    public int Calcularinimigo(Pokemon poke, Pokemon pokemon) {
        Semdano(pokemon);
        int power1 = pokemon.getAtaque().getPower();
        int ataque1 = pokemon.getStatus().getAttack();
        int spattack1 = pokemon.getStatus().getSpattack();

        int spdefense1 = poke.getStatus().getDefense();
        int defense1 = poke.getStatus().getSpdefense();

        switch (pokemon.getAtaque().getTipoata()) {
            case "fisico":
                return ((2*pokemon.getNivel()/5 + 2)* power1 * (ataque1 / defense1 ) / 50) + 2;
            
            case "especial":
                return ((2*pokemon.getNivel()/5 + 2)* power1 * (spattack1 / spdefense1 ) / 50) + 2;
            default:
                break;
        }
return 0;
    }
    private int Semdano(Pokemon poke){
        int i  = poke.getAtaque().getPower();
        if(i == 0){
            switch (poke.getAtaque().getHeal()) {
                case "curar":
                int c = (int) (poke.getStatus().getHp() / 0.5);
                return c;
                case "status":
                return 0;
                default:
                    break;
            }
        }
return 0;
    }


}
