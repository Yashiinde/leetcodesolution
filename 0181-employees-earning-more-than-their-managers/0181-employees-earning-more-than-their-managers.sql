# Write your MySQL query statement below
select e.name as Employee
from Employee e,Employee m
where m.id=e.managerId
and e.salary>m.salary;