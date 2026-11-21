---
name: verify
description: >
  Vérification du code du projet Santa Village. À lire pour une relecture,
  une Javadoc, Checkstyle, SpotBugs, JUnit, ou avant un commit.
  Déclencheurs : verify, mvnw, checkstyle, javadoc, spotbugs, tests.
---

# Vérification

La commande de référence est `./mvnw verify`. Elle lance les tests JUnit,
SpotBugs, Checkstyle et la Javadoc. Un avertissement Checkstyle fait échouer
le build.

Ne la lancer que si le diff du commit ou de la pull request touche le code :
`src/`, `pom.xml`, `checkstyle.xml`, ou le wrapper Maven (`mvnw`, `mvnw.cmd`, `.mvn/`).
La documentation, le README, `AGENTS.md`, `.agents/` et `.grok/` ne suffisent pas.
Le dire, et ne pas lancer Maven. Une demande de note vérifie quand même :
elle juge le code présent, pas le diff de la session.

`./mvnw` choisit le JDK 25. Ne pas en lancer un autre.
Si SpotBugs signale `Unsupported class file major version`, le JDK 25
est introuvable sur la machine. Ce n'est pas un défaut du code.

Checkstyle exige une Javadoc française sur chaque type et chaque méthode,
y compris privées, avec `@param`, `@return` et `@throws` lorsqu'ils s'appliquent.
La génération Javadoc utilise `doclint` en mode `all`.

En cas d'échec, le dire en premier : le projet ne doit pas être rendu dans cet
état. Nommer la règle ou l'erreur et le fichier concerné.
