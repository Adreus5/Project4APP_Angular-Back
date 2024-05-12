# Authors : Aidan Fernández, Youssef Guiza, Thomas Dorby, Yassine Boutouil

## Your backend API

## Set up 
1. Copie-colle le .env.sample en .env
2. Fait un `docker-compose up`
2. Rajoute le pluggin : https://plugins.jetbrains.com/plugin/7861-envfile


Cette commande va lancer tous les services nécessaires définis dans votre fichier `docker-compose.yml`.

## Initialisation de la base de données

1. Une fois que les conteneurs Docker sont en marche, ouvrez votre fichier `initdb` qui contient les scripts SQL pour initialiser votre base de données.
2. Exécutez les scripts SQL pour créer et configurer les tables nécessaires pour l'application.

## Lancement de l'application backend

1. Localisez le fichier `BackSkeletonApplication` dans le dossier `services` de votre projet.
2. Lancez cette application en utilisant votre IDE préféré ou en ligne de commande pour démarrer le serveur backend.

## Vérification

- Une fois que le serveur est lancé, vérifiez que tout fonctionne correctement en accédant à l'URL du serveur via un navigateur ou en utilisant un client API comme Postman pour tester les endpoints du backend.

## Notes supplémentaires

- Assurez-vous que toutes les configurations sont correctement établies avant de lancer l'application.
- En cas de modifications dans les fichiers de configuration de Docker ou de la base de données, il peut être nécessaire de redémarrer les services Docker pour appliquer les changements.

Ces instructions vous guideront à travers les étapes nécessaires pour configurer et démarrer votre backend, en s'assurant que tous les composants sont correctement configurés et en fonctionnement.
