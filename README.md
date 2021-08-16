# **Page Object model Test automation REST API framework using rest-assured with Java,Junit and Maven** 

**This is a sample project to demonstrate what is page object model framework and how it** 
**can used in rest-assured with java to automate any application. Junit is used as a test** 
**framework**

**(1) First we have to copy git repository on our local system and below command from command line:**

```
(1)-->git https://github.com/kartikeya27/API-Framework.git
(2)-->cd API-Framework
(3)-->mvn clean test verify----> maven command from command line.

for dockers ----> make sure docker desktop run in your local system then 
(1)-->docker build -t mydockerimage . 
(2)-->docker images --to make sure your immage is created or not
(3)-->docker run -d --network="host" mydockerimage mvn -f /Users/k-bhatt/eclipse-workspace1/APIFramework/pom.xml 
         clean test verify. Please change the /Users/k-bhatt/eclipse-workspace1/ according to your local setup.
(4)-->docker logs 37015d9f8a9e1444f14d3d8d1c2c6588792bd91c8b7874354f38b676d71d5040---> agains this is my id you 
         can change it accordingly 


```
**(2) Ncessary Libraries and Software:** 

```
(1) Install maven on MAC and add maven path into environment path inside ./bashrc_profile.
(2) Install jdk1.8 on mac and add path into environment path inside ./bashrc_profile.
(3) Type java --version and mvn --version.
(4) It is maven based porject so all necessary dependecnies will download it automatically once you import
    this project in any preferable IDE.

```
**(3) run test from different area:** 
```
* Once we copy this project on local system either we can run the test cases from command line 
  or from any IDE of your preference. In Eclipse IDE we can right click on TestRunner.java and run
  it as a junit test framework.
  
* Report will be generated inside target/cucumber-html-reports/ folder. For test repoert I am using html 
  cucumber report. overview-features.html file will be generated after every run.
    
* It will also created logging.txt file for get request with response.


```
### **Structure about this framework:**
```
1. Create maven based project with cucumber and Rest assured dependencies.
2. Create feature file with test case we want to automate.
3. Implement smart step definition file with supported code.
4. Build Utils package to define all reusable request and response specification.
5. Build Pojo package classed for serializing and deserializing JSON payload in our case there
   is not requirement because we do not have any POST request.
6. Implementing logging into Framework to log request and response details.
7. Develop end-to-end functionality test with all validation with assertion.
8. Define global properties and drive all the global variables  from Properties file.
9. Define Enum class with constants to centralized all resources details.
10. Add tagging mechanism to run selected tests from Test Runner.
11. There is no need for Hooks otherwise I would have done so.
12. Same here for data-driven and data-parameterized.
13. Execute complete framework from command line.
14. Generate reports for test execution result.

``` 
``` 
### **Project Structure diagram of this framework:** 
.
├── Dockerfile
├── README.md
├── logging.txt
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── pojo
│   │           └── GetResult.java
│   └── test
│       └── java
│           ├── cucmber
│           │   └── Options
│           │       └── TestRunner.java
│           ├── features
│           │   └── test.feature
│           ├── resources
│           │   ├── APIResources.java
│           │   ├── Utils.java
│           │   └── global.properties
│           └── stepDefinations
│               └── StepDefination.java
└── target
    ├── APIFramework-0.0.1-SNAPSHOT.jar
    ├── classes
    │   └── pojo
    │       └── GetResult.class
    ├── cucumber-html-reports




