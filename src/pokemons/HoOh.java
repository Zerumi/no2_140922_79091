package pokemons;

import attacks.specialAttacks.ChargeBeam;
import attacks.specialAttacks.Overheat;
import attacks.statusAttacks.Confide;
import attacks.statusAttacks.WillOWisp;
import ru.ifmo.se.pokemon.*;

public class HoOh extends Pokemon {
    public HoOh(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(106,130,90,110,154,90);
        this.setType(Type.FIRE, Type.FLYING);
        this.addMove(new WillOWisp());
        this.addMove(new Confide());
        this.addMove(new ChargeBeam());
        this.addMove(new Overheat());
    }
}
