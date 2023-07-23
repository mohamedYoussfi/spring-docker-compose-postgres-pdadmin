<pre>
 (base) $ docker ps                                               
CONTAINER ID   IMAGE                   COMMAND                  CREATED        STATUS         PORTS                                     NAMES
2b6eac0820e7   postgres:latest         "docker-entrypoint.s…"   16 hours ago   Up 7 seconds   0.0.0.0:51203->5432/tcp                   spring-postgres-docker-postgres-1
b127353daf81   dpage/pgadmin4:latest   "/entrypoint.sh"         16 hours ago   Up 7 seconds   80/tcp, 443/tcp, 0.0.0.0:5050->5050/tcp   spring-postgres-docker-pgadmin-1

(base) $ docker exec -it spring-postgres-docker-postgres-1 psql -U myuser -d mydatabase
psql (15.2 (Debian 15.2-1.pgdg110+1))
Type "help" for help.

mydatabase=# \l
                                              List of databases
    Name    | Owner  | Encoding |  Collate   |   Ctype    | ICU Locale | Locale Provider | Access privileges 
------------+--------+----------+------------+------------+------------+-----------------+-------------------
 mydatabase | myuser | UTF8     | en_US.utf8 | en_US.utf8 |            | libc            | 
 postgres   | myuser | UTF8     | en_US.utf8 | en_US.utf8 |            | libc            | 
 template0  | myuser | UTF8     | en_US.utf8 | en_US.utf8 |            | libc            | =c/myuser        +
            |        |          |            |            |            |                 | myuser=CTc/myuser
 template1  | myuser | UTF8     | en_US.utf8 | en_US.utf8 |            | libc            | =c/myuser        +
            |        |          |            |            |            |                 | myuser=CTc/myuser
(4 rows)

mydatabase=# \c mydatabase
You are now connected to database "mydatabase" as user "myuser".
mydatabase=# \dt
        List of relations
 Schema | Name  | Type  | Owner  
--------+-------+-------+--------
 public | event | table | myuser
(1 row)

mydatabase=# \d event
                       Table "public.event"
 Column |          Type          | Collation | Nullable | Default 
--------+------------------------+-----------+----------+---------
 id     | bigint                 |           | not null | 
 name   | character varying(255) |           |          | 
Indexes:
    "event_pkey" PRIMARY KEY, btree (id)

mydatabase=# select * from event;
 id | name 
----+------
  1 | Math
  2 | Info
  3 | Lab
(3 rows)

mydatabase=# 

</pre>