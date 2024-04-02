-- Insérer 5 Administrateurs avec des noms fictifs
INSERT INTO Utilisateur (Nom, Prenom, Type_User) VALUES ('Dupont', 'Jean', 'Admin');
INSERT INTO Utilisateur (Nom, Prenom, Type_User) VALUES ('Durand', 'Marie', 'Admin');
INSERT INTO Utilisateur (Nom, Prenom, Type_User) VALUES ('Martin', 'Luc', 'Admin');
INSERT INTO Utilisateur (Nom, Prenom, Type_User) VALUES ('Bernard', 'Sophie', 'Admin');
INSERT INTO Utilisateur (Nom, Prenom, Type_User) VALUES ('Petit', 'Émile', 'Admin');

-- Insérer 5 Clients avec des noms fictifs
INSERT INTO Utilisateur (Nom, Prenom, Type_User) VALUES ('Leroy', 'Isabelle', 'Client');
INSERT INTO Utilisateur (Nom, Prenom, Type_User) VALUES ('Moreau', 'Christophe', 'Client');
INSERT INTO Utilisateur (Nom, Prenom, Type_User) VALUES ('Simon', 'Patricia', 'Client');
INSERT INTO Utilisateur (Nom, Prenom, Type_User) VALUES ('Laurent', 'Olivier', 'Client');
INSERT INTO Utilisateur (Nom, Prenom, Type_User) VALUES ('Lefebvre', 'Clémence', 'Client');

-- Insérer 10 films existants en respectant les genres
INSERT INTO Film (Nom_Film, Genre, Langue, Synopsis) VALUES ('Inception', 'Action', 'Anglais', 'Un voleur utilise la technologie pour entrer dans les rêves.');
INSERT INTO Film (Nom_Film, Genre, Langue, Synopsis) VALUES ('Intouchables', 'Comédie', 'Français', 'L\`histoire d\une amitié entre deux hommes venant de mondes différents.');
INSERT INTO Film (Nom_Film, Genre, Langue, Synopsis) VALUES ('Conjuring', 'Horreur', 'Anglais', 'Des enquêteurs paranormaux travaillent sur une maison hantée.');
INSERT INTO Film (Nom_Film, Genre, Langue, Synopsis) VALUES ('Titanic', 'Drame', 'Anglais', 'Un artiste pauvre et une riche héritière tombent amoureux à bord du Titanic.');
INSERT INTO Film (Nom_Film, Genre, Langue, Synopsis) VALUES ('Amélie', 'Romance', 'Français', 'Une serveuse décide de changer la vie des gens autour d\elle pour le mieux.');

INSERT INTO Lieu (Adresse, Ville, Type_Lieu, Description) VALUES ('Rue de Rivoli, 75001 Paris', 'Paris', 'Musée', 'Le musée du Louvre, le plus grand musée d\art et d\antiquités au monde.');
INSERT INTO Lieu (Adresse, Ville, Type_Lieu, Description) VALUES ('Place de la Bastille, 75011 Paris', 'Paris', 'Bar', 'Un bar historique au cœur de Paris.');
INSERT INTO Lieu (Adresse, Ville, Type_Lieu, Description) VALUES ('5 Av. Anatole France, 75007 Paris', 'Paris', 'Cinema', 'Cinéma offrant une vue imprenable sur la Tour Eiffel.');
INSERT INTO Lieu (Adresse, Ville, Type_Lieu, Description) VALUES ('Jardin des Tuileries, 75001 Paris', 'Paris', 'Parc', 'Un jardin public situé entre le Louvre et la Place de la Concorde.');
INSERT INTO Lieu (Adresse, Ville, Type_Lieu, Description) VALUES ('Avenue Winston Churchill, 75008 Paris', 'Paris', 'Musée', 'Le Grand Palais, lieu d\expositions majeures à Paris.');

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