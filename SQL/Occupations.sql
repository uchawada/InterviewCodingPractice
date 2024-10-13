select
MIN(CASE WHEN Occupation = 'Doctor' THEN NAME ELSE NULL END) AS Doctor
, MIN(CASE WHEN Occupation = 'Professor' THEN NAME ELSE NULL END) AS Professor
, MIN(CASE WHEN Occupation = 'Singer' THEN NAME ELSE NULL END) AS Singer
, MIN(CASE WHEN Occupation = 'Actor' THEN NAME ELSE NULL END) AS Actor
from (
    select Name, Occupation, ROW_NUMBER() over (partition by Occupation order by Name) as ID
    from Occupations
) as t
group by ID


/*

Pivot the Occupation column in OCCUPATIONS so that each Name is sorted alphabetically and displayed underneath its corresponding Occupation. The output column headers should be Doctor, Professor, Singer, and Actor, respectively.

Note: Print NULL when there are no more names corresponding to an occupation.

Input Format

The OCCUPATIONS table is described as follows:



Occupation will only contain one of the following values: Doctor, Professor, Singer or Actor.

Sample Input



Sample Output

Jenny    Ashley     Meera  Jane
Samantha Christeen  Priya  Julia
NULL     Ketty      NULL   Maria
Explanation

*/
