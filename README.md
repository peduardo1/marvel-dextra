# marvel-dextra

Este projeto foi desenvolvido para o processo seletivo da Dextra.
Nele você pode retornar informações sobre super-heróis da Marvel (Quadrinhos, Séries, Eventos e Histórias aos quais eles participam).


## Executando o Projeto
Este projeto é uma aplicação Spring Boot, que será executada localmente utilizando Maven.

Utilizando a interface de linha de comando de sua preferência, use os seguintes comandos:

* Para baixar o projeto, utilzando GIT
```
git clone https://github.com/peduardo1/marvel-dextra.git
```

* Para executar o projeto (após a verificação dos testes e o build ocorrer)
```
cd marvel-dextra
./mvnw package
java -jar target/*.jar
```
Com isso, o projeto estará sendo executado, bastando utilizar a o endpoint:
http://localhost:8080/marvel/api/v1/public/character
