package fr.univ_amu.iut.building;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de la classe Building.
 *
 * @see Building
 *
 * @author Alexandre SBEGHEN
 */
public class BuildingTest {
    /**
     * Classe concrète de test
     * d'un bâtiment quelconque.
     * <p>
     * La classe <code>Building</code> étant abstraite,
     * il est impossible de l'instancier directement
     * pour la tester. On passe donc par une classe
     * concrète qui hérite de <code>Building</code>
     * pour tester ses méthodes.
     */
    private static class ConcreteBuilding extends Building {
        /**
         * Constructeur du bâtiment.
         *
         * @param open Le bâtiment est-il à ciel ouvert ?
         * @param area Superficie (en mètre carré) du bâtiment.
         */
        public ConcreteBuilding(boolean open, double area) {
            super(open, area);
        }
    }

    /**
     * Vérifie qu'un bâtiment entièrement
     * sale ne peut pas se salir encore plus.
     */
    @Test
    void toGetDirtierAlreadyAtDirtiest() {
        ConcreteBuilding building = new ConcreteBuilding(true, 5);
        while (building.getCleanliness() != Cleanliness.BAD)
            building.toGetDirtier();

        building.toGetDirtier();
        assertEquals(Cleanliness.BAD, building.getCleanliness());
    }

    /**
     * Vérifie qu'un bâtiment pas entièrement
     * sale se sâlit bien de UN niveau.
     */
    @Test
    void toGetDirtierNotAtDirtiestYet() {
        ConcreteBuilding building = new ConcreteBuilding(true, 5);
        int expectedCleanlinessIndex = building.getCleanliness().ordinal() - 1;
        building.toGetDirtier();
        assertEquals(expectedCleanlinessIndex, building.getCleanliness().ordinal());
    }
}
