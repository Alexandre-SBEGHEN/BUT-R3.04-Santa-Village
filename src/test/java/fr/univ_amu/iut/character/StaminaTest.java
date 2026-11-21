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
        assertEquals(0, stamina.getValue());
        stamina = new Stamina(2);
        assertEquals(1, stamina.getValue());
    }

    /**
     * Vérifie que le setter ne permet pas
     * de définir une valeur en dehors des bornes.
     */
    @Test
    void setValueOutOfBounds() {
        Stamina stamina = new Stamina(0.5);
        stamina.setValue(-1);
        assertEquals(0, stamina.getValue());
        stamina.setValue(2);
        assertEquals(1, stamina.getValue());
    }

    /**
     * Vérifie qu'un delta qui reste dans l'intervalle
     * est ajouté à la valeur courante.
     */
    @Test
    void increaseWithinBounds() {
        Stamina stamina = new Stamina(0.2);
        stamina.increase(0.3);
        assertEquals(0.5, stamina.getValue());
    }

    /**
     * Vérifie que l'incrémentation / décrémentation
     * de la jauge fonctionne et que la valeur ne sort
     * pas de ses bornes.
     */
    @Test
    void increaseOutOfBounds() {
        Stamina stamina = new Stamina(0.5);
        stamina.increase(-1);
        assertEquals(0, stamina.getValue());
        stamina.increase(2);
        assertEquals(1, stamina.getValue());
    }
}