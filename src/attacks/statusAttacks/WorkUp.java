package attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp()
    {
        super(Type.NORMAL,0,100);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.ATTACK, 1);
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Work Up";
    }
}
