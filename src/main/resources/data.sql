INSERT INTO CHARACTER (NAME, DESCRIPTION, MODIFIED)
VALUES ("Homem Aranha", NULL, CURRENT_DATE),
VALUES ('Homem De Ferro', NULL, CURRENT_DATE),
VALUES ('Hulk', NULL, CURRENT_DATE),
VALUES ('Wolverine', NULL, CURRENT_DATE),
VALUES ('Professor Xavier', NULL, CURRENT_DATE),
VALUES ('Jean Grey', NULL, CURRENT_DATE),
VALUES ('Tempestade', NULL, CURRENT_DATE),
VALUES ('Viúva Negra', NULL, CURRENT_DATE),
VALUES ('Vespa', NULL, CURRENT_DATE),
VALUES ('Mística', NULL, CURRENT_DATE);

INSERT INTO COMIC (TITLE, DESCRIPTION, MODIFIED, FORMAT, PAGE_COUNT)
VALUES ('Homem Aranha - número 154', null, CURRENT_DATE, 'Capa dura', 64),
VALUES ('Powers of X', NULL, CURRENT_DATE, 'Brochura', 32),
VALUES ('Hulk', NULL, CURRENT_DATE, 'Revista', 64),
VALUES ('X-men', NULL, CURRENT_DATE, 'Almanaque', 128),
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, 'Capa dura', 64),
VALUES ('Homem De Ferro', NULL, CURRENT_DATE, 'Brochura', 32),
VALUES ('Hulk', NULL, CURRENT_DATE, 'Revista', 64),
VALUES ('Wolverine', NULL, CURRENT_DATE, 'Almanaque', 128);

INSERT INTO EVENT (TITLE, DESCRIPTION, MODIFIED, START, END)
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'));

INSERT INTO SERIES (TITLE, DESCRIPTION, MODIFIED, START_YEAR, END_YEAR)
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, 1991, 1993),
VALUES ('Powers of X', NULL, CURRENT_DATE,, 1991, 1993),
VALUES ('Hulk', NULL, CURRENT_DATE, , 1991, 1993),
VALUES ('X-men', NULL, CURRENT_DATE, , 1991, 1993),
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, , 1991, 1993),
VALUES ('Homem De Ferro', NULL, CURRENT_DATE,  1991, 1993),
VALUES ('Hulk', NULL, CURRENT_DATE, "Revista", 1991, 1993),
VALUES ('Wolverine', NULL, CURRENT_DATE, 1991, 1993);

INSERT INTO STORY (TITLE, DESCRIPTION, MODIFIED, TYPE)
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, '1991'),
VALUES ('Powers of X', NULL, CURRENT_DATE, '1991'),
VALUES ('Hulk', NULL, CURRENT_DATE,  '1991'),
VALUES ('X-men', NULL, CURRENT_DATE,  '1991'),
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, '1991'),
VALUES ('Homem De Ferro', NULL, CURRENT_DATE,  '1991'),
VALUES ('Hulk', NULL, CURRENT_DATE, 'Revista', '1991'),
VALUES ('Wolverine', NULL, CURRENT_DATE, '1991');