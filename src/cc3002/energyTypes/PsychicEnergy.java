package cc3002.energyTypes;
import cc3002.AbstractEnergy;

import java.util.Objects;

public class PsychicEnergy extends AbstractEnergy {
    private String cardName = "Psychic Energy";

    public PsychicEnergy() {
    }

    @Override
    public String getCardName() {
        return null;
    }

    @Override
    public void playCard() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PsychicEnergy)) return false;
        PsychicEnergy that = (PsychicEnergy) o;
        return Objects.equals(cardName, that.cardName);
    }

}
