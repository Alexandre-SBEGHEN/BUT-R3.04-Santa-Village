<h1 align="center">Le village du Père Noël</h1>

<p align="center"><i>par Manal BARTAL, Kawthar CHAIB EDDOUR, Alexandre SBEGHEN</i></p>

<div align="center">
   <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white" >
   <img alt="Maven" src="https://img.shields.io/badge/Maven-CA4E3F?style=flat" >
   <img alt="Github Actions" src="https://img.shields.io/badge/Github_Actions-249AF9?style=flat&logo=githubactions&logoColor=white" >
</div>

<div align="center">
   <img alt="License" src="https://img.shields.io/github/license/Alexandre-SBEGHEN/BUT-R3.04-Santa-Village">
   <img alt="Repo Size" src="https://img.shields.io/github/repo-size/Alexandre-SBEGHEN/BUT-R3.04-Santa-Village">
   <a href="https://www.codefactor.io/repository/github/alexandre-sbeghen/but-r3.04-santa-village"><img src="https://www.codefactor.io/repository/github/alexandre-sbeghen/but-r3.04-santa-village/badge" alt="CodeFactor" /></a>
   <img alt="Maven status badge" src="https://github.com/Alexandre-SBEGHEN/BUT-R3.04-Santa-Village/actions/workflows/maven.yml/badge.svg" >
</div>

---

## Documentation
La documentation du projet peut être générée dans le répertoire `target/site/apidocs/` via la commande
```shell
./mvnw javadoc:javadoc
```
A noter que si la javadoc est mal rédigée, la commande échouera.

## Vérification du code source
La vérification comprend l'usage des outils suivants :
- **JUnit** : tests unitaires.
- **SpotBugs** : analyse statique qui détecte les bugs dans le code Java en inspectant le bytecode compilé.
- **Checkstyle** : exige que chaque classe et méthode ait une Javadoc, avec les `@param` et `@return` qui vont avec.

La vérification peut être lancée via la commande
```shell
./mvnw verify
```
A noter que cette commande inclue la génération de la documentation.

## Utilisation d'agents IA
L'agent de code aide à comprendre le sujet et à trancher les choix de conception. Il ne rédige pas le code qui résout le village ou la colonie : l'implémentation, les tests métier et les décisions restent à l'étudiant.

Le guide court est [`AGENTS.md`](AGENTS.md). Les procédures détaillées sont dans `.agents/skills/` :

- **Conception** ([`.agents/skills/conception/SKILL.md`](.agents/skills/conception/SKILL.md)) : modèle, paquets et notions Java. L'agent compare des découpages, il ne crée pas l'arborescence.
- **Vérification** ([`.agents/skills/verify/SKILL.md`](.agents/skills/verify/SKILL.md)) : Javadoc, Checkstyle, SpotBugs, JUnit, et la lecture d'un échec de `./mvnw verify`.
- **Commit** ([`.agents/skills/commit/SKILL.md`](.agents/skills/commit/SKILL.md)) : message Conventional Commits, type en anglais et description en français, seulement si `./mvnw verify` réussit et seulement sur demande.
- **Note** ([`.agents/skills/notation/SKILL.md`](.agents/skills/notation/SKILL.md)) : estimation du code sur 60 points. L'oral et les documents ne sont pas inclus. Ce n'est pas la note finale.

À l'ouverture d'une session, l'agent lit `.agents/HISTORY.md`. Il n'y ajoute une entrée, selon [`.agents/templates/task.md`](.agents/templates/task.md), que pour une décision, un changement de partie ou un travail laissé ouvert. Une question sans suite n'y figure pas. Ce journal est local : `.agents/.gitignore` l'ignore. L'écriture de ce seul fichier est autorisée dans [`.grok/config.toml`](.grok/config.toml) : elle ne redemande pas l'accord. Toute autre écriture ou commande le demande encore.

En pratique, on nomme la partie en cours (le village ou la colonie) et la question (un type, un cas limite, une erreur de build). L'agent donne une piste : la notion, la responsabilité du type, ou le cas à traiter. On peut aussi appeler une procédure par son nom : `/conception`, `/verify`, `/commit`, `/notation`.

## Sources des sujets
Les sujets de TD et le document de projet ont été retranscrits à partir des documents de Mickaël Martin Nevot.

- Licence originale : [CC BY-NC-SA 3.0](https://creativecommons.org/licenses/by-nc-sa/3.0/deed.fr)
- Document en ligne : https://www.mickael-martin-nevot.com