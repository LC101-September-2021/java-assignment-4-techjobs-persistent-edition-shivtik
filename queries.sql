-- Part 1: Test it with SQL
SHOW COLUMNS FROM job;

-- Part 2: Test it with SQL
SELECT * from employer
WHERE LOCATION = 'St. Louis City'

-- Part 3: Test it with SQL
DROP TABLE job;

-- Part 4: Test it with SQL
SELECT name, description
FROM skill
INNER JOIN job_skills on skill.id = job_skills.skills_id
ORDER BY name ASC