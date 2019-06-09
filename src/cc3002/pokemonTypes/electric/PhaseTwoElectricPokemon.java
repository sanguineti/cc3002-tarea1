package cc3002.pokemonTypes.electric;

import cc3002.Abilities.AttackContainer;
import cc3002.Trainer;
import cc3002.pokemonTypes.IPhaseTwoPokemon;

public class PhaseTwoElectricPokemon extends AbstractElectricPokemon implements IPhaseTwoPokemon {
    /**
     * Creates a new pokemon.
     *
     * @param cardName   The name of the card.
     * @param id         The card ID.
     * @param hp         The HP of the pokemon
     * @param attackList a list with the attacks of the Pokemon, that can be up to 4.
     */
    PhaseTwoElectricPokemon(String cardName, int id, int hp, AttackContainer attackList) {
        super(cardName, id, hp, attackList);
    }

    @Override
    public void checkPhaseOnePrePokemon(Trainer aTrainer) {

    }

    /**
     * {@inheritDoc}
     *
     * @param o The target Pokemon object
     * @return True if are equals, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhaseTwoElectricPokemon)) return false;
        return super.equals(o);
    }
}
