package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
    public Overheat()
    {
        super(Type.FIRE, 130, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, -2);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Overheat!!";
    }
}
