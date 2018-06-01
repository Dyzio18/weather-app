# Weather app

Weather client with store favorite city in DB and sending request to OpenWeatherMap API.
You can save favorite cities in database. Application display weather from your city in panel.

## What's inside 
This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Core
- Spring Data (Hibernate & MySQL)
- Spring MVC (Tomcat)
- [Thymleaf](https://thymeleaf.org)
- [MaterializeCSS](https://materializecss.com/)
- [OpenWeatherMap](https://openweathermap.org/api) (Weather API)


## Installation 
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

```mvn clean install```

## Database configuration 
Create a MySQL database with the name `weather-app` and add the credentials to `/resources/application.properties`.  
The default ones are :

```
spring.datasource.url=jdbc:mysql://localhost:3306/weather-app
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

If you using Windows the easiest way is install XAMPP.

## Usage 
Run the project and head out to [http://localhost:8080](http://localhost:8080)
