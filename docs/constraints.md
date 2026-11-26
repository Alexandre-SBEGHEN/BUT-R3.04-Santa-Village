# Contraintes absentes du diagramme UML

Ce document contient des règles d'admission et de refus que le diagramme de classes ne peut pas exprimer.

## Les personnages

### Méthodes `increaseHunger()` et `increaseFatigue()` de `Character`

| Situation | Problème | Solution |
|-|-|-|
| Elles font **baisser** leur jauge correspondantes | Un nombre négatif en argument les ferait augmenter | Lance une exception si un nombre négatif ( $\le 0$ ) est entré en argument. |


## Les bâtiments

### Création de bâtiments uniques

| Situation | Problème | Solution |
|-|-|-|
| Certains bâtiments sont **uniques** dans un village (ex: maison du Père Noël, Tour de l'horloge, etc) | Rien ne nous empêche d'en créer plusieurs dans la simulation | Lancer une exception si on essaie de placer un bâtiment unique alors qu'une autre existe déjà |

### Les dortoirs
| Situation | Problème | Solution |
|-|-|-|
| Les dortoirs sont **non-mixtes** | Si le type des occupants convient, rien ne nous empêche d'en mettre de n'importe quel sexe | Lancer une exception si le sexe de l'occupant à accueillir n'est pas celui accepté par le dortoir (`WhichSex`) |

### L'atelier de fabrication

| Situation | Problème | Solution |
|-|-|-|
| Conçu comme tel, l'atelier ne peut avoir qu'**un seul** type d'occupant : soit `Sprite`, soit `Fairy` | On veut que les lutins **ET** les fées de Noël puissent y entrer | Accepter **tous** les humanoïdes (`Humanoid`), mais lancer une exception si ce n'est ni une instance de lutin (`Sprite`), ni de fée (`Fairy`) |

### L'école de magie et l'aire de jeux

| Situation | Problème | Solution |
|-|-|-|
| Ils peuvent accueillir les **créatures fantastiques**<br>(= créature **ET** fantastique) | Les créatures incluent des personnages non fantastiques, et l'interface `FantasticBeing` est implémentée par des personnages non créatures | Accepter toutes les créatures, mais lancer une exception si elle n'est pas fantastique (= n'implémente pas `FantasticBeing`) |
.