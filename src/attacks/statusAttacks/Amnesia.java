package attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {
    public Amnesia()
    {
        super(Type.PSYCHIC,0,100);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 2);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Amnesia";
    }
}
