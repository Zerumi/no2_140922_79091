package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze()
    {
        super(Type.GROUND,60,100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.SPEED, -1);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Bulldoze";
    }
}
