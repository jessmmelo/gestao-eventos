# Ambiente
- Java 8, Maven
- Node 10.19, Angular cli
- Mysql
### Subindo backand
- Crie o banco de dados `gestao-eventos`,
- Altere o arquivo `application.properties` apontando para o Mysql,
- Acesse a pasta `br.com.gestao-eventos`, execute o comando `mvn clean install -DskipTests` ,
- Execute o comando `java -jar target/br.com.gestao-eventos-1.0.0.jar`
### Subindo Frontand
- Acesse a pasta `gestao-eventos-frontend`,
- Execute o comando `npm i` ,
- Execute o comando `ng serve`