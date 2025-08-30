CREATE DATABASE saturday;
USE saturday;

CREATE TABLE Worker (
    WORKER_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50) NOT NULL,
    LAST_NAME VARCHAR(50) NOT NULL,
    DEPARTMENT VARCHAR(50) NOT NULL,
    SALARY DECIMAL(10,2) NOT NULL
);

INSERT INTO Worker VALUES
(1, 'Vipul', 'Sharma', 'HR', 85000.00),
(2, 'Ritika', 'Singh', 'Finance', 120000.00),
(3, 'Nikhil', 'Saxena', 'IT', 95000.00),
(4, 'Anika', 'Sinha', 'Marketing', 110000.00),
(5, 'Suresh', 'Patel', 'HR', 70000.00);

SELECT * FROM Worker;
