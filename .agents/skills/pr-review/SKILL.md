---
name: pr-review
description: >
  Publie une revue sur la pull request de la branche courante, après accord
  sur le texte. Avis : commentaire, approbation ou demande de changements.
  Déclencheurs : revue de pull request, pr-review, /pr-review.
---

# Revue de pull request

La lancer seulement sur demande explicite, `/pr-review`.

Elle publie une revue GitHub sur la pull request de la branche courante. Pas un commentaire d'issue. Elle ne modifie pas le code.

## Branche

Avant toute lecture, regarder la branche courante. Ne pas changer de branche.

Démarrer seulement si les trois conditions tiennent :

- la branche n'est pas `main` ;
- elle a une pull request ;
- cette pull request est liée à une issue.

Le lien est celui de la pull request, par exemple `Fixes #29`. Le nom de la branche ne suffit pas.

Sinon, s'arrêter et nommer la condition qui manque. Ne pas rédiger la revue.

## Texte

Rédiger la revue pour l'auteur, à partir du titre, de la description, du diff et de l'issue liée.

Nommer l'endroit et le critère. Ne pas proposer le code corrigé.

Montrer ce texte dans la conversation. Ne pas l'envoyer. L'utilisateur peut le corriger. N'envoyer que le texte qu'il a accepté.

## Avis

L'avis est choisi dans la demande. Trois valeurs :

- un commentaire simple, qui ne donne pas d'avis formel ;
- une approbation ;
- une demande de changements.

La demande de changements est l'avis formel « changes requested ». Sans protection de branche, elle n'empêche pas la fusion.

Si l'avis n'est pas précisé, s'arrêter et le demander. Ne pas approuver par défaut.

GitHub refuse d'approuver ou de demander des changements sur sa propre pull request. Dans ce cas, s'arrêter avant d'envoyer. Un commentaire simple reste possible.

Envoyer seulement quand le texte est accepté et que l'avis est choisi.
