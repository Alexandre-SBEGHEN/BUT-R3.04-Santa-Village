---
name: commit
description: >
  Prépare un commit Git du projet Santa Village quand l'étudiant le demande.
  Conventional Commits, description et corps en français. Lancer ./mvnw verify
  avant le commit seulement si le diff touche le code. Déclencheurs : commit,
  message de commit, conventional commits.
---

# Commit

Regarder les fichiers du commit. Lancer `./mvnw verify` seulement s'ils
touchent le code, selon `.agents/skills/verify/SKILL.md`. Sinon, ne pas
lancer Maven et le dire. Si la commande est lancée et qu'elle échoue, le
dire en premier : le projet ne doit pas être rendu dans cet état. Nommer la
cause, et ne pas créer le commit.

Le message suit les Conventional Commits. Le type, et le scope s'il y en a un,
restent en anglais. La description et le corps sont en français, à l'impératif,
sans majuscule initiale ni point final.

```
feat(buildings): ajoute l'entretien d'un bâtiment vide

Un bâtiment sale et sans occupant peut être remis en état.
```

Types usuels : `feat`, `fix`, `docs`, `test`, `refactor`, `chore`.

## Identité

Ne pas changer l'auteur ni le committer. Ne pas ajouter de trailer `Co-authored-by`.

Le défaut est désactivé. Ne pas demander à signer.

N'ajouter une signature que si l'utilisateur le demande explicitement dans la demande de commit concernée.
