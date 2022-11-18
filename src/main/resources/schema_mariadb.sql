
INSERT INTO products(amount_prod, description_prod, name_prod,size_prod, type_prod, price_prod)
VALUES (10,"Botas echas en cuero de serpiente",  "Botas" , 37,"botas","40000"),
(20,"descripcion de los adidas",  "Adidas" , 37,"Tennis","30000"),
(55,"descripcion de las nikke",  "Nikke" , 37,"Tennis","80000");






INSERT INTO users (id_user,username,password,enable) 
VALUES(1,"admin","$2a$04$3PSz7.efwNmtGaPLAneWeeWqP9.9dd5SeK3ZvbU.IlJzRIMjGMmFe",0b1);

INSERT INTO users (id_user,username,password,enable) 
VALUES(2,"User","$2a$04$3PSz7.efwNmtGaPLAneWeeWqP9.9dd5SeK3ZvbU.IlJzRIMjGMmFe",0b1);

INSERT INTO authority (id,authority) VALUES (1,"ROLE_ADMIN");
INSERT INTO authority (id,authority) VALUES (2,"ROLE_USER");
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (1,1);
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (1,2);
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (2,2);