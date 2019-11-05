Demo shows springboot can use several external properties files

Compile: gradle bootJar

Run: java -jar build/libs/springboot.configuration-1.0-SNAPSHOT.jar --spring.config.location=/path/to/mysql.properties,/path/to/elasticsearch.properties,/path/to/overridden.properties

