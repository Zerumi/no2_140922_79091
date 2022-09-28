package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam()
    {
        super(Type.ELECTRIC, 50, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, 1).turns(-1);
        pokemon.addEffect(effect);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Charge Beam!!";
    }
}
