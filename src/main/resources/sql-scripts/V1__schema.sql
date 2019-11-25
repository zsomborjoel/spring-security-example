CREATE SCHEMA spring_security;

CREATE TABLE spring_security.credit_card (
  id bigint NOT NULL,
  name varchar(255) DEFAULT NULL,
  number varchar(255) DEFAULT NULL,
  cvv char(3) DEFAULT NULL,
  expiration_date char(7) DEFAULT NULL,
  balance bigint,
  PRIMARY KEY (id)
);


CREATE TABLE spring_security.role (
  id bigint NOT NULL,
  description varchar(255) DEFAULT NULL,
  role_name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE spring_security.user (
  id bigint NOT NULL,
  first_name varchar(255) NOT NULL,
  last_name varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  username varchar(255) NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE spring_security.user_role (
  user_id bigint NOT NULL,
  role_id bigint NOT NULL,
  CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES spring_security.user (id),
  CONSTRAINT FK_role_id FOREIGN KEY (role_id) REFERENCES spring_security.role (id)
);