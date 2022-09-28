package pokemons;

import attacks.physicalAttacks.Bulldoze;

public class Mamoswine extends Piloswine {
    public Mamoswine(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(110,130,80,70,60,80);
        this.addMove(new Bulldoze());
    }
}
