package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab()
    {
        super(Type.POISON,80,100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().chance(0.3).condition(Status.POISON);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет PoisonJab";
    }
}
