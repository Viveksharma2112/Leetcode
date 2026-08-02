select w.id from Weather w 
join Weather a 
on datediff(w.recordDate, a.recordDate)=1 and w.temperature > a.temperature
group by w.id