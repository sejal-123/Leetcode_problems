# Write your MySQL query statement below
select b.id from Weather a join Weather b where DATEDIFF(b.recordDate, a.recordDate) = 1 and b.temperature > a.temperature; 