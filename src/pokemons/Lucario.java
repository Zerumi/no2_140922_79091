package pokemons;

import attacks.specialAttacks.DragonPulse;
import ru.ifmo.se.pokemon.Type;

public class Lucario extends Riolu {
    public Lucario(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(70,110,70,115,70,90);
        this.setType(Type.FIGHTING,Type.STEEL);
        this.addMove(new DragonPulse());
    }
}
