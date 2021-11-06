# Warehouse service

Сервис для работы с товаром для склада

## Стек технологий

- spring-boot
- spring-boot-starter-data-jpa
- spring-boot-starter-actuator
- spring-boot-starter-test
- springdoc-openapi-ui
- lombok
- postgresql
- gradle

## Переменные окружения

    url: "jdbc:postgresql://localhost:1234/wh_db"
    username: "postgres"
    password: "733123"

## Документация

- Добавить чат.
    - Будем отслеживать добавление и удаление товара ирл.
- Добавить auth service.
- Расширить таблицу(список будет пополняться).
    - тип товара будет храниться в integer(создать enum)
    - время создания(поступление товара)
    - время удаление(товар забрали)
    - статус


## Разработка

1. Для запуска на локальной машине


2. Автоматически отформатировать код

