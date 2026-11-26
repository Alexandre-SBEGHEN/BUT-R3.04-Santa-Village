package fr.univ_amu.iut.food;

/**
 * Représente les différents aliments.
 *
 * @author Kawthar CHAIB EDDOUR.
 */

public enum Food {
    /**
     * Biscuit, un aliment solide.
     */
    BISCUIT("Biscuit", FoodType.SOLID, 0.15),
    /**
     * Chocolat chaud, un aliment liquide.
     */
    HOT_CHOCOLATE("Chocolat chaud", FoodType.LIQUID, 0.25),
    /**
     * Guimauve, un aliment solide.
     */
    MARSHMALLOW("Guimauve", FoodType.SOLID, 0.10),
    /**
     * Gruau d’avoine, un aliment solide.
     */
    OATMEAL("Gruau d’avoine", FoodType.SOLID, 0.20),
    /**
     * Sucre d'orge, un aliment solide.
     */
    BARLEY_SUGAR("Sucre d'orge", FoodType.SOLID, 0.08),
    /**
     * Bonbon, un aliment solide.
     */
    CANDY("Bonbon", FoodType.SOLID, 0.05);

    private final String name;
    private final FoodType type;
    private final double value;

    /**
     * Le constructeur de la classe Food.
     *
     * @param name le nom de l'aliment.
     * @param type le type de l'aliment.
     * @param value la valeur nutritive de l'aliment.
     */
    Food(String name, FoodType type, double value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * Retourne le nom de l'aliment.
     *
     * @return le nom de l'aliment.
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne le type de l'aliment, soit un solide ou un liquide.
     *
     * @return le type de l'aliment.
     */
    public FoodType getType() {
        return type;
    }

    /**
     * Retourne la valeur nutritive de l'aliment.
     *
     * @return la valeur nutritive.
     */
    public double getValue() {
        return value;
    }
}
