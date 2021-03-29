CREATE TABLE IF NOT EXISTS customers (
  id         BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(50)   NOT NULL,
  last_name  VARCHAR(100)  NOT NULL,
  address    VARCHAR(1000) NOT NULL,
  budget     DECIMAL       NOT NULL
);

CREATE TABLE IF NOT EXISTS categories (
  id    BIGINT AUTO_INCREMENT PRIMARY KEY,
  name_ VARCHAR(50)   NOT NULL
);

CREATE TABLE IF NOT EXISTS tasks (
  id            BIGINT AUTO_INCREMENT PRIMARY KEY,
  name_                 VARCHAR(50)   NOT NULL,
  descriprion           VARCHAR(100)  NOT NULL,
  date_of_resolution    VARCHAR(1000) NOT NULL,
  condition_            VARCHAR       NOT NULL,
  type_                 VARCHAR(100)  NOT NULL,
  user_                 VARCHAR (100) NOT NULL
);