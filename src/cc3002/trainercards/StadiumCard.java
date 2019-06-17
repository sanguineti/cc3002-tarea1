package cc3002.trainercards;


import cc3002.abilities.effects.IEffect;
import cc3002.visitor.card.ICardVisitor;

public class StadiumCard extends AbstractTrainerCard {
    StadiumCard(String cardName, String description, IEffect effect, int parameter) {
        super(cardName, description, effect, parameter);
    }

    @Override
    public void accept(ICardVisitor v) {
        v.visitStadiumCard(this);
    }
}
