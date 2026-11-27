package fr.univ_amu.iut.building.unoccupiable;

import fr.univ_amu.iut.building.Building;
import fr.univ_amu.iut.food.Food;

import java.util.Map;
import java.util.HashMap;

/**
 * Bâtiment de la réserve de nourriture.
 * <p>
 * Possède un stock qui associe chaque
 * nourriture à sa quantité dans la réserve.
 *
 * @author Alexandre SBEGHEN
 */
public class Pantry extends Building {
    private final Map<Food, Integer> stock;

    /**
     * Crée une réserve avec un stock de départ.
     *
     * @param open La réserve est-elle à ciel ouvert ?
     * @param area Superficie de la réserve.
     * @param defaultStock Stock de départ pour chaque nourriture.
     */
    public Pantry(boolean open, double area, int defaultStock) {
        super(open, area);
        this.stock = new HashMap<>();
        initializeStock(defaultStock);
    }

    /**
     * Crée une réserve vide, <em>i.e.</em> un stock
     * de départ nul pour chaque nourriture.
     *
     * @param open La réserve est-elle à ciel ouvert ?
     * @param area Superficie de la réserve.
     */
    public Pantry(boolean open, double area) {
        super(open, area);
        this.stock = new HashMap<>();
        initializeStock(0);
    }

    /**
     * Initialise le stock de nourriture
     * avec une valeur pour chacune d'entre elles.
     *
     * @param defaultStock Stock de départ pour chaque nourriture.
     */
    private void initializeStock(int defaultStock) {
        for (Food f: Food.values())
            this.stock.put(f, defaultStock);
    }

    /**
     * Permet d'obtenir une copie immuable du stock.
     *
     * @return La copie du stock.
     */
    public Map<Food, Integer> getStock() {
        return Map.copyOf(stock);
    }

    /**
     * Essaie de prendre une certaine quantité
     * de nourriture depuis la réserve.
     *
     * @param food Quelle nourriture prendre.
     * @param howMany En quelle quantité en prendre.
     * @return La quantité prise (0 = stock insuffisant)
     */
    public int take(Food food, int howMany) {
        return 0;
    }

    /**
     * Essaie de prendre une unité
     * de nourriture depuis la réserve.
     *
     * @param food Quelle nourriture prendre.
     * @return La quantité prise (0 = stock insuffisant)
     */
    public int take(Food food) {
        return take(food, 1);
    }
}
