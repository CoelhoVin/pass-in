# Pass-in - Aplicação para Gerenciamento de Participantes de Eventos Presenciais

## DESCRIÇÃO DO PROJETO
A aplicação consiste em realizar a gestão de eventos presenciais. Dessa forma, é permitido ao organizador criar um evento e abrir uma página pública para inscrição dos participantes.
Além disso, os participantes inscritos podem emitir uma credencial para realizar o check-in no dia do evento.

## FUNCIONALIDADES

### REQUISITOS FUNCIONAIS
 * O organizador deve poder cadastrar um novo evento;
 * O organizador deve poder visualizar os dados de um evento;
 * O organizador deve poder visualizar a lista de participantes;
 * O participante deve poder se inscrever em um evento;
 * O participante deve poder visualizar seu crachá de inscrição;
 * O participante deve poder realizar check-in no evento.

### REGRAS DE NEGÓCIO
  * O participante só pode se inscrever em um evento apenas uma vez;
  * O participante só pode se inscrever em eventos com vagas disponíveis;
  * O participante só pode realizar check-in em um evento uma única vez.

## TECNOLOGIAS
A ferramenta foi implementada em `Java` utilizando o `Spring Boot` framework. A criação das tabelas do banco de dados foram criadas utilizando `Migrations` e foram persistidas por meio do `HSQLDB`. 


## RESULTADO

URL_BASE = http://localhost:8080/

Criar novo evento

`POST` /events

![image](https://github.com/CoelhoVin/pass-in/assets/129123809/42aacf32-726c-479a-8159-14eabab4ad7d, "NEW EVENT")
<p align="center">
  POST - New Event
</p>


Buscar detalhes de um evento

`GET` /events/{eventId}

![image](https://github.com/CoelhoVin/pass-in/assets/129123809/d3c341a7-0746-42b6-87f4-7b2b163202cb, "EVENT DETAILS")
<p align="center">
  GET - Event Details
</p>

Inscrever participante em um  evento

`POST` /events/{eventId}/attendees

![image](https://github.com/CoelhoVin/pass-in/assets/129123809/6089bb8b-0a6d-4c87-b770-9ec3f1a22c3a, "NEW PARTICIPANT")
<p align="center">
  POST - Cria Participante
</p>

Consulta crachá de um participante

`GET` /attendees/{attendeeId}/badge

![image](https://github.com/CoelhoVin/pass-in/assets/129123809/a4ce6932-5d8a-4ff4-8481-c9c60266e058, "GET BADGE")
<p align="center">
  GET - Consulta Crachá
</p>

Realiza checkin de participante no evento

`POST` /attendees/{attendeeId}/check-in

![image](https://github.com/CoelhoVin/pass-in/assets/129123809/91ddb352-fea3-469f-b5eb-fa3bb3cf85ef, "CHECK-IN")
<p align="center">
  POST - Realiza Checkin
</p>



## OBSERVAÇÕES
O projeto foi desenvolvido com base no treinamento oferecido pela Rocketseat durante o evento NLW Unite.
Todo meu agradecimento a oportunidade de aprendizado oferecido pela equipe da Rocketseat.

