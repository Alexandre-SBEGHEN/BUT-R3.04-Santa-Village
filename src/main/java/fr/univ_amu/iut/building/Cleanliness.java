package fr.univ_amu.iut.building;

/**
 * Niveau de propreté qu'un bâtiment peut avoir.
 *
 * @author Alexandre SBEGHEN
 */
public enum Cleanliness {
    /** Bâtiment sale. */
    BAD("Sale"),
    /** Bâtiment moyennement propre. */
    FAIR("Acceptable"),
    /** Bâtiment propre. */
    GOOD("Propre");

    private final String name;

    /**
     * Le constructeur de la classe.
     *
     * @param name Le niveau de propreté.
     */
    Cleanliness(String name) {
        this.name = name;
    }

    /**
     * Permet d'obtenir le niveau de propreté.
     *
     * @return Le niveau de propreté.
     */
    public String getName() {
        return name;
    }
}
