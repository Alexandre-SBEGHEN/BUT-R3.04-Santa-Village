package fr.univ_amu.iut.character;

/**
 * Elle regroupe les actions communes qu'un personnage peut
 * effectuer.
 *
 * @author Kawthar CHAIB EDDOUR
 */

public interface Playable {
    /**
     * Permet au personnage d'émettre un son.
     */
    void emit();

    /**
     * Permet au personnage de se déplacer.
     */
    void move();

    /**
     * Permet au personnage de manger,
     * s'il ne se repose pas.
     */
    void eat();

    /**
     * Permet au personnage d'effectuer une activité.
     * Cela augmente sa magie de Noël.
     */
    void activity();
}
