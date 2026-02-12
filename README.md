# 🧮 Java Web Calculator (In-Memory Edition)

A lightweight, robust Java Web Application built to perform essential arithmetic operations with instant persistence. This project was designed to demonstrate efficient backend logic and the seamless integration of in-memory databases.

---

## 🚀 Project Link
**View Repository/Live App:** [https://java-calculator-1-8e9a.onrender.com]

---

## ✨ Features
* **Basic Arithmetic:** Supports Addition, Subtraction, Multiplication, and Division.
* **Persistent History:** Saves your recent calculations using an H2 database.
* **In-Memory Storage:** Fast, volatile data storage that resets on server restart—perfect for temporary session tracking.
* **Web-Based UI:** Accessible via any modern web browser.

---

## 🛠️ Technical Stack
* **Language:** Java 17+
* **Framework:** Spring Boot / Java EE (Select one)
* **Build Tool:** Maven
* **Database:** H2 (In-Memory)
* **Frontend:** HTML/CSS/JavaScript

---

## 💾 Database Configuration
This app uses an **H2 In-Memory Database**. 
Unlike traditional databases, H2 lives in your system's RAM. This means:
1. No external installation is required.
2. Data is saved as long as the application is running.
3. Access the database console while running at: `http://localhost:8080/h2-console`

**Credentials (Default):**
* **JDBC URL:** `jdbc:h2:mem:calculator_db`
* **Username:** `sa`
* **Password:** `password`

---

