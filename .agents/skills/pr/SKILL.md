---
name: pr
description: >
  Prépare une pull request du projet Santa Village quand l'étudiant le demande.
  Titre Conventional Commits, corps en français : but de la branche, travail
  fait, reste visible, résultat de ./mvnw verify. Déclencheurs : pull request,
  merge request, /pr.
---

# Pull request

La créer seulement sur demande explicite. Pousser la branche fait partie de cette demande. Sans cette demande, ne pas pousser.

Le titre suit `.agents/skills/commit/SKILL.md`.

Lire les commits depuis la base de la branche, et le diff. Ne pas recopier les messages un par un. Regrouper par thème, pour qu'une personne qui reprend la branche sache ce qui a été fait. Si plusieurs auteurs ont commité, nommer l'auteur quand cela distingue les apports. Si la base n'est pas claire, le demander en une phrase.

Le corps est en français.

## But

Une ou deux phrases : à quoi sert la branche.

## Fait

Le travail regroupé par thème.

## Reste

Seulement ce qui est visible : une suite ouverte dans `.agents/HISTORY.md`, un point laissé dans les commits, ou un manque du sujet de la partie en cours. Sinon, omettre cette partie. Ne pas inventer de tâches. Ne pas coller de code.

## Vérification

Lancer `./mvnw verify` et écrire son résultat. S'il échoue, suivre `.agents/skills/verify/SKILL.md`.
