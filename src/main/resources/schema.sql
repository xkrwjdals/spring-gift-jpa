--CREATE TABLE IF NOT EXISTS product (
--    id SERIAL PRIMARY KEY,
--    name VARCHAR(255),
--    price DOUBLE,
--    imageUrl VARCHAR(255)
--);

--CREATE TABLE IF NOT EXISTS members (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    password VARCHAR(100) NOT NULL,
--    email VARCHAR(50) NOT NULL
--);

CREATE TABLE IF NOT EXISTS wishlist (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(50),
    memberId BIGINT,
    productName VARCHAR(255),
    quantity BIGINT
);