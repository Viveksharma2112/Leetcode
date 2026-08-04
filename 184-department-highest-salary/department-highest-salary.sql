# Write your MySQL query statement below
select d.name as Department,
e.name as Employee,
e.salary from
(
    select * ,
    Dense_rank() over(partition by departmentId order by salary desc) rnk
    from Employee
)
e
join Department d
on e.departmentId = d.id
where rnk = 1;