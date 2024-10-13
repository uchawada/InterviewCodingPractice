/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/

select 
CASE WHEN 
    g.Grade < 8 THEN NULL
    ELSE s.Name end as Name
    , g.Grade, s.Marks from Students s
inner join Grades g
on s.Marks between g.Min_Mark and g.Max_Mark
order by g.Grade desc, s.Name
