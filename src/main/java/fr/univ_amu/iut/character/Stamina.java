package fr.univ_amu.iut.character;

/**
 * Jauge dont la valeur reste entre 0 et 1, bornes incluses.
 * <p>
 * Une valeur hors intervalle est ramenée à la borne la plus proche.
 * La jauge peut représenter la faim, la fatigue ou la magie de Noël.
 *
 * @author Alexandre SBEGHEN
 */
public class Stamina {
    private double value;

    /**
     * Constructeur de la jauge.
     *
     * @param value Valeur d'initialisation.
     */
    public Stamina(double value) {
        this.value = Math.clamp(value, 0, 1);
    }

    /**
     * Permet d'obtenir la valeur de la jauge.
     *
     * @return La valeur de la jauge.
     */
    public double get() {
        return value;
    }

    /**
     * Permet d'incrémenter ou décrémenter la
     * valeur de la jauge d'un certain delta.
     *
     * @param value Valeur à incrémenter / décrémenter.
     */
    public void change(double value) {
        this.value += value;
        this.value = Math.clamp(this.value, 0, 1);
    }
}
