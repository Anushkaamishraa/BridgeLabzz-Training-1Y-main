CREATE TABLE customers(id INT, name VARCHAR(50), phone VARCHAR(15));

INSERT INTO customers VALUES (1,'Rahul','9999999999');

SELECT * FROM customers WHERE name LIKE '%Rahul%';

UPDATE customers SET phone='8888888888' WHERE id=1;

DELETE FROM customers WHERE id=1;