select p.nome as 'Nome do profissional', a.jornada_de_trabalho, pa.nome as 'Nome do projeto' 
from apontamentos a  
inner join profissional p on a.profissional_id = p.id 
inner join projeto_alocado pa ON pa.id  =a.projeto_alocado_id 
select * from profissional;
insert into profissional (id,nome,matricula) values (9,"Paula", 105);
insert into apontamentos (id_apontamento,ano,dias_trabalhados,jornada_de_trabalho,mes,nome) values (11, 2023, 21, 8,4,"Rita");
delete from profissional where id =4;