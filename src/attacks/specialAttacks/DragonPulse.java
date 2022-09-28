package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class DragonPulse extends SpecialMove {
    public DragonPulse()
    {
        super(Type.DRAGON, 85, 100);
    }

    @Override
    protected String describe() {
        return "применяет Dragon Pulse!!";
    }
}
