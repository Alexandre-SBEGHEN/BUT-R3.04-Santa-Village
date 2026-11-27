package fr.univ_amu.iut.building;

/**
 * Bâtiment quelconque.
 * <p>
 * Un bâtiment est fermé/ouvert, possède
 * une superficie (en mètrse carré) et un
 * niveau de propreté.
 * <p>
 * Lors de sa création, un bâtiment est propre
 * par défaut.
 *
 * @author Alexandre
 */
public abstract class Building {
    private final boolean open;
    private final double area;
    private Cleanliness cleanliness;

    /**
     * Constructeur du bâtiment.
     *
     * @param open Le bâtiment est-il à ciel ouvert ?
     * @param area Superficie (en mètre carré) du bâtiment.
     */
    public Building(boolean open, double area) {
        this.open = open;
        this.area = area;
        this.cleanliness = Cleanliness.GOOD;
    }

    /**
     * Permet de savoir si le bâtiment est ouvert.
     *
     * @return Le bâtiment est-il à ciel ouvert ?
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * Permet d'obtenir la superficie d'un bâtiment.
     *
     * @return Superficie du bâtiment.
     */
    public double getArea() {
        return area;
    }

    /**
     * Permet d'obtenir le niveau de propreté du bâtiment.
     *
     * @return Le niveau de propreté du bâtiment.
     */
    public Cleanliness getCleanliness() {
        return cleanliness;
    }

    /**
     * Rend un bâtiment un peu plus sale.
     * <p>
     * Une fois la méthode appelée, le bâtiment
     * voit son niveau de propreté baisser de 1
     * niveau vers le bas, jusqu'à arriver au
     * degré le plus sale.
     */
    public void toGetDirtier() {
        int cleanlinessIndex = this.cleanliness.ordinal();
        if (cleanlinessIndex == 0)
            return;

        this.cleanliness = Cleanliness.values()[cleanlinessIndex - 1];
    }
}
