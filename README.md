# Демо проект по автоматизации тестирования мобильного приложения Wikipedia.
<a target="_blank" href="https://www.browserstack.com/">Веб сайт browserstack.com</a>

## Содержание:

> ➠[Реализованные проверки](#boom-Реализованные-проверки)
> 
> ➠[Технологии](#classical_building-Технологии)
> 
> ➠[Сборка в Jenkins](#man_cook-Jenkins-job)
> 
> ➠[Запуск из терминала](#electron-Запуск-тестов-из-терминала)
> 
> ➠[Allure отчет](#bar_chart-Allure-отчет)
> 
> ➠[Видео примеры](#video_camera-Видео)


## Реализованные проверки

- ✓ Проверка экрана поиска
- ✓ Проверка функции поиска по заглавной букве
- ✓ Проверка открытия блока новостей на главной странице
- ✓ Проверка возможности спрятать определенный раздел 
- ✓ Проверка общих настроек: возможность выбора и установки языка

##  Технологии

<p align="center">
<img width="6%" title="Idea" src="images/logo/Idea.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/Junit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Browserstack" src="images/logo/browserstack.svg">
</p>

## Jenkins job
<img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a>  <a target="_blank" href="https://jenkins.autotests.cloud/job/Mobile_tests/">Jenkins job</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/011-maslogirl-FinalProject-Mobile/"><img src="images/screens/job.PNG" alt="Jenkins"/></a>
</p>

## Запуск тестов из терминала

```
gradle clean mobile_tests
```

## Allure-отчет
<img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/Mobile_tests/allure/">Allure report</a>

###  Основной отчет
<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/allure.PNG">
</p>


### Тесты
<p align="center">
<img title="Allure Tests" src="images/screens/allure2.PNG">
</p>

##  Примеры Видео
<p align="center">
<img src="/images/gif/mob.gif" alt="video"/></a>
<img src="/images/gif/mob1.gif" alt="video"/></a>
</p>
