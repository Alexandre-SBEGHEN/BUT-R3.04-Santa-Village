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