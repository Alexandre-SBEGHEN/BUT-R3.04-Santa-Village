package fr.univ_amu.iut.building.unoccupiable;

import org.junit.jupiter.api.Test;

/**
 * Test de la classe Pantry.
 *
 * @see Pantry
 *
 * @author Alexandre SBEGHEN
 */
public class PantryTest {

    /**
     * Vérifie qu'une réserve vide
     * est bien créée avec un stock nul
     * pour chaque nourriture.
     */
    @Test
    void createEmptyPantry() {
        // TODO : Créer le test
    }

    /**
     * Vérifie qu'une réserve non
     * vide est bien créée avec le même
     * stock pour chaque nourriture.
     */
    @Test
    void createNotEmptyPantry() {
        // TODO : Créer le test
    }

    /**
     * Vérifie que l'on peut prendre
     * une nourriture si le stock
     * n'est pas vide.
     */
    @Test
    void takeOneAndSuccess() {
        // TODO : Créer le test
    }

    /**
     * Vérifie que l'on ne peut pas
     * prendre une nourriture si
     * le stock n'est pas vide.
     */
    @Test
    void takeOneAndFail() {
        // TODO : Créer le test
    }

    /**
     * Vérifie que l'on peut prendre
     * plusieurs fois de la nourriture
     * si le stock est suffisant.
     */
    @Test
    void takeManyAndSuccess() {
        // TODO : Créer le test
    }

    /**
     * Vérifie que l'on ne peut pas prendre
     * plusieurs fois de la nourriture
     * si le stock est insuffisant.
     */
    @Test
    void takeManyAndFail() {
        // TODO : Créer le test
    }
}
