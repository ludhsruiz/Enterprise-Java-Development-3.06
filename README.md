# Exercise 1 & 2 in folders 

# Exercise 3

List 3 tasks that can be accomplished with native SQL that you cannot do with JPQL

- Con JPQL se puede hacer subconsultas solo en las cláusulas WHERE y HAVING, pero no en las cláusulas SELECT y FROM. 
SQL, si permite utilizar subconsultas incluso en la cláusula SELECT y FROM.

- JPQL no permite usar UNION, INTERSECT y EXCEPT, que permiten realizar operaciones de conjuntos estándar en los conjuntos 
de resultados de consultas independientes.

- JPQL no permite hacer consultas recursivas.


JPQL es el lenguaje de consulta de persistencia de Java definido en la especificación JPA. Se utiliza para crear consultas
contra entidades para almacenar en una base de datos relacional. 
JPQL está desarrollado en base a la sintaxis SQL. Pero no afectará directamente a la base de datos.

JPQL puede recuperar información o datos usando la cláusula SELECT, puede hacer actualizaciones masivas usando 
la cláusula UPDATE y la cláusula DELETE. La API EntityManager.createQuery() admitirá el lenguaje de consulta.

Estructura de consulta
La sintaxis de JPQL es muy similar a la sintaxis de SQL. Tener una sintaxis similar a SQL es una ventaja porque 
SQL es un lenguaje de consulta estructurado simple y muchos desarrolladores lo están usando en aplicaciones. 
SQL funciona directamente con tablas, registros y campos de bases de datos relacionales, 
mientras que JPQL funciona con clases e instancias de Java.

Por ejemplo, una consulta JPQL puede recuperar un objeto de entidad en lugar de un conjunto de resultados de campo de la base de datos, como ocurre con SQL. La estructura de consulta JPQL de la siguiente manera.