package pokemons;

import attacks.physicalAttacks.PoisonJab;
import attacks.statusAttacks.BulkUp;
import attacks.statusAttacks.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Riolu extends Pokemon {
    public Riolu(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(40,70,40,35,40,60);
        this.setType(Type.FIGHTING);
        this.addMove(new BulkUp());
        this.addMove(new PoisonJab());
        this.addMove(new WorkUp());
    }
}
