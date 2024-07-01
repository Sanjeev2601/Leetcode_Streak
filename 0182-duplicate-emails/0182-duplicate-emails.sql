# Write your MySQL query statement below
SELECT email as Email
FROM Person 
group by email 
having count(Email) > 1