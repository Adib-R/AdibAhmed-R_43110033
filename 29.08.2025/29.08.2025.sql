create database officelist;
use officelist;

create table employee (
    emp_id int primary key,
    first_name varchar(50),
    last_name varchar(50),
    department varchar(50),
    salary decimal(10,2)
);

create table dept_details (
    department varchar(50) primary key,
    location varchar(50),
    manager varchar(50)
);

insert into employee values
(101, 'karthik', 'rajan', 'sales', 88000.00),
(102, 'neha', 'verma', 'it', 96000.00),
(103, 'vignesh', 'rao', 'hr', 83000.00),
(104, 'ananya', 'iyer', 'finance', 105000.00),
(105, 'rahul', 'mishra', 'marketing', 91000.00);

insert into dept_details values
('sales', 'pune', 'sindhu'),
('it', 'hyderabad', 'ajay'),
('hr', 'kolkata', 'rekha'),
('finance', 'mumbai', 'alok'),
('marketing', 'chennai', 'manish');

-- join 
select employee.first_name, employee.last_name, employee.department, dept_details.location, dept_details.manager
from employee 
join dept_details 
on employee.department = dept_details.department;

select employee.first_name, employee.last_name, employee.department, 
       dept_details.location, dept_details.manager
from employee
inner join dept_details
on employee.department = dept_details.department;

select employee.first_name, employee.department, dept_details.location
from employee
left join dept_details
on employee.department = dept_details.department;

select dept_details.department, dept_details.location, employee.first_name
from employee
right join dept_details
on employee.department = dept_details.department;

-- union 
select department from employee
union
select department from dept_details;

select department from employee
union all
select department from dept_details;