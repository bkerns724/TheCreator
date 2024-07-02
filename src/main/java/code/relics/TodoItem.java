package code.relics;

import code.CreatorCharacter;

import static code.CreatorMod.makeID;

public class TodoItem extends AbstractEasyRelic {
    public static final String ID = makeID("TodoItem");

    public TodoItem() {
        super(ID, RelicTier.STARTER, LandingSound.FLAT, CreatorCharacter.Enums.CREATOR_COLOR);
    }
}
