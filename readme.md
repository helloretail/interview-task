# Hello Retail Developer Interview Task

This is a repo containing this description of a small task used when interviewing potential hires for Hello Retail. Beyond this description the repo also contains some scaffolding code that should make it easier to get going with the task.

## The task

The task is to create a small web app that can allow you view the 10 cheapest or the 10 most expensive products in a product list that can be fetched from an API. 

The app should show the 10 products and it should have UI for switching between the cheap and the expensive products.

## Getting started

The project requires that you have a [Java SDK](https://jdk.java.net/) (version 11 or newer) and [Maven](https://maven.apache.org/) installed. 

The scaffolding code is implemented using [Spring Boot](https://spring.io/projects/spring-boot). Once you have checked out the repo you should be able to start project using:

    mvn spring-boot:run

After the project has compiled and started you should be able to open the web app on [http://localhost:8080/](http://localhost:8080/)

The API for getting the complete list of products is hosted within the sample project. The list of products is paginated, so you will have to make more than one request to get all the products. The products can be fetched from `http://localhost:8080/feed/products.json`. When you parse the response it will contain a list of products and a `next` field containing the path of the next page of products. If the `next` field is null there is no further pages.

## Requirements

The app should be developed as a frontend implemented in Javascript/HTML that uses an API implemented in Java. The scaffolding already implemented should provide a good basis for this. The frontend part for the scaffolding is implemented in `/src/main/resources/static/index.html` the backend part is implemented in `/src/main/java/com/helloretail/interviewtask/ProductsController.java`.

Even though the API to get the complete list of products is just some static files hosted within the project the API should be considered external from the app, and not something you have any control of.

## Final remarks

You should spend no more than two hours on the task. The implementation will be used as basis for discussions during the technical interview. If you would have liked to do more stuff but ran out of time, please remember what you would have liked to do, so that we can discuss that. Once you have completed the task your implementation please send it to us. Our mailsystem unfortunately blocks zip-files with code, so please send a link to a Dropbox, Google Drive or other location where we can download the files from.
