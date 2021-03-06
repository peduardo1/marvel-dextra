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
Com isso, o projeto estará sendo executado

Para verificar, basta utiizar um dos endpoints citados abaixo.


## Lista de Endpoints:

Todos os endpoints a seguir utilizam o método HTTP GET

http://localhost:8080/marvel/api/v1/public/character - Retorna a lista de todos os personagens cadastrados. Foram cadastrados 10 personagens no script de inicialização.

**Observação: para testar os endpoints abaixo, basta trocar os parametros "characterId" pelos Ids dos personagens retornados no endpoint citado acima.**

http://localhost:8080/marvel/api/v1/public/character/{characterId} - Retorna as informações do personagem escolhido pelo id passado no path do endpoint.

http://localhost:8080/marvel/api/v1/public/character/{characterId}/series - Retorna as informações das séries ao qual o personagem escolhido no endpoint participou. Para fins de teste, nem todos os personagens possuem séries cadastradas.

http://localhost:8080/marvel/api/v1/public/character/{characterId}/comics - Retorna as informações dos quadrinhos ao qual o personagem escolhido participou. Para fins de teste, nem todos os personagens possuem quadrinhos cadastrados.

http://localhost:8080/marvel/api/v1/public/character/{characterId}/stories - Retorna as estórias ao qual o personagem escolhido participou. Para fins de teste, nem todos os personagens possuem estórias cadastradas.

http://localhost:8080/marvel/api/v1/public/character/{characterId}/events - Retorna todos os eventos ao qual o personagem escolhido participou. Para fins de teste, nem todos os personagens possuem eventos cadastrados.
