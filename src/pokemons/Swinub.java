package pokemons;

import attacks.statusAttacks.Confide;
import attacks.statusAttacks.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon {
    public Swinub(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(50,50,40,30,30,50);
        this.setType(Type.ICE, Type.GROUND);
        this.addMove(new DoubleTeam());
        this.addMove(new Confide());
    }
}
