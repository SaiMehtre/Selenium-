# Coursera Automation with Selenium & TestNG

This repository contains an automated test framework built using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven** to perform end-to-end testing on the [Coursera](https://www.coursera.org/) learning platform.

The project demonstrates how to:

- Automate browser actions like navigating, searching, and logging in.
- Use **TestNG** annotations for managing test execution flow.
- Parameterize browser selection for potential cross-browser testing.
- Handle web elements using **XPath locators**.
- Structure and manage dependencies using **Maven**.

This is a beginner-to-intermediate level automation setup, ideal for learning **web UI automation**, **Maven project structure**, and **TestNG integration** with Selenium.

---

---

## Features

- Launches Coursera website using Chrome browser.
- Searches for a course using the search bar.
- Simulates a login using dummy credentials.
- Supports browser parameterization via TestNG (currently only Chrome implemented).
- Uses Maven for dependency management.
- Organized with TestNG test cases.

---

## Requirements

- Java JDK 8 or higher
- Maven
- Chrome browser installed
- ChromeDriver (path specified in the code)

---

## Dependencies

All dependencies are managed via `pom.xml`. Main ones include:

- **Selenium Java** - UI Automation
- **TestNG** - Test execution framework
- **JUnit** - Legacy support
- **ChromeDriver** - Required for launching Chrome browser

Install via Maven:
```bash
mvn clean install
