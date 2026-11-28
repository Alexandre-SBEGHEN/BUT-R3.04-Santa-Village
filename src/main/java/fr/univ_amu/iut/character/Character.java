package fr.univ_amu.iut.character;

import fr.univ_amu.iut.food.Food;

import java.util.Random;

/**
 * Représente les caractéristiques communes à tous les personnages du village.
 *
 * @author Kawthar CHAIB EDDOUR
 */
public abstract class Character implements Playable {
    private static final Random random = new Random();

    private String name;
    private Sex sex;
    private int age;
    private Stamina satiation;
    private Stamina energy;
    private boolean resting;
    private Stamina magic;

    /**
     * Constructeur de personnage, permet de créer
     * un personnage avec un nom, âge, sexe.
     *
     * @param name Le nom du personnage.
     * @param sex Le sexe du personnage.
     * @param age L'âge du personnage.
     */
    public Character(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.satiation = new Stamina(1);
        this.energy = new Stamina(1);
        this.resting = false;
        this.magic = new Stamina(0);
    }

    /**
     * Permet de connaître le nom du personnage.
     *
     * @return Le nom.
     */
    public String getName() {
        return name;
    }

    /**
     * Permet de connaître le sexe du personnage.
     *
     * @return Le sexe.
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Permet de connaître l'âge du personnage.
     *
     * @return L'âge.
     */
    public int getAge() {
        return age;
    }

    /**
     * Permet de connaître le niveau
     * actuel de la faim du personnage.
     * Compris entre 0 et 1.
     *
     * @return La valeur de la faim.
     */
    public double getSatiation() {
        return satiation.get();
    }

    /**
     * Permet de connaître le niveau
     * de forme du personnage.
     * <pre>
     *     Intervalle = [0, 1]
     *     1 = En forme (aucune fatigue)
     *     0 = Fatigue extrême
     * </pre>
     *
     * @return Le niveau de forme.
     */
    public double getEnergy() {
        return energy.get();
    }

    /**
     * Permet de connaître la valeur
     * de la magie du personnage.
     * <pre>
     *      Intervalle = [0, 1]
     *      1 = En forme (aucune fatigue)
     *      0 = Fatigue extrême
     * </pre>
     *
     * @return La valeur de magie.
     */
    public double getMagic() {
        return magic.get();
    }

    /**
     * Diminue le niveau de satiété du personnage,
     * ce qui augmente sa faim.
     *
     * @param amount La valeur à diminuer.
     * @throws IllegalArgumentException Si amount est inférieur ou égal à 0.
     */
    public void increaseHunger(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("La valeur doit être suérieur à 0.");
        }
        satiation.change(-amount);
    }

    /**
     * Retourne vrai si le personnag est en train de se reposer,
     * et false s'il est pas.
     *
     * @return Est-ce que le personnage se repose ?
     */
    public boolean isResting() {
        return resting;
    }

    /**
     * Diminue le niveau d'énergie du personnage,
     * ce qui augmente sa fatigue.
     *
     * @param amount La valeur à diminuer.
     * @throws IllegalArgumentException Si amount est inférieur ou égal à 0.
     */
    public void increaseFatigue(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("La valeur doit être suérieur à 0.");
        }
        energy.change(-amount);
    }

    /**
     * Augmente la valeur de la magie.
     *
     * @param amount la valeur à augmenter.
     */
    public void increaseMagic(double amount) {
        magic.change(amount);
    }

    /**
     * Fait émettre un son au personnage.
     * Affiche un message générique dans la console,
     * c'est un comportement propre à chaque personnage.
     */

    @Override
    public void emit() {
        System.out.println("Je suis un personnage");
    }

    /**
     * Dépalce le perosnnage vers un autre bâtiment.
     * Le déplacement doit mettre à jour le bâtiment,
     * auquel le perosnnage est associé.
     */
    //TODO Ajouter l'argument par rapport aux batiment.
    @Override
    public void move() {
        //TODO : le batiment qui contient le personnage, le conttient plus. et que le nouveau batiment qu'on a mis en paramètre acceuille le personnage.
    }

    /**
     * Permet au personnage de manger un aliment.
     * Augmente son niveau de satiété en fonction,
     * de la valeur nutritive de l'aliment.
     *
     * @param food l'aliment consommé par le personnage.
     */
    @Override
    public void eat(Food food) {
        if(resting) {
            throw new IllegalStateException("Le personnage ne peut pas manger pendant son repos.");
        }
        this.satiation.change(food.getValue());
    }

    /**
     * Permet au personnage de se reposer.
     * Augmente son niveau d'énergie,
     */
    @Override
    public void rest() {
        //TODO le personnage peut pas manger pendant son repos
        this.resting = true;
        this.energy.change(random.nextDouble());
    }

    /**
     * Permet au personnage d'effectuer une activité.
     * Augmente son niveau de fatigue d'une quantité,
     * aléatoire comprise entre 0.5 et 0.75.
     */
    @Override
    public void activity() {
        double min = 0.5, max = 0.75;
        increaseMagic(min + (max - min) * random.nextDouble());
    }


}
