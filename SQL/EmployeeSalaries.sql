select first_name, last_name, salary from employees
where id in (select max(id) from employees group by First_Name, Last_Name)

/*
Let’s say we have a table representing a company payroll schema.

Due to an ETL error, the employees table, instead of updating the salaries every year when doing compensation adjustments, did an insert instead. The head of HR still needs the current salary of each employee.

Write a query to get the current salary for each employee.

Note: Assume no duplicate combination of first and last names (I.E. No two John Smiths). Assume the INSERT operation works with ID autoincrement.

Example:

Input:

employees table

Column	Type
id	VARCHAR
first_name	VARCHAR
last_name	VARCHAR
salary	INTEGER
department_id	INTEGER
Output:

Column	Types
first_name	VARCHAR
last_name	VARCHAR
salary	INTEGER

*/

--1. 
select top 1 * from employee
order by salary desc

--2. 
select max(salary) from employee

--3. 

--4. 

--5. 

--6. 

--7. 