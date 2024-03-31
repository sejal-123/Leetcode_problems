# Write your MySQL query statement below
select b.name name from Employee a join Employee b where a.managerId = b.id group by b.id;