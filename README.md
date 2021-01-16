# PmAcademyAndroid-Metelov-L14

Відобразити список всіх членів дерева сім'ї.

Кожен елемент списку повинен відображати ім’я людини і під ним вік людини. 
Також перед “ім’я” та “вік” повинний бути відступ, який залежить від віддаленості в дереві від основи. 
Тобто, у “я” відступ може бути 4dp, і тоді у тата і мами буде 8dp, а у бабусь і дідусів 12dp, наприклад. 
Точні числа, а також стиль того, як буде виглядати текст (колір, розмір) - на ваш розсуд, 
але відступи вибирайте такі, щоб їх легко на око можно було розрізнити. 
Крім цього, дерево цього разу повинно включати як мінімум ще й ПРАБАБУСЬ та ПРАДІДУСІВ. 

Відображити список потрібно в порядку, який ви отримаєте по такій функції:
Функція f(person) = person, f(mom), f(dad)

Тоді якщо ми маємо таку сім’ю “я, мама, тато, мама мами, тато мами, мама тата, тато тата, то ми отримуємо наступний список, використовуючи функцію f(person)
f(я) = я, f(мама), f(тато) = я, мама, f(мама мами), f(тато мами), тато, f(мама тата), f(тато тата) = 
Я, мама, мама мами, тато тата, тато, мама тата, тато тата.
