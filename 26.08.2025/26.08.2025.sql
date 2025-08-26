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
(8, 'Meena', 'Sundar', 'Finance', 125000.00);

SELECT * FROM Worker;

-- USING AND,NOT,OR operator

SELECT * FROM Worker
WHERE DEPARTMENT = 'IT' AND SALARY > 100000;

SELECT * FROM Worker
WHERE DEPARTMENT = 'HR' OR SALARY < 80000;

SELECT * FROM Worker
WHERE NOT DEPARTMENT = 'Finance';

SELECT * FROM Worker
WHERE SALARY > 90000 AND (DEPARTMENT = 'IT' OR DEPARTMENT = 'Finance');

-- USING IN AND NOT IN

SELECT * FROM Worker 
WHERE WORKER_ID IN (1,3,5,8) and salary>=10000;

SELECT * FROM Worker
WHERE WORKER_ID NOT IN (2,4,6,8);

-- QNA 
-- 1. Find workers not in HR or Admin with salary between 70000 and 300000.
select * from worker 
where DEPARTMENT NOT IN  ('Hr') OR ('admin') AND Salary between 70000 AND 300000 ;

-- 2. Find workers with first name starting with 'V' and salary greater than or equal to 200000.
SELECT * FROM WORKER
WHERE FIRST_NAME LIKE 'V%' AND SALARY>= 200000 OR  SALARY=200000;

-- 3. Find workers not in Admin with salary < 100000.
SELECT * FROM WORKER
WHERE DEPARTMENT NOT IN ('ADMIN') AND SALARY< 100000;

-- USING MIN() AND MAX() 
SELECT MIN(SALARY) AS Minimum_Salary FROM Worker ;

SELECT * FROM Worker
WHERE SALARY = (SELECT  MAX(SALARY) FROM Worker);

-- QNA
-- 1. Find the average salary in the Admin department
SELECT AVG(SALARY) AS Avg_Admin_Salary
FROM Worker
WHERE DEPARTMENT = 'Admin';

-- 2. Total salary for HR and Admin departments combined
SELECT SUM(SALARY) AS Total_HR_Admin_Salary
FROM Worker
WHERE DEPARTMENT IN ('HR', 'Admin');

-- 3. (same as 2 since you repeated it)
SELECT SUM(SALARY) AS Total_HR_Admin_Salary
FROM Worker
WHERE DEPARTMENT IN ('HR', 'Admin');

-- 4. Count employees whose first name starts with 'V'
SELECT COUNT(*) AS Count_V
FROM Worker
WHERE FIRST_NAME LIKE 'V%';

-- 5. Total salary of employees with salary between 50000 and 200000
SELECT SUM(SALARY) AS Total_Salary_Range
FROM Worker
WHERE SALARY BETWEEN 50000 AND 200000;

-- using  union operator 

SELECT FIRST_NAME FROM Worker
UNION 
SELECT LAST_NAME FROM Worker;

-- using CASE OPERATOR

SELECT FIRST_NAME, SALARY,
CASE 
    WHEN SALARY < 50000 THEN 'poor'
    WHEN SALARY BETWEEN 50000 AND 150000 THEN 'med-class'
    ELSE 'rich'
END AS StatusBasedOnSalary
FROM Worker;
