-- Insérer 5 Administrateurs avec des noms fictifs
-- Pour les utilisateurs Admin
INSERT INTO Utilisateur (Nom, Prenom, Type_User, Mail) VALUES ('Dupont', 'Jean', 'Admin', 'jean.dupont@example.com');
INSERT INTO Utilisateur (Nom, Prenom, Type_User, Mail) VALUES ('Durand', 'Marie', 'Admin', 'marie.durand@example.com');
INSERT INTO Utilisateur (Nom, Prenom, Type_User, Mail) VALUES ('Martin', 'Luc', 'Admin', 'luc.martin@example.com');
INSERT INTO Utilisateur (Nom, Prenom, Type_User, Mail) VALUES ('Bernard', 'Sophie', 'Admin', 'sophie.bernard@example.com');
INSERT INTO Utilisateur (Nom, Prenom, Type_User, Mail) VALUES ('Petit', 'Émile', 'Admin', 'emile.petit@example.com');

-- Pour les clients
INSERT INTO Utilisateur (Nom, Prenom, Type_User, Mail) VALUES ('Leroy', 'Isabelle', 'Client', 'isabelle.leroy@example.com');
INSERT INTO Utilisateur (Nom, Prenom, Type_User, Mail) VALUES ('Moreau', 'Christophe', 'Client', 'christophe.moreau@example.com');
INSERT INTO Utilisateur (Nom, Prenom, Type_User, Mail) VALUES ('Simon', 'Patricia', 'Client', 'patricia.simon@example.com');
INSERT INTO Utilisateur (Nom, Prenom, Type_User, Mail) VALUES ('Laurent', 'Olivier', 'Client', 'olivier.laurent@example.com');
INSERT INTO Utilisateur (Nom, Prenom, Type_User, Mail) VALUES ('Lefebvre', 'Clémence', 'Client', 'clemence.lefebvre@example.com');


-- Insérer 10 films existants en respectant les genres
INSERT INTO Film (Nom_Film, Genre, Langue, Synopsis) VALUES ('Inception', 'Action', 'Anglais', 'Un voleur utilise la technologie pour entrer dans les rêves.');
INSERT INTO Film (Nom_Film, Genre, Langue, Synopsis) VALUES ('Intouchables', 'Comédie', 'Français', 'L\`histoire d\une amitié entre deux hommes venant de mondes différents.');
INSERT INTO Film (Nom_Film, Genre, Langue, Synopsis) VALUES ('Conjuring', 'Horreur', 'Anglais', 'Des enquêteurs paranormaux travaillent sur une maison hantée.');
INSERT INTO Film (Nom_Film, Genre, Langue, Synopsis) VALUES ('Titanic', 'Drame', 'Anglais', 'Un artiste pauvre et une riche héritière tombent amoureux à bord du Titanic.');
INSERT INTO Film (Nom_Film, Genre, Langue, Synopsis) VALUES ('Amélie', 'Romance', 'Français', 'Une serveuse décide de changer la vie des gens autour d\elle pour le mieux.');

INSERT INTO Lieu (Nom, Adresse, Ville, Type_Lieu, Description) VALUES ('Musée du Louvre','Rue de Rivoli, 75001 Paris', 'Paris', 'Musée', 'Le musée du Louvre, le plus grand musée d\art et d\antiquités au monde.');
INSERT INTO Lieu (Nom, Adresse, Ville, Type_Lieu, Description) VALUES ('Bar la bastille','Place de la Bastille, 75011 Paris', 'Paris', 'Bar', 'Un bar historique au cœur de Paris.');
INSERT INTO Lieu (Nom, Adresse, Ville, Type_Lieu, Description) VALUES ('Tour Eiffel','5 Av. Anatole France, 75007 Paris', 'Paris', 'Monument', 'La Tour Eiffel le monument avec la plus grande renommé de la France');
INSERT INTO Lieu (Nom, Adresse, Ville, Type_Lieu, Description) VALUES ('Jardin des Tuileries','Jardin des Tuileries, 75001 Paris', 'Paris', 'Parc', 'Un jardin public situé entre le Louvre et la Place de la Concorde.');
INSERT INTO Lieu (Nom, Adresse, Ville, Type_Lieu, Description) VALUES ('Le Grand Palais','Avenue Winston Churchill, 75008 Paris', 'Paris', 'Musée', 'Le Grand Palais, lieu d\expositions majeures à Paris.');

INSERT INTO note_film (ID_Utilisateur, ID_Film, Note, Commentaire) VALUES (1, 1, 4, 'Commentaire 6');
INSERT INTO note_film (ID_Utilisateur, ID_Film, Note, Commentaire) VALUES (1, 2, 1, 'Commentaire 6');
INSERT INTO note_film (ID_Utilisateur, ID_Film, Note, Commentaire) VALUES (2, 3, 3, 'Commentaire 7');
INSERT INTO note_film (ID_Utilisateur, ID_Film, Note, Commentaire) VALUES (2, 4, 1, 'Commentaire 7');
INSERT INTO note_film (ID_Utilisateur, ID_Film, Note, Commentaire) VALUES (3, 5, 2, 'Commentaire 7');



INSERT INTO note_lieu (ID_Utilisateur, ID_Lieu, Note, Commentaire) VALUES (1, 2, 3, 'Commentaire 6');
INSERT INTO note_lieu (ID_Utilisateur, ID_Lieu, Note, Commentaire) VALUES (1, 1, 2, 'Commentaire 7');
INSERT INTO note_lieu (ID_Utilisateur, ID_Lieu, Note, Commentaire) VALUES (3, 4, 4, 'Commentaire 8');
INSERT INTO note_lieu (ID_Utilisateur, ID_Lieu, Note, Commentaire) VALUES (4, 4, 3, 'Commentaire 8');
INSERT INTO note_lieu (ID_Utilisateur, ID_Lieu, Note, Commentaire) VALUES (4, 2, 2, 'Commentaire 9');