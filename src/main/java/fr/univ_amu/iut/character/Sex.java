package fr.univ_amu.iut.character;

/**
 * Les différents sexes qu'un personnage peut prendre.
 *
 * @author Kawthar CHAIB EDDOUR
 */
public enum Sex {
    /** Représente le sexe masculin. */
    MALE("Mâle"),
    /** Représente le sexe féminin. */
    FEMALE("Femelle");

    private String name;

    /**
     * Le constucteur de la classe.
     *
     * @param name Le nom du sexe.
     */
    Sex(String name) {
        this.name = name;
    }

    /**
     * Permet d'obtenir le nom du sexe.
     *
     * @return Le nom du sexe.
     */
    public String getName() {
        return name;
    }
}
