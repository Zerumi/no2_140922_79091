package pokemons;

import attacks.statusAttacks.Amnesia;

public class Piloswine extends Swinub {
    public Piloswine(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(100,100,80,60,60,50);
        this.addMove(new Amnesia());
    }
}
