package attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {
    public WillOWisp()
    {
        super(Type.FIRE,0,85);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().condition(Status.BURN).turns(-1);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Will-O-Wisp";
    }
}
