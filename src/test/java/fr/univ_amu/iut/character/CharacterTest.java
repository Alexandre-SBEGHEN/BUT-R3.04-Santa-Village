package fr.univ_amu.iut.character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Test de la classe Character.
 *
 * @see Character
 *
 * @author Kawthar CHAIB EDDOUR.
 */

class CharacterTest {

    class TestCharacter extends Character{
        public TestCharacter(String name, Sex sex, int age) {
            super(name, sex, age);
        }
    }

    /**
     * Vérifie que l'augmentation de la faim,
     * diminue le niveau de satiété.
     */
    @Test
    void decreaseSatiation() {
        TestCharacter C1 = new TestCharacter("Kawthar", Sex.FEMALE, 20);
        assertEquals(1, C1.getSatiation());
        C1.increaseHunger(0.2);
        assertEquals(0.8, C1.getSatiation());
    }

    /**
     * Vérifie que l'augmentation de la fatigue,
     * diminue le niveau d'énergie.
     */
    @Test
    void decreaseEnergy() {
        TestCharacter C2 = new TestCharacter("Timéo", Sex.MALE, 18);
        assertEquals(1, C2.getEnergy());
        C2.increaseFatigue(0.4);
        assertEquals(0.6, C2.getEnergy());
    }

    /**
     * Vérifie qu'une valeur égale à 0 déclenche une
     * IllegalArgumentException lors de l'augmentation
     * de la faim.
     */
    @Test
    void increaseHungerWithZero() {
        TestCharacter C3 = new TestCharacter("Jenna", Sex.FEMALE, 40);
        assertEquals(1, C3.getSatiation());
        assertThrows(IllegalArgumentException.class, () -> {C3.increaseHunger(0);});
    }

    /**
     * Vérifie qu'une valeur égale à 0 déclenche une
     * IllegalArgumentException lors de l'augmentation
     * de la fatigue.
     */
    @Test
    void increaseFatigueWithZero() {
        TestCharacter C4 = new TestCharacter("James", Sex.MALE, 25);
        assertEquals(1, C4.getEnergy());
        assertThrows(IllegalArgumentException.class, () -> {C4.increaseFatigue(0);});
    }

    /**
     * Vérifie qu'une valeur négative déclenche une
     * IllegalArgumentException lors de l'augmentation
     * de la faim.
     */
    @Test
    void increaseHungerWithNegativeAmount() {
        TestCharacter C5 = new TestCharacter("Emma", Sex.FEMALE, 30);
        assertEquals(1, C5.getSatiation());
        assertThrows(IllegalArgumentException.class, () -> {C5.increaseHunger(-0.3);});
    }

    /**
     * Vérifie qu'une valeur négative déclenche une
     * IllegalArgumentException lors de l'augmentation
     * de la fatigue.
     */
    @Test
    void increaseFatiguewithNegativeAmount() {
        TestCharacter C6 = new TestCharacter("Jean", Sex.MALE, 19);
        assertEquals(1, C6.getEnergy());
        assertThrows(IllegalArgumentException.class, () -> {C6.increaseFatigue(-0.9);});
    }
}
