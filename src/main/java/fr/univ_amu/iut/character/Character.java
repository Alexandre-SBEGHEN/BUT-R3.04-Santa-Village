package fr.univ_amu.iut.character;

/**
 * Représente les caractéristiques communes à tous les personnages du village.
 *
 * @author Kawthar CHAIB EDDOUR
 */

public abstract class Character implements Playable{
    private static final double HUNGER_INCREMENT = 0.1;
    private static final double FATIGUE_INCREMENT = 0.05;
    private static final double MAGIC_INCREMENT = 0.2;

    private String name;
    private Sex sex;
    private int age;
    private Stamina hunger;
    private Stamina fatigue;
    private Stamina magic;

    /**
     * Constructeur de personnage, permet de créer
     * un personnage avec un nom, âge, sexe.
     *
     * @param name nom du personnage
     * @param age âge du personnage
     * @param sex sexe du personnage
     */
    public Character(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.hunger = new Stamina(1);
        this.fatigue = new Stamina(1);
        this.magic = new Stamina(0);
        this.sex = sex;
    }

    /**
     * Retourne le nom du personnage.
     * Compris entre 0 et 1.
     *
     * @return le nom.
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne le sexe du personnage.
     * Compris entre 0 et 1.
     *
     * @return le sexe.
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Retourne l'âge du personnage.
     * Compris entre 0 et 1.
     *
     * @return l'âge.
     */
    public int getAge() {
        return age;
    }

    /**
     * Retourne le niveau actuel de la faim.
     * Compris entre 0 et 1.
     *
     * @return la valeur de la faim.
     */
    public double getHunger() {
        return hunger.getValue();
    }

    /**
     * Retourne le niveau actuel de fatigue.
     * Compris entre 0 et 1.
     *
     * @return la valeur de la fatigue.
     */
    public double getFatigue() {
        return fatigue.getValue();
    }

    /**
     * Retourne la valeur de la magie.
     * Compris entre 0 et 1.
     *
     * @return la valeur de magie.
     */
    public double getMagic() {
        return magic.getValue();
    }

    /**
     * Augmente la valeur de la faim.
     */
    public void increaseHunger() {
        hunger.increase(HUNGER_INCREMENT);
    }

    /**
     * Augmente la valeur de la fatigue.
     */
    public void increaseFatigue() {
        fatigue.increase(FATIGUE_INCREMENT);
    }

    /**
     * Augmente la valeur de la magie.
     */
    public void increaseMagic() {
        magic.increase(MAGIC_INCREMENT);
    }
}
