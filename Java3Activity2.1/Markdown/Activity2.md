# CST339 - Activity 2
- Date: 2025 February 2
- Author: Tyler Friesen

# Part 1 

--- 

### First controller route "/test1"
![img1.png](img1.png)

---

### Second controller route "/test2"
![img.png](img.png)

---

### Third controller route "/test3"
![img_1.png](img_1.png)

---

### Fourth route, redirecting from /test2 to /test4
![img_2.png](img_2.png)

---

### Adding more anchor tags to the /test2 route (also verifying /test2 and /test3 work)
![img_3.png](img_3.png)
![img_1.png](img_1.png)
![img.png](img.png)

---

### Created new Home Controller and associated View
![img_4.png](img_4.png)

---

# Part 2

### Login Form (localhost:8080/login/)
![img_5.png](img_5.png)

---

### Login Form Post, response from console
![img_6.png](img_6.png)

---

### Order table after logging in
![img_7.png](img_7.png)

---

### Login validation
![img_8.png](img_8.png)

---

# Part 3

### Added common/default template to the login page
![img_9.png](img_9.png)

---

### Added commmon/default template to the order page
![img_10.png](img_10.png)

---

# Research Questions

1. Spring MVC is a Java-based framework that supports the
Model-View-Controller (MVC) design pattern by separating
the application into three core components: the Model, 
View, and Controller. The Model represents the 
application's data and business logic, typically implemented through 
JavaBeans or POJOs (Plain Old Java Objects). These objects contain the core business data and can be manipulated 
or fetched by the Controller. The View is responsible for rendering the model data to the user, typically using 
technologies like JSP, Thymeleaf, or FreeMarker. This layer handles how the user interface is structured and presented. 
Finally, the Controller acts as the intermediary between the Model and the View. It processes user requests, interacts 
with the Model to manipulate or retrieve data, and returns a View to display the data to the user. The Controller is 
mapped to URLs through annotations, which determines which method should handle the incoming HTTP request. 
This clear separation ensures that the application is organized, making it easier to maintain and scale.
 
![img_11.png](img_11.png)

---

2. Two other popular MVC frameworks, apart from Spring MVC, are ASP.NET MVC and Ruby on Rails (RoR). ASP.NET MVC is a 
framework developed by Microsoft for building web applications using the .NET platform, primarily with C#. It follows 
the MVC pattern but is tied to the Microsoft ecosystem, offering features like built-in routing and integration with 
other .NET technologies such as Entity Framework for data access. It’s tightly integrated with the Visual Studio IDE, 
making development streamlined within the Microsoft ecosystem. In contrast, Spring MVC is Java-based and offers 
broader flexibility for integrating with various Java technologies, such as Spring Boot for rapid application 
development or Spring Security for securing web applications. Another key difference is that ASP.NET MVC is 
typically more opinionated regarding project structure, whereas Spring MVC provides more flexibility in terms of configuration.

- Ruby on Rails, on the other hand, is a web framework built using the Ruby programming language. Rails also follows the 
MVC design pattern but emphasizes “convention over configuration.” This means that Rails relies heavily on sensible 
defaults, reducing the need for explicit configuration from the developer. Rails is known for its speed of development, 
with built-in tools for scaffolding, migrations, and handling database queries through ActiveRecord. Unlike Spring MVC,
which requires more configuration but offers greater flexibility, Rails provides rapid development for database-backed 
applications, making it popular among startups and small to medium-sized applications. Rails' focus on
convention allows developers to build applications quickly without needing to make decisions about structure, 
whereas Spring MVC gives developers more control and flexibility at the cost of more configuration.