# 🚀 Automation Testing Framework (Selenium + TestNG + Allure)

## 📌 Overview

This project is a **robust UI Automation Framework** designed using **Selenium WebDriver**, **TestNG**, and **Allure Reporting**.
It follows industry best practices like **Page Object Model (POM)** and **data-driven testing** to ensure scalability, maintainability, and readability.

The framework automates the login and basic user flows of the SauceDemo application.

---

## 🎯 Objectives

* Build a scalable automation framework from scratch
* Implement clean design patterns (POM)
* Integrate advanced reporting with Allure
* Support CI/CD using GitHub Actions
* Demonstrate real-world QA automation skills

---

## 🛠 Tech Stack

| Category       | Tools Used         |
| -------------- | ------------------ |
| Language       | Java               |
| Automation     | Selenium WebDriver |
| Test Framework | TestNG             |
| Build Tool     | Maven              |
| Reporting      | Allure Report      |
| CI/CD          | GitHub Actions     |

---

## 🏗 Framework Architecture

This framework follows a **layered architecture**:

```id="5lf08v"
Test Layer (TestNG Tests)
        ↓
Page Layer (Page Object Model)
        ↓
Utility Layer (Driver, JSON Reader, Screenshot)
        ↓
Test Data Layer (JSON files)
```

---

## 📂 Project Structure

```id="snc5zs"

automation-project/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/              # Page Object Model classes
│   │           ├── LoginPage.java
│   │           └── HomePage.java
│   │
│   └── test/
│       └── java/
│           └── tests/              # Test classes
│               ├── LoginTest.java
│               └── CheckoutTest.java
│
├── resources/
│   ├── testdata/                   # Test data (JSON, Excel, etc.)
│   └── config.properties           # Environment config
│
├── allure-results/                 # Raw Allure results (auto-generated)
├── allure-report/                  # Generated HTML report
│
├── utils/                          # Utilities (Driver, Helpers)
│   ├── DriverManager.java
│   └── ScreenshotUtil.java
│
├── .github/
│   └── workflows/
│       └── ci.yml                  # GitHub Action
│
├── pom.xml                         # Maven dependencies
├── testng.xml                      # TestNG config 
├── README.md                       # Project documentation 
└── .gitignore
```

---

## ✨ Key Features

### 🔹 Page Object Model (POM)

* Separates UI elements from test logic
* Improves code reusability and maintainability

### 🔹 Data-Driven Testing

* Test data stored in external JSON files
* Easy to add multiple test scenarios

### 🔹 Allure Reporting

* Step-level reporting using annotations
* Screenshot capture on failure
* Rich dashboards and analytics

### 🔹 CI/CD Integration

* Automated test execution on every push
* Allure report generation in pipeline

---

## 🧪 Test Scenarios Covered

* ✅ Valid Login
* ❌ Invalid Login
* ⚠️ Empty Credentials
* 🔒 Locked User Login

---

## ▶️ How to Run the Project

### 🔧 Prerequisites

* Java 17+
* Maven installed
* Allure installed

### ▶️ Execute Tests

```id="0u7uxg"
mvn clean test
```

---

## 📊 Generate Allure Report

```id="63v3lb"
allure serve allure-results
```

---





## 🔄 CI/CD Pipeline (GitHub Actions)

The pipeline automatically:

* ✔ Builds the project
* ✔ Runs test cases
* ✔ Generates Allure results
* ✔ Uploads reports as artifacts

---

## ⚙️ Configuration

### config.properties

```id="mx2h7r"
browser=chrome
baseUrl=https://www.saucedemo.com/
```

---

## 📁 Test Data Example

```json id="n1i5jp"
{
  "validUser": {
    "username": "standard_user",
    "password": "secret_sauce"
  }
}
```

---

## ⚠️ Best Practices Followed

* ✔ Clean code structure
* ✔ Separation of concerns
* ✔ No hardcoded test data
* ✔ Reusable utility methods
* ✔ Git ignore for generated files

---

## 🚧 Limitations

* Currently supports only Chrome browser
* Limited test scenarios (can be expanded)

---

## 🚀 Future Enhancements

* 🔹 Cross-browser testing (Firefox, Edge)
* 🔹 Parallel execution
* 🔹 API testing integration (RestAssured)
* 🔹 Docker support
* 🔹 Allure report hosting (GitHub Pages)

---

