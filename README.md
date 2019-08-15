# spring-cloud-config

#### Utilizado pela aplicação Buspoa para buscar as configurações de perfil no github.

No arquivo application.properties foi definido a porta da aplicação como sendo a 8888 e o local no git com os arquivos de perfil que podem ser utilizados pela aplicação Buspoa.
```
server.port=8888
spring.cloud.config.server.git.uri=https://github.com/aluizt/spring-cloud-config-properties.git
```
