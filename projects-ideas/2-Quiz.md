# Projet quiz

Développer des quiz pour tester vos connaissances et vous hisser à la première place du classement

# Le projet
Votre but est de créer à la fois une section `publique` et une section `administration` pour votre propre site web.
Créer un site web permettant de répondre à des quiz. Vous avez carte blanche pour le sujet de ces quiz. Vous pouvez faire des quiz classiques avec des énoncés sous la forme de questions, ou alors montrer des photos d'acteurs ou d'affiches de films, et faire deviner leur nom... Faites-vous plaisir !

En particulier, les fonctionnalités suivantes seront **requises** :

**Panneau d'Administration**
* Créer / éditer / supprimer des quiz, composés de multiples questions. Chaque question possède un enoncé, éventuellement des réponses pré-définies, et surtout des réponses valides.
* Pouvoir créer / modifier / supprimer des utilisateurs. Supprimer un utilisateur doit également supprimer ses résultats dans les différents quiz.

**Partie publique**
* Afficher la liste des quiz disponibles
* Pouvoir lancer une partie, c'est à dire répondre à toutes les questions d'un quiz
* Voir le classement des joueurs en fin de partie

Vous n'avez pas à implémenter de quelconque sécurité pour le moment (login / password pour l'administration par exemple).

# Bonus
Vous avez **déjà tout terminé ?**  
Voici quelques features qui rendront votre plateforme encore plus attrayante :
* Afficher le profil de chaque joueur, montrant la liste des quiz auquel il/elle a participé, ainsi que ses scores
* Faire un plateau de jeu en front avec les pions qui bougent / des cartes qui se retournent 
* Envoyer un mail à la fin de chaque partie aux joueurs avec les questions, les scores, le classement
* Ajouter un chronomètre pour les temps de réponse aux questions
