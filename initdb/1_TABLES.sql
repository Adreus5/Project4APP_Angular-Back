CREATE TABLE Utilisateur
(
    ID_Utilisateur SERIAL PRIMARY KEY,
    Nom            VARCHAR(255),
    Prenom         VARCHAR(255),
    Mail           VARCHAR(255),
    Type_User      VARCHAR(255) CHECK (Type_User IN ('Admin', 'Client'))
);

CREATE TABLE Film
(
    ID_Film  SERIAL PRIMARY KEY,
    Nom_Film VARCHAR(255),
    Genre    VARCHAR(255) CHECK (Genre IN ('Action', 'Comédie', 'Horreur', 'Drame', 'Romance')),
    Langue   VARCHAR(255) CHECK (Langue IN ('Français', 'Anglais')),
    Synopsis TEXT
);

CREATE TABLE Lieu
(
    ID_Lieu     SERIAL PRIMARY KEY,
    Nom         VARCHAR(255),
    Adresse     VARCHAR(255),
    Ville       VARCHAR(255),
    Type_Lieu   VARCHAR(255) CHECK (Type_Lieu IN ('Restaurant', 'Bar', 'Cinema', 'Parc', 'Musée', 'Monument')),
    Description TEXT
);

CREATE TABLE note_film
(
    id             SERIAL PRIMARY KEY,
    ID_Utilisateur INT,
    ID_Film        INT,
    Note           INT CHECK (Note >= 0 AND Note <= 5),
    Commentaire    VARCHAR(255),
    FOREIGN KEY (ID_Utilisateur) REFERENCES Utilisateur (ID_Utilisateur),
    FOREIGN KEY (ID_Film) REFERENCES Film (ID_Film)
);

CREATE TABLE note_lieu
(
    id             SERIAL PRIMARY KEY,
    ID_Utilisateur INT,
    ID_Lieu        INT,
    Note           INT CHECK (Note >= 0 AND Note <= 5),
    Commentaire    VARCHAR(255),
    FOREIGN KEY (ID_Utilisateur) REFERENCES Utilisateur (ID_Utilisateur),
    FOREIGN KEY (ID_Lieu) REFERENCES Lieu (ID_Lieu)
);