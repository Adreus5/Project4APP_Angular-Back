CREATE TABLE Utilisateur (
                             ID_Utilisateur INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                             Nom VARCHAR(255),
                             Prenom VARCHAR(255),
                             Type_User ENUM ('Admin','Client')
);

CREATE TABLE NoteFilm (
                          ID_Utilisateur INT,
                          ID_Film INT,
                          Note INT CHECK ( Note>=0 AND Note<=5 ),
                          Commentaire VARCHAR(255),
                          PRIMARY KEY (ID_Utilisateur, ID_Film),
                          FOREIGN KEY (ID_Utilisateur) REFERENCES Utilisateur(ID_Utilisateur),
                          FOREIGN KEY (ID_Film) REFERENCES Film(ID_Film)
);

CREATE TABLE NoteLieu (
                          ID_Utilisateur INT,
                          ID_Lieu INT,
                          Note INT CHECK ( Note>=0 AND Note<=5 ),
                          Commentaire VARCHAR(255),
                          PRIMARY KEY (ID_Utilisateur, ID_Lieu),
                          FOREIGN KEY (ID_Utilisateur) REFERENCES Utilisateur(ID_Utilisateur),
                          FOREIGN KEY (ID_Lieu) REFERENCES Lieu(ID_Lieu)
);

CREATE TABLE Film (
                      ID_Film INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                      Nom_Film VARCHAR(255),
                      Genre ENUM ('Action','Comédie','Horreur','Drame','Romance'),
                      Langue ENUM ('Français', 'Anglais'),
                      Synopsis VARCHAR(255)
);

CREATE TABLE Lieu (
                       ID_Lieu INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                       Adresse VARCHAR(255),
                       Ville VARCHAR(255),
                       Type_Lieu ENUM('Restaurant','Bar','Cinema','Parc','Musée'),
                       Description VARCHAR(255)
);