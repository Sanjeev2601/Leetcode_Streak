CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  declare M INT;
  set M = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT distinct salary
      FROM Employee
      ORDER BY salary DESC
      LIMIT 1 offset M      
  );
END
