---
name: commit
description: >
  Prépare un commit Git du projet Santa Village quand l'étudiant le demande.
  Conventional Commits, description et corps en français. Lancer ./mvnw verify
  avant le commit. Déclencheurs : commit, message de commit, conventional commits.
---

# Commit

Lancer `./mvnw verify` avant de créer le commit. Si la commande échoue, le
dire en premier : le projet ne doit pas être rendu dans cet état. Nommer la
cause, et ne pas créer le commit. Le détail des contrôles est dans
`.agents/skills/verify/SKILL.md`.

Le message suit les Conventional Commits. Le type, et le scope s'il y en a un,
restent en anglais. La description et le corps sont en français, à l'impératif,
sans majuscule initiale ni point final.

```
feat(buildings): ajoute l'entretien d'un bâtiment vide

Un bâtiment sale et sans occupant peut être remis en état.
```

Types usuels : `feat`, `fix`, `docs`, `test`, `refactor`, `chore`.
