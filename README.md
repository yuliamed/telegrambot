# telegrambot
TelegramBot minibus
#Чат-бот для осуществления пассажирских перевозок
Этот чат бот создан для упращения процесса бронирования места у компании, осуществляющей перевозки пассажиров между двумя городами: Минск - Могилев

## Осовные функции
- Бронирование места в маршрутке *пользователем*
- Управление бронями *пользователем*
- Управление бронями *администратором*

##Пользователь
Для комфортного пользования телеграм-ботом было сделано меню с кнопками, которое упрощаем взаимодействие с пользователем.

###Реализованные функции
- Регистрация по номеру, привязанному к Telegram
- Бронирование места в маршрутке с такими параметрами как
    - Направление отправления
    - Дата отправления
    - Время отправления
    
- Просмотр забронированных мест
- Отмена брони

По кнопке *помощь* пользователь может получить  информацию о том, как правильно пользоваться предложенным меню

##Администратор
Для комфортного пользования телеграм-ботом водителями было сделано меню с кнопками, которое упрощаем взаимодействие с перевозчиками.

###Реализованные функции
Для старта работы с чат-ботом в качестве администратора, необходимо ввести команду /startadmin
- Вход по внесённым в БД логином и паролем 
- Просмотр рейсов на определённую дату
- Просмотр по кнопке *справка* возможностей бота
