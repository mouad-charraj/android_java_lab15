# Android Java Lab 15

## Description
Ce projet est le quinzième laboratoire pratique du module de développement mobile Android. Il s'agit d'une application simple de gestion d’étudiants basée sur SQLite. L’application permet d’ajouter des informations sur un étudiant, de rechercher un étudiant par son identifiant et de supprimer un enregistrement existant. Ce laboratoire permet de comprendre l’utilisation d’une base de données locale SQLite dans Android, ainsi que les opérations de base de gestion des données comme l’insertion, la recherche et la suppression.

## Screenshot
<img width="370" height="858" alt="image" src="https://github.com/user-attachments/assets/af02b3e7-3ce8-4a91-bbbf-eca32a38fdfe" />


## Fonctionnalités
L'application propose une interface interactive avec les éléments suivants :

Saisie des Informations : Deux champs permettent à l’utilisateur d’entrer le nom et le prénom de l’étudiant.
Enregistrement dans SQLite : Un bouton "Valider" permet d’ajouter les informations saisies dans la base de données locale SQLite.
Recherche par ID Étudiant : Un champ dédié permet d’entrer l’identifiant d’un étudiant afin d’effectuer une recherche dans la base de données.
Action "Chercher" : Un bouton permet de lancer la recherche de l’étudiant correspondant.
Affichage du Résultat : Les informations retrouvées, comme le nom complet de l’étudiant, s’affichent directement à l’écran.
Suppression d’un Enregistrement : Un bouton "Supprimer" permet de supprimer l’étudiant affiché de la base de données.
Gestion Locale des Données : Les données sont stockées localement sur l’appareil grâce à SQLite, sans besoin de connexion Internet.

## Technologies Utilisées
- Java
- Android Studio
- XML
- SQLite
- Gradle

## Installation et Test
```bash
git clone https://github.com/mouad-charraj/android_java_lab15.git
