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
│   ├── main/java/pages/
│   │   ├── LoginPage.java
│   │   └── HomePage.java
│   │
│   ├── test/java/tests/
│   │   └── LoginTest.java
│   │
│   └── test/resources/
│       └── testdata/
│           └── loginData.json
│
├── utils/
│   ├── DriverManager.java
│   ├── JsonReader.java
│   └── ScreenshotUtil.java
│
├── .github/workflows/
│   └── ci.yml
│
├── pom.xml
├── testng.xml
└── README.md
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

## 📸 Allure Report Insights

### Dashboard View

![Image](https://images.openai.com/static-rsc-4/ZkEqmaVZ_LZHjbbXTMkv5afnofykxxDVPL57WRo6-xlThNrqXA1r7Ow2mG-QC0YLLo-GTHPfJ1UX5VW0F0T7IMlZonIB2C0mwfHlfEpvTmYTlLSl-1se6qDYQJG7EEeD1f1E0bTHaQ7H3kmqHzQEBxwPwgEPzcYl_YIf4EKzU8ZO19MMBlID36IOtENE3y7u?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/-UdHejEzyIcAazMMgj0b_TwkKGNxMnPNUtziQvZaIFOUebIF0jEIdGYugGyUJw_ACfPDE6nJg3SPHyvKurROA8Dwlvj6X4CKEndBhunS66XQTPdadN1pcL83TEZ5iewYjwtK-zVliOY4zNqD72mIMoEjZjE_HjSRtAwxYJl4FNsAi6O2C7_px7IuklmBGE5X?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/JTiGuHzzXpjGOLK9woRMif_1qHQ4T4Rfnv3zZtuxwScS1i5rCEeMZlpAXWHCTCs0JAbpi5VajH71rWMcm1bgB1LSsMqqHm5C75DkfkGT0lto6rwRjc3jA1rWwerRZK2BqqmsRKnLMeJ0NwvWAeKCP6FgPoszAdSmrbZ49DNh7j5VEnUcBEpOcVZY-4Xc7GYT?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/7b4VmSDvV3Siv4_hYWDYSn6dCOfSyXwnyX_mPWwqmWNFAofvMRGZ_HX1rcF27u6S4cDhzNqgaDReKKZ7Ml7IOv3uWz_PiQTlpWkbzjHQbIJIB_ZoH27juHhrARHZZk08UDltZ66rKqYtlBFiBoJ6KM_hJilHaBr5Xj3cwr7vC7dYkVzyRRuk53Gby7zAIA22?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/kVvhrPrpaJS9j8ej7m1QKisxO2yEJxS6yJinfSofFkodFgxXxdWLvdBeN8cTKPYDBROZaxqr6yV_p9D7OdJktskqtOo1pwZAsVgEqG1aRvg2TN57icJGWYoX7lwBqr1-gf7hKwpdujrePNl31H-80rr91FrlRLjf-MKQE4nLQIMSHgdUwMltjb6mMHkGBgNx?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/h4kY2t2bQa75uIPuz9r9VCv5_AGN8NIS60KnL7c-SfqHuCSiNREQf1oH9F1Lq8G8pg-lmarFJtKulqK5oAdpDpXJEgwDSjZU7uxXPnH6mlVnrFB2xxKpMolNAje49Fw31Oaovv5Y_iMZTJm0vT5pTjcemuFIlxfiMg8UQcjYVqnsB_cT3JyH_PWJzAPR5_kq?purpose=fullsize)

### Test Execution Details

![Image](https://images.openai.com/static-rsc-4/JTiGuHzzXpjGOLK9woRMif_1qHQ4T4Rfnv3zZtuxwScS1i5rCEeMZlpAXWHCTCs0JAbpi5VajH71rWMcm1bgB1LSsMqqHm5C75DkfkGT0lto6rwRjc3jA1rWwerRZK2BqqmsRKnLMeJ0NwvWAeKCP6FgPoszAdSmrbZ49DNh7j5VEnUcBEpOcVZY-4Xc7GYT?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/hJbLlXQzpuejUqae13H9m_ltGlHnAZXq0Sk9SN0-fZgp3ijbBsIxq67-G3P5ev4oMmfV2YH2sjU1L7tJNh6y7DQeWbHCB_2AAu68QZTznq_jWaDOByMXkj3SQrkCoGkg_5cGZDdoO7pyIKcIRHifmctZYBTx9Fy8t-6evfk6aeleOn2gVPUZ3JwR1IeCOpkv?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/nIWdFAN9BLRPjfGdXPvLinOEhYxeCcq8zcR3gfwEHAUIX7xadip7TZjfpEPbvC8-QGnYr9KekKOaOV5iEGuyyUmXjhFvxjna7JrcgpW7R9EQvP986DeIh4bNKHGEZBlTdIvrntMh9Ooc_sFZPG4bXyuhoNUUksFCdvSoRQtGRehX3OPmr4k7_aKJq00zwIBz?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/31t6QIYhfYErV68AjW-9SgISZWjPz6phtI3-uxJvKv3oXkIQrtmmLjCaiQdP5X7T_Jb-iROuHv4Pq_12Yz8WjwDsvKFG3LxN9pngK9x9LLsytAhWSfj6fhmJ04bHgV7Z5NQSHrgqjAfa8I6SjZXzt1VXhBtpdbu2uB82rjmSdsMbEUixFHMAxuthCy2DcRwt?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/9BDielSUloksIal7lsrAY_LKkc7nuFMAS9GWoqcskpHWMVT0RK5EQirVVjHftrh6gxKtqVyXo25QZFSk-5zp70qn35nLMF7lGuXcNeKxjwGcDqnKAkTzDoeOKDjBZxyBjWiQPdPfMSaQODDSb7PuOLfI6YeymErrX685nmlF_f8iaCLnIrTf_V8MbBVqY4MY?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/ZVWdudPxSI1PbUI1MM7XVQ-jwzBjwiGBzj8INjUD_hPbPE2QeA3ZuMdTSnoOOvuy4mm4988NmZTIL1C9CnxwArrAPfalPDMdn5MWrtf_Jhsp4bzqZC71TAZvVffx9uPGDWo3UWgH13BZEStX31rnLB_JisGTpyQMtwr7kGjUrY5hmxS-0F69i1Re23vbjhkD?purpose=fullsize)

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

