INSERT INTO CHARACTER (NAME, DESCRIPTION, MODIFIED)
VALUES  ('Homem Aranha', NULL, CURRENT_DATE),
        ('Homem De Ferro', NULL, CURRENT_DATE),
        ('Hulk', NULL, CURRENT_DATE),
        ('Wolverine', NULL, CURRENT_DATE),
        ('Professor Xavier', NULL, CURRENT_DATE),
        ('Jean Grey', NULL, CURRENT_DATE),
        ('Tempestade', NULL, CURRENT_DATE),
        ('Viúva Negra', NULL, CURRENT_DATE),
        ('Vespa', NULL, CURRENT_DATE),
        ('Mística', NULL, CURRENT_DATE);

INSERT INTO COMIC (TITLE, DESCRIPTION, MODIFIED, FORMAT, PAGE_COUNT)
VALUES  ('Homem Aranha - número 154', null, CURRENT_DATE, 'Capa dura', 64),
        ('Powers of X', NULL, CURRENT_DATE, 'Brochura', 32),
        ('Hulk', NULL, CURRENT_DATE, 'Revista', 64),
        ('X-men', NULL, CURRENT_DATE, 'Almanaque', 128),
        ('Homem Aranha - número 154', NULL, CURRENT_DATE, 'Capa dura', 64),
        ('Homem De Ferro', NULL, CURRENT_DATE, 'Brochura', 32),
        ('Hulk', NULL, CURRENT_DATE, 'Revista', 64),
        ('Wolverine', NULL, CURRENT_DATE, 'Almanaque', 128);

INSERT INTO CHARACTER_COMICS(CHARACTER_ID, COMIC_ID)
VALUES(1,1),
       (4,2),
       (4,4),
       (5,2),
       (5,4),
       (6,4),
       (7,2);


INSERT INTO EVENT (TITLE, DESCRIPTION, MODIFIED, START, END)
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
 ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
 ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
 ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
 ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
 ('Homem Aranha - número 154', NULL, CURRENT_DATE, TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'),
        TO_DATE('1991-04-22 00:00:00', 'YYYY-MM-DD HH:MM:SS'));

INSERT INTO CHARACTER_EVENTS(CHARACTER_ID, EVENT_ID)
VALUES (1,1),
    (4,2),
    (4,4),
    (5,2),
    (5,4),
    (6,5),
    (7,2);


INSERT INTO SERIES (TITLE, DESCRIPTION, MODIFIED, START_YEAR, END_YEAR)
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, 1991, 1993),
 ('Powers of X', NULL, CURRENT_DATE, 1991, 1993),
 ('Hulk', NULL, CURRENT_DATE,  1991, 1993),
 ('X-men', NULL, CURRENT_DATE,  1991, 1993),
 ('Homem Aranha - número 154', NULL, CURRENT_DATE, 1991, 1993),
 ('Homem De Ferro', NULL, CURRENT_DATE,  1991, 1993),
 ('Hulk', NULL, CURRENT_DATE, 1991, 1993),
 ('Wolverine', NULL, CURRENT_DATE, 1991, 1993);

INSERT INTO CHARACTER_SERIES(CHARACTER_ID, SERIES_ID)
VALUES(1,1),
       (4,2),
       (4,4),
       (5,2),
       (5,4),
       (6,4),
       (7,2);

INSERT INTO STORY (TITLE, DESCRIPTION, MODIFIED, TYPE)
VALUES ('Homem Aranha - número 154', NULL, CURRENT_DATE, '1991'),
 ('Powers of X', NULL, CURRENT_DATE, '1991'),
 ('Hulk', NULL, CURRENT_DATE,  '1991'),
 ('X-men', NULL, CURRENT_DATE,  '1991'),
 ('Homem Aranha - número 154', NULL, CURRENT_DATE, '1991'),
 ('Homem De Ferro', NULL, CURRENT_DATE,  '1991'),
 ('Hulk', NULL, CURRENT_DATE, '1991'),
 ('Wolverine', NULL, CURRENT_DATE, '1991');

 INSERT INTO CHARACTER_STORIES (CHARACTER_ID, STORY_ID)
 VALUES(1,1),
        (4,2),
        (4,4),
        (5,2),
        (5,4),
        (6,4),
        (7,2);
