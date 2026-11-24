package fr.univ_amu.iut.food;

/**
 * Types qu'une nourriture peut prendre.
 *
 * Les aliments se distinguent par deux
 * catégories principales :
 * <ul>
 *     <li>Les solides</li>
 *     <li>Les liquides</li>
 * </ul>
 * <p>
 * Des catégories supplémentaires pourront
 * être ajoutés ultérieurement.
 *
 * @author Alexandre SBEGHEN
 */
public enum FoodType {
    /** Représente le type solide. */
    SOLID("Solide"),
    /** Représente le type liquide. */
    LIQUID("Liquide");

    private String name;

    /**
     * Le constucteur de la classe.
     *
     * @param name Le type de nourriture.
     */
    FoodType(String name) {
        this.name = name;
    }

    /**
     * Permet d'obtenir le type de nourriture.
     *
     * @return Le type de nourriture.
     */
    public String getName() {
        return name;
    }
}
