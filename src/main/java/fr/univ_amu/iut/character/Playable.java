package fr.univ_amu.iut.character;

import fr.univ_amu.iut.food.Food;

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
    //TODO ajouter le paramètre des batîments
    void move();

    /**
     * Permet au personnage de manger,
     * s'il ne se repose pas.
     *
     * @param food L'aliment.
     */
    void eat(Food food);

    /**
     * Permet au personnage de se reposer,
     * il ne peut pas manger pendant son repos.
     */
    void rest();
    /**
     * Permet au personnage d'effectuer une activité.
     * Cela augmente sa magie de Noël.
     */
    void activity();
}
