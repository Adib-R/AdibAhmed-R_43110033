CREATE DATABASE company;
SHOW DATABASES;
USE company;

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
(5, 'Suresh', 'Patel', 'HR', 70000.00),
(6, 'Divya', 'Kumar', 'IT', 105000.00),
(7, 'Vikas', 'Srivastava', 'Admin', 250000.00),
(8, 'Meena', 'Sundar', 'Finance', 125000.00),
(9, 'Ramu', 'Sharma', 'Networking', 250000.00),
(10, 'Gopi', 'Shree', 'Networking', 250000.00),
(11, 'Kiran', 'Mishra', 'Networking', 500000.00);

-- using order by

select * from worker where 
department='hr' order by salary asc; 

select * from worker ;

-- using group by

select department, count(department) from
worker group by department ;

select department, sum(salary) from
worker group by department
order by department asc;

-- QNA 
-- 1. Count employees not in HR or Admin.
SELECT COUNT(*) AS employee_count
FROM Worker
WHERE DEPARTMENT NOT IN ('HR', 'Admin');

-- 2. Find the highest salary in each department
SELECT DEPARTMENT, MAX(SALARY) AS highest_salary
FROM Worker
GROUP BY DEPARTMENT;

-- using limit and offset

SELECT * 
FROM Worker 
ORDER BY WORKER_ID 
LIMIT 2;

SELECT * 
FROM Worker 
ORDER BY WORKER_ID 
LIMIT 2 OFFSET 4;

SELECT * 
FROM ( 
    SELECT *, ROW_NUMBER() OVER (ORDER BY WORKER_ID) AS rn 
    FROM Worker 
) AS temp
WHERE rn > 5;


-- QNA 
-- 1. Find departments with average salary > 100000
SELECT department, AVG(salary) AS avg_salary
FROM Worker
GROUP BY department
HAVING AVG(salary) > 100000;

-- 2. Find departments where max salary is exactly 500000
SELECT department, MAX(salary) AS max_salary
FROM Worker
GROUP BY department
HAVING MAX(salary) = 500000;

-- 3. Find departments with more than 1 employee and total salary > 100000
SELECT department, COUNT(*) AS emp_count, SUM(salary) AS total_salary
FROM Worker
GROUP BY department
HAVING COUNT(*) > 1 AND SUM(salary) > 100000;

-- 4. Find departments with avg salary between 50000 and 200000
SELECT department, AVG(salary) AS avg_salary
FROM Worker
GROUP BY department
HAVING AVG(salary) BETWEEN 50000 AND 200000;


--
CREATE TABLE Department_Project (
    DEPT_NAME VARCHAR(50),
    PROJECT_NAME VARCHAR(50)
);

INSERT INTO Department_Project VALUES
('HR','Recruitment Drive'),
('Finance','Audit 2025'),
('IT','ERP Implementation'),
('Marketing','Product Launch'),
('Networking','Security Upgrade'),
('Admin','Infrastructure Setup');

select * from worker ;

SELECT * FROM Worker
WHERE DEPARTMENT = (SELECT DEPT_NAME FROM Department_Project WHERE PROJECT_NAME='Recruitment Drive');

SELECT * FROM Department_Project
WHERE DEPT_NAME = (SELECT DEPARTMENT FROM Worker WHERE FIRST_NAME='Nikhil');

SELECT * FROM Worker
WHERE DEPARTMENT = (SELECT DEPT_NAME FROM Department_Project WHERE PROJECT_NAME='Audit 2025');

SELECT * FROM Department_Project
WHERE DEPT_NAME = (SELECT DEPARTMENT FROM Worker WHERE FIRST_NAME='Suresh');


