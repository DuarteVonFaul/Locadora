
INSERT INTO cliente (email, nome, senha, telefone)
VALUES ('john.doe@example.com', 'John Doe', 'senha123', '(11) 99999-1234');

INSERT INTO cliente (email, nome, senha, telefone)
VALUES ('jane.smith@example.com', 'Jane Smith', 'senha456', '(21) 98888-5678');

INSERT INTO cliente (email, nome, senha, telefone)
VALUES ('robert.johnson@example.com', 'Robert Johnson', 'senha789', '(31) 97777-9101');

INSERT INTO cliente (email, nome, senha, telefone)
VALUES ('emily.brown@example.com', 'Emily Brown', 'senha101', '(41) 96666-1213');

INSERT INTO cliente (email, nome, senha, telefone)
VALUES ('michael.davis@example.com', 'Michael Davis', 'senha202', '(51) 95555-1415');

INSERT INTO jogo (titulo)
VALUES ('The Last of Us');

INSERT INTO jogo (titulo)
VALUES ('Red Dead Redemption 2');

INSERT INTO jogo (titulo)
VALUES ('God of War');

INSERT INTO jogo (titulo)
VALUES ('The Witcher 3: Wild Hunt');

INSERT INTO jogo (titulo)
VALUES ('FIFA 21');

INSERT INTO plataforma (nome)
VALUES ('PlayStation 4');

INSERT INTO plataforma (nome)
VALUES ('Xbox One');

INSERT INTO plataforma (nome)
VALUES ('PC');

INSERT INTO plataforma (nome)
VALUES ('Nintendo Switch');

INSERT INTO plataforma (nome)
VALUES ('PlayStation 5');

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (15.99, 1, 1);  -- The Last of Us on PlayStation 4

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (16.99, 1, 2);  -- The Last of Us on Xbox One

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (14.99, 1, 3);  -- The Last of Us on PC

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (15.49, 1, 4);  -- The Last of Us on Nintendo Switch

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (18.99, 1, 5);  -- The Last of Us on PlayStation 5

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (17.99, 2, 1);  -- Red Dead Redemption 2 on PlayStation 4

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (18.99, 2, 2);  -- Red Dead Redemption 2 on Xbox One

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (16.99, 2, 3);  -- Red Dead Redemption 2 on PC

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (17.49, 2, 4);  -- Red Dead Redemption 2 on Nintendo Switch

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (19.99, 2, 5);  -- Red Dead Redemption 2 on PlayStation 5

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (12.99, 3, 1);  -- God of War on PlayStation 4

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (13.99, 3, 2);  -- God of War on Xbox One

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (11.99, 3, 3);  -- God of War on PC

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (12.49, 3, 4);  -- God of War on Nintendo Switch

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (14.99, 3, 5);  -- God of War on PlayStation 5

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (14.99, 4, 1);  -- The Witcher 3: Wild Hunt on PlayStation 4

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (15.99, 4, 2);  -- The Witcher 3: Wild Hunt on Xbox One

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (13.99, 4, 3);  -- The Witcher 3: Wild Hunt on PC

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (14.49, 4, 4);  -- The Witcher 3: Wild Hunt on Nintendo Switch

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (16.99, 4, 5);  -- The Witcher 3: Wild Hunt on PlayStation 5

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (19.99, 5, 1);  -- FIFA 21 on PlayStation 4

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (20.99, 5, 2);  -- FIFA 21 on Xbox One

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (18.99, 5, 3);  -- FIFA 21 on PC

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (19.49, 5, 4);  -- FIFA 21 on Nintendo Switch

INSERT INTO jogo_plataforma (preco_diario, jogo_id, plataforma_id)
VALUES (21.99, 5, 5);  -- FIFA 21 on PlayStation 5