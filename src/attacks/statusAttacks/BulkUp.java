package attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove {
    public BulkUp()
    {
        super(Type.FIGHTING,0,100);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.ATTACK, 1);
        pokemon.setMod(Stat.DEFENSE, 1);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Bulk Up";
    }
}
