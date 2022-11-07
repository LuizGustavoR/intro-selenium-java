# intro-selenium-java

I've created this repository with the objective to learn about web test automation projects using:
- Java, Selenium, Cucumber, TestNG, Maven and Docker.

---

# Setup Instructions

## Your Computer Setup

Previous software to be installed on your computer.
- Java 19.
- Maven.
- IDE (Preferred Intellij).
- Docker Desktop.

## Project Setup

1. Clone this repository.
2. Open the terminal and go to the project root folder.
3. Run `mvn test`.

PS: Check if your maven is using the jdk-19 (mvn --version).\
PS2: Check is the browser version of your machine\
is the same version of the chromedriver inside the project /resources.

---

## Allure Reports

After running `mvn test` you have two options to create the report.

1. Run `mvn allure:serve`.\
   The report will be generated into the temp folder\
   where a webserver with the results will start.\
   The webserver has a default timeout of 1 hour.

2. Run `mvn allure:report`.\
   Report will be generated tо directory: `target/site/allure-maven/index.html`

---

## Docker Setup

Scale tests using docker.\
(selenium/hub, selenium/node-chrome, selenium/node-firefox).

1. Open the terminal and go to your project root folder.
2. Choose the `docker-compose` directory accordingly to the architecture your docker containers will be run.
   1. If architecture `x86-64` go to folder: `cd /docker/intel-amd/`
   2. If architecture `arm64` go to folder: `cd /docker/arm64/`
3. Run the command below to spin up the nodes:\
   `docker-compose up -d`
4. Go back to the project root folder\
   `intro-selenium-java/`\
   and run the maven tests:\
   `mvn test -Dtest.remote=true`
5. To shut down the docker nodes\
   go back inside your specific docker folder\
   `cd /docker/intel-amd/` or `cd /docker/arm64/`\
   and shut down the nodes with the command\
   `docker-compose down`.

PS: The `docker pull` command is not needed.\
If you haven't pulled the images yet,\
docker will do it for you while spinning up the images.

PS: Macos M1
https://hub.docker.com/u/seleniarm

# Project made with:

[![Java Badge](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Selenium](https://img.shields.io/badge/-selenium-%43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![Maven Badge](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://maven.apache.org/)
[![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)
---

# About the Author
Hi, My name is Luiz Gustavo,\
I work as a QA Engineer.\
Follow some contact links.

- [![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/luizgustavor/)
- [Blog](https://luizdeaguiar.com.br)
