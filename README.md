# Char counter
Rest Api приложение для подсчета колличества символов в строке.

## Использование
Для использования вам нужно скачать проект и запустить его на своем ПК. После чего вы можете сформировать POST запрос (например в браузере).По умолчанию адрес будет "http://localhost:8080/" (дополнительные маппинги не требуются) после чего добавить знак "?", параметр "inputText=" и дальше строку, подсчет символов которой вы хотите произвести. В ответ вы получите строку типа "String".

## Пример
![image](https://github.com/Valyez/CharCounter/assets/110019442/e40d03a4-490c-4100-bc14-372ea911b272)<br>
Например при POST запросе "http://localhost:8080/?inputText=123sdf", Вы получите строку ("1":1, "2":1, "3":1, "s":1, "d":1, "f":1 ), в которой будет содержаться пары "символ: количество вхождений в строку"


## Ограничения по входному и выходному типу данных
Контроллер приложения ожидает, что будет передана строка типа "String" состоящая из символов кодировки UTF-8 и возвращает строку типа "String".

## Тестирование
Проект покрыт юнит-тестами JUnit. <br>
![123](https://github.com/Valyez/CharCounter/assets/110019442/d1367a88-92ed-45a5-aa40-88d31b539721)<br>
![122](https://github.com/Valyez/CharCounter/assets/110019442/a81d4c53-ee69-42f3-b45a-71d0aebbc631)
