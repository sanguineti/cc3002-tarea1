package cc3002;

import cc3002.energyTypes.*;

/**
 * This class implements the IPokemon interface
 *
 * @author F. Giovanni Sanguineti
 */
public abstract class AbstractPokemon implements IPokemon {

    private String cardName;
    private int id;
    private int hp;
    private AttackContainer attackList;
    private Attack activeAttack;
    private EnergyContainer pokemonEnergy;

    /**
     * Creates a new pokemon.
     * @param cardName The name of the card.
     * @param id The card ID.
     * @param hp The HP of the pokemon
     * @param attackList a list with the attacks of the Pokemon, that can be up to 4.
     */
    public AbstractPokemon(String cardName, int id, int hp, AttackContainer attackList) {
        this.cardName = cardName;
        this.id = id;
        this.hp = hp;
        this.attackList = attackList;
        this.activeAttack = attackList.getAttack(1);
        this.pokemonEnergy = new EnergyContainer(0, 0, 0, 0, 0, 0);
    }

    /**
     * Returns the name of the card.
     * @return a String with the card name.
     */
    @Override
    public String getCardName() {
        return this.cardName;
    }

    /** Let a trainer plays the card.
     * @param aTrainer the Trainer that plays the card.
     */
    @Override
    public void playCard(Trainer aTrainer) {
        aTrainer.playPokemon(this);
    }

    /**
     * Returns the ID of the Pokemon.
     * @return a Integer with the Pokemon ID.
     */
    @Override
    public int getID() {
        return this.id;
    }

    /**
     * Returns the HP of the Pokemon.
     * @return a Integer with the Pokemon HP.
     */
    @Override
    public int getHP() {
        return this.hp;
    }

    /**
     * Returns the Pokemon active attack
     * @return the active attack.
     */
    @Override
    public Attack getActiveAttack() {
        return activeAttack;
    }

    /**
     * Select an active attack from a list of attacks.
     * @param index the number of the attack that wants to select, from 1 to 4.
     */
    @Override
    public void setActiveAttack(int index) {
        Attack aux = this.attackList.getAttack(index);
        if (aux.isEnoughEnergyToUseTheAttack(pokemonEnergy) && isAlive()) activeAttack = aux;
    }

    /**
     * Shows if the Pokemon is Alive. If the HP is higher than 0, returns true, else returns false.
     *
     * @return a boolean with the alive status.
     */
    @Override
    public boolean isAlive() {
        return this.hp > 0;
    }

    /**
     * Give an electric energy to the target Pokemon.
     * @param energy a electric energy.
     */
    @Override
    public void receiveElectricEnergy(ElectricEnergy energy) {
        this.pokemonEnergy.addEnergy("Electric");
    }

    /**
     * Give an fighting energy to the target Pokemon.
     * @param energy a fighting energy.
     */
    @Override
    public void receiveFightingEnergy(FightingEnergy energy) {
        this.pokemonEnergy.addEnergy("Fighting");
    }

    /**
     * Give an fire energy to the target Pokemon.
     * @param energy a fire energy.
     */
    @Override
    public void receiveFireEnergy(FireEnergy energy) {
        this.pokemonEnergy.addEnergy("Fire");
    }

    /**
     * Give an grass energy to the target Pokemon.
     * @param energy a grass energy.
     */
    @Override
    public void receiveGrassEnergy(GrassEnergy energy) {
        this.pokemonEnergy.addEnergy("Grass");
    }

    /**
     * Give an psychic energy to the target Pokemon.
     * @param energy a psychic energy.
     */
    @Override
    public void receivePsychicEnergy(PsychicEnergy energy) {
        this.pokemonEnergy.addEnergy("Psychic");
    }

    /**
     * Give an water energy to the target Pokemon.
     * @param energy a water energy.
     */
    @Override
    public void receiveWaterEnergy(WaterEnergy energy) {
        this.pokemonEnergy.addEnergy("Water");
    }

    /**
     * Shows the number of electric energies that has the Pokemon.
     * @return a int with the number of electric energies of the Pokemon.
     */
    @Override
    public int getElectricEnergyQuantity() {
        return this.pokemonEnergy.getElectric();
    }

    /**
     * Shows the number of fighting energies that has the Pokemon.
     * @return a int with the number of fighting energies of the Pokemon.
     */
    @Override
    public int getFightingEnergyQuantity() {
        return this.pokemonEnergy.getFighting();
    }

    /**
     * Shows the number of fire energies that has the Pokemon.
     * @return a int with the number of fire energies of the Pokemon.
     */
    @Override
    public int getFireEnergyQuantity() {
        return this.pokemonEnergy.getFire();
    }

    /**
     * Shows the number of grass energies that has the Pokemon.
     * @return a int with the number of grass energies of the Pokemon.
     */
    @Override
    public int getGrassEnergyQuantity() {
        return this.pokemonEnergy.getGrass();
    }

    /**
     * Shows the number of grass energies that has the Pokemon.
     * @return a int with the number of grass energies of the Pokemon.
     */
    @Override
    public int getPsychicEnergyQuantity() {
        return this.pokemonEnergy.getPsychic();
    }

    /**
     * Shows the number of water energies that has the Pokemon.
     * @return a int with the water of fighting energies of the Pokemon.
     */
    @Override
    public int getWaterEnergyQuantity() {
        return this.pokemonEnergy.getWater();
    }

    /**
     * Lets the Pokemon be attacked by an electric Pokemon
     * @param anAttack the attack that the electric Pokemon performs to this Pokemon
     */
    @Override
    public void receiveElectricPokemonAttack(Attack anAttack) {
        receiveAttack(anAttack);
    }

    /**
     * Lets the Pokemon be attacked by an fighting Pokemon
     * @param anAttack the attack that the fighting Pokemon performs to this Pokemon
     */
    @Override
    public void receiveFightingPokemonAttack(Attack anAttack) {
        receiveAttack(anAttack);
    }

    /**
     * Lets the Pokemon be attacked by an fire Pokemon
     * @param anAttack the attack that the fire Pokemon performs to this Pokemon
     */
    @Override
    public void receiveFirePokemonAttack(Attack anAttack) {
        receiveAttack(anAttack);
    }

    /**
     * Lets the Pokemon be attacked by an grass Pokemon
     * @param anAttack the attack that the grass Pokemon performs to this Pokemon
     */
    @Override
    public void receiveGrassPokemonAttack(Attack anAttack) {
        receiveAttack(anAttack);
    }

    /**
     * Lets the Pokemon be attacked by an psychic Pokemon
     * @param anAttack the attack that the psychic Pokemon performs to this Pokemon
     */
    @Override
    public void receivePsychicPokemonAttack(Attack anAttack) {
        receiveAttack(anAttack);
    }

    /**
     * Lets the Pokemon be attacked by an water Pokemon
     * @param anAttack the attack that the water Pokemon performs to this Pokemon
     */
    @Override
    public void receiveWaterPokemonAttack(Attack anAttack) {
        receiveAttack(anAttack);
    }

    /**
     * Lets the Pokemon receive an type-weakness attack that hits the double of his base damage.
     * @param anAttack the type-weakness attack that the Pokemon receives
     */
    @Override
    public void receiveWeaknessPokemonTypeAttack(Attack anAttack) {
        this.hp -= 2 * anAttack.getBaseDamage();
    }

    /**
     * Lets the Pokemon receive an type-resistant attack that hits his base damage minus 30. If the attack has a
     * base damage lower than 30, the Pokemon HP is not changed.
     * @param anAttack the type-resistant attack that the Pokemon receives.
     */
    @Override
    public void receiveResistantPokemonTypeAttack(Attack anAttack) {
        int aux = anAttack.getBaseDamage() - 30;
        if (aux > 0) this.hp -= (anAttack.getBaseDamage() - 30);
    }

    /**
     * Lets the Pokemon receive a normal attack that doesn't has type-weakness or type-resistant to the Pokemon that
     * performs it.
     * @param anAttack the attack that the Pokemon receives.
     */
    @Override
    public void receiveAttack(Attack anAttack) {
        this.hp -= anAttack.getBaseDamage();
    }

    /**
     * Performs the correct attack to the target Pokemon.
     *
     * @param other the target Pokemon.
     */
    @Override
    public abstract void attack(IPokemon other);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPokemon)) return false;
        AbstractPokemon that = (AbstractPokemon) o;
        return id == that.id &&
                hp == that.hp &&
                getCardName().equals(that.getCardName()) &&
                attackList.equals(that.attackList) &&
                getActiveAttack().equals(that.getActiveAttack()) &&
                pokemonEnergy.equals(that.pokemonEnergy);
    }

}
