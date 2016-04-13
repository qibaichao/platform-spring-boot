#jar包启动
java -jar platform.jar

#debug 启动
java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n  -jar platform.jar

#maven方式启动
mvn spring-boot:run