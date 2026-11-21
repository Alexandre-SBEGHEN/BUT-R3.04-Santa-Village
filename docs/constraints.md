# Contraintes absentes du diagramme UML

Ce document contient des règles d'admission et de refus que le diagramme de classes ne peut pas exprimer.

## Classe `SantaHouse` (maison du Père Noël)

### Situation
La maison du Père Noël est un bâtiment unique.

### Problème
Rien ne nous empêche d'en créer plusieurs dans la simulation

### Solution
Si on essaie de placer une maison du Père Noël alors qu'une autre existe déjà, lancer une exception.

## Classe `ClockTower` (tour de l'horloge)
Contraintes identiques à celles de `SantaHouse`.

## Classe `Workshop` (atelier de fabrication)

### Situation
L'atelier ne peut avoir qu'un seul type d'occupant : soit `Sprite`, soit `Fairy`.

### Problème
On veut que les lutins **ET** les fées de Noël puissent y entrer.

### Solution
Accepter tous les humanoïdes (`Humanoid`), mais lancer une exception si ce n'est si un lutin (`Sprite`), ni une fée (`Fairy`).

## Classe `MagicSchool` (école de magie)

### Situation
Les écoles peuvent accueillir les créatures fantastiques.

### Problème
Les créatures incluent des personnages non fantastiques, et l'interface `FantasticBeing` est implémentée par des personnages non créatures.

### Solution
Accepter toutes les créatures, mais lancer une exception si elle n'est pas fantastique (= n'implémente pas `FantasticBeing`).

## Classe `PlayArea` (aire de jeux)
Contraintes identiques à celles de `MagicSchool`.