---
name: notation
description: >
  Approximation de la note du code avant le rendu. À lire quand l'étudiant
  demande sa note, le barème, ce qui est fait, ce qui reste, ou ce qu'il peut
  perfectionner. Ne couvre pas l'oral ni les documents.
---

# Note du code

Estimer seulement le code, sur 60 points du barème. Les 40 autres ne sont pas
estimés : oral (12,5), envoi (5), spécification et clôture (5), gestion de
projet (2,5), GitHub (2,5), lisez-moi (2,5), manuel (5), Javadoc générée (5).
Ne pas les lire. Ne pas les ajouter à la note.

Ne pas ouvrir `docs/`. Ne pas proposer d'implémentation : nommer le manque.

## Budget de lecture

1. Lancer `./mvnw -q verify`. Ne garder que le résultat. En cas d'échec, le plugin en cause et la première erreur, pas le journal.
2. Lister les chemins `src/main/java` et `src/test/java` (`**/*.java`), rien d'autre.
3. Une seule recherche sur `src/main/java` pour les notions du langage :
   `abstract class`, `interface`, `sealed`, `permits`, `ArrayList`,
   `Iterator`, `throw`, `Thread`, `Runnable`, `Executor`, `.sort(`,
   `Comparator`, `Factory`, `Strategy`, `Observer`, `Singleton`, `Builder`.
4. Une seule recherche des thèmes listés plus bas, sur les noms de fichiers d'abord.
   Ouvrir un fichier seulement si un critère d'au moins 2 points reste incertain.
   Deux fichiers au maximum.

## Barème code

Le minimum du sujet présent vaut le tout du critère. Un cas limite manquant
va dans « À perfectionner » et n'enlève rien. La moitié seulement si le thème
est commencé sans son minimum. Zéro s'il est absent.

La partie 2 peut rester inachevée. Cela ne baisse ni la présentation, ni
l'architecture, ni les notions du langage, ni les tests, ni les qualités, ni
le perfectionnement : ces lignes se jugent sur le code qui existe. Elle ne
retire que ses propres thèmes du fonctionnel. Arrondir le total à 0,5.

Si `./mvnw verify` échoue, la note reste calculée sur le code écrit. Le dire
en premier : le projet ne doit pas être rendu dans cet état, avec le plugin
en cause et la première erreur. La ligne des tests vaut 0 si les tests
échouent.

- Héritage 1, classes abstraites 1, interfaces 1, généricité 1, types scellés 1.
- Collections 2,5 : `ArrayList`, une autre collection, des itérateurs. Les trois.
- Exceptions 1,25, patrons 1,25, threads 1,25, tri 1,25.
- Présentation 5 : noms anglais, indentation, commentaires. Juger sur un fichier.
- Architecture des paquets 2,5 : jugée sur la liste des chemins.
- Tests JUnit 5 : présence et sérieux des tests. JaCoCo et la CI, qui partagent
  cette ligne du sujet, ne sont pas lus. Sans test, 0.
- Fonctionnel 20, estimé 10 + 10. Le sujet n'a qu'une seule ligne de 20.
- Qualités 5 : modulaire, robuste. Juger sur la liste des chemins.
- Perfectionnement 10 : au-delà du minimum, ou une vraie interface graphique.
  Le menu console ne suffit pas pour ces 10 points.

### Partie 1 — 10

Chaque thème vaut 1,25.

Un lycanthrope du village ne compte pas comme la partie 2.

Personnages (caractéristiques et actions) ; humanoïdes et créatures ;
nourriture et activités propres ; farces et rencontres funèbres ; bâtiments
et leurs types ; menu du Père Noël ; boucle de temps ; victoire et défaite
selon la magie.

### Partie 2 — 10

Chaque thème vaut 1,25.

Individu ; hiérarchie et domination ; couple α ; solitaires et fondation ;
reproduction ; hurlements ; transformation en humain ; colonie et temps.

## Réponse

- Avertissement, en premier, si la vérification échoue : le projet ne doit pas
  être rendu dans cet état. Nommer la cause.
- Fait
- Reste : les minimums absents de ce qui est commencé. Une partie 2 non
  commencée tient en une ligne, pas en une liste de thèmes.
- Si le temps reste : le reste de la partie 2, en une ligne.
- À perfectionner : ce qui existe déjà.
- Note de code : N / 60. Ce n'est pas la note finale du projet.
