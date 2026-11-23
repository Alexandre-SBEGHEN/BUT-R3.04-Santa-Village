---
name: pr-summary
description: >
  Résume la pull request portée par la branche courante : fichiers modifiés,
  discussion déjà présente, endroits à vérifier. Ne publie rien et
  n'enregistre rien. Déclencheurs : résumé de pull request, pr-summary,
  /pr-summary.
---

# Résumé de pull request

La lancer seulement sur demande explicite, `/pr-summary`.

Elle répond dans la conversation. Elle ne publie rien, n'enregistre rien, ne modifie pas le code et ne choisit pas l'avis.

## Branche

Avant toute lecture, regarder la branche courante. Ne pas changer de branche.

Démarrer seulement si les trois conditions tiennent :

- la branche n'est pas `main` ;
- elle a une pull request ;
- cette pull request est liée à une issue.

Le lien est celui de la pull request, par exemple `Fixes #29`. Le nom de la branche ne suffit pas.

Sinon, s'arrêter et nommer la condition qui manque. Ne pas lire le diff.

## Lecture

Lire le titre, la description et le diff de cette pull request. Lire les conditions de l'issue liée.

Lire aussi les revues déjà publiées : commentaire simple, approbation, demande de changements, et les commentaires de ces revues.

Comparer le titre, la description et l'issue au diff. Un point à vérifier vient d'un écart : une promesse absente du code, ou un fichier modifié que la description ne mentionne pas.

Un commentaire qui annonce une modification du code n'est pas une preuve. Vérifier le diff après ce commentaire.

## Réponse

Trois parties.

### Changements

Les fichiers touchés, et ce qui change dans chacun : du code, un test, un document ou une règle d'agent. Montrer l'étendue du diff, sans le recopier.

### Discussion

Une liste courte. Distinguer le commentaire simple, l'approbation et la demande de changements. Garder le point qui compte encore. Ne pas recopier le fil.

Si un commentaire annonce une modification et que le diff la montre, le dire. L'ancien écart ne reste pas dans À vérifier. Si le commentaire l'annonce mais que le diff ne la montre pas, le point reste à vérifier.

### À vérifier

Une liste courte. Chaque point nomme un endroit précis et le critère qui le rend indispensable.

Le reste du dépôt, déjà conforme, n'est pas à relire. Si le diff touche le code, `./mvnw verify` sur cette branche fait partie de la liste. Ne pas changer de branche pour le lancer, et ne pas le lancer à la place du relecteur.

Nommer l'endroit et le critère. Ne pas proposer le code corrigé.

Le titre, la description, l'issue et le diff restent les sources. La discussion s'y ajoute. Elle ne les remplace pas.
