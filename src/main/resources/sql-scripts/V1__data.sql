INSERT INTO spring_security.roles(id, role_name, description) VALUES (1, 'STANDARD_USER', 'Standard User - Has no admin rights');
INSERT INTO spring_security.roles(id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin User - Has permission to perform admin tasks');


INSERT INTO spring_security.users(id, first_name, last_name, password, username) VALUES (1, 'Zsombor', 'Gyurkovics', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'zsombor.gyurkovics');
INSERT INTO spring_security.users(id, first_name, last_name, password, username) VALUES (2, 'Admin', 'Admin', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.admin');


INSERT INTO spring_security.user_roles(user_id, role_id) VALUES(1,1);
INSERT INTO spring_security.user_roles(user_id, role_id) VALUES(2,1);
INSERT INTO spring_security.user_roles(user_id, role_id) VALUES(2,2);


INSERT INTO spring_security.credit_cards(id, name, number, cvv, expiration_date, balance) VALUES (1, 'Elijah Carter', '4711685971226626', '446', '07/2022', '4633');
INSERT INTO spring_security.credit_cards(id, name, number, cvv, expiration_date, balance) VALUES (2, 'Tyler Anderson', '4048627761737853', '412', '06/2024', '53531');
INSERT INTO spring_security.credit_cards(id, name, number, cvv, expiration_date, balance) VALUES (3, 'Jos Jones', '4136049189291772', '220', '02/2022', '4633');
INSERT INTO spring_security.credit_cards(id, name, number, cvv, expiration_date, balance) VALUES (4, 'Emily Jones', '4601524601485539', '265', '04/2020', '68721');
INSERT INTO spring_security.credit_cards(id, name, number, cvv, expiration_date, balance) VALUES (5, 'Joseph King', '4666726759807768', '762', '12/2019', '63543');
INSERT INTO spring_security.credit_cards(id, name, number, cvv, expiration_date, balance) VALUES (6, 'Joseph Collins', '4114627181415451', '860', '07/2021', '4543');
