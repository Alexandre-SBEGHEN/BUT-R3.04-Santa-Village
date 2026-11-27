package fr.univ_amu.iut.character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de la classe Stamina.
 *
 * @see Stamina
 *
 * @author Alexandre SBEGHEN
 */
class StaminaTest {

    /**
     * Vérifie que l'initialisation de la
     * valeur ne peut pas se faire en dehors
     * des bornes.
     */
    @Test
    void initializationOutOfBounds() {
        Stamina stamina = new Stamina(-1);
        assertEquals(0, stamina.get());
        stamina = new Stamina(2);
        assertEquals(1, stamina.get());
    }

    /**
     * Vérifie qu'un delta qui reste dans l'intervalle
     * est ajouté à la valeur courante.
     */
    @Test
    void changeWithinBounds() {
        Stamina stamina = new Stamina(0.2);
        stamina.change(0.3);
        assertEquals(0.5, stamina.get());
    }

    /**
     * Vérifie que l'incrémentation / décrémentation
     * de la jauge fonctionne et que la valeur ne sort
     * pas de ses bornes.
     */
    @Test
    void changeOutOfBounds() {
        Stamina stamina = new Stamina(0.5);
        stamina.change(-1);
        assertEquals(0, stamina.get());
        stamina.change(2);
        assertEquals(1, stamina.get());
    }
}