# MIS Technical Portfolio | Java Applications in Business
**Author:** Mario Jones II  
**Institution:** Prairie View A&M University  
**Major:** Management Information Systems (MIS)

---

## Homework #2: Algorithmic Decision-Making & Resource Optimization
### Project Overview
This project consists of two distinct Java applications designed to solve resource optimization problems through algorithmic logic and user-defined inputs.

### Key Features
* **Cost-Benefit Analysis:** Developed a decision-engine for "Monica’s Present" to determine the most cost-effective purchasing method (Online vs. In-Store) based on shipping, handling, and logistics costs.
* **Logistics Calculation:** Engineered a fuel-cost calculator for "Sharon’s Round Trip," accounting for total distance (360 miles), vehicle fuel efficiency (MPG), and fluctuating gas prices.
* **Technical Implementation:** Utilized `java.util.Scanner` for dynamic data entry and implemented conditional `if-else` branching to automate business-centric decisions.

---

## Lab #2Bis: Foundations of Object-Oriented Programming (OOP)
### Project Overview
This lab marks the transition from procedural scripting to **Object-Oriented Programming (OOP)** by separating business logic from execution using a blueprint class and a driver class.

### Key Features
* **Class Architecture:** Developed a modular `Employee` class to encapsulate core business attributes, including hourly rates and labor hours.
* **Encapsulated Business Logic:** Created dedicated methods for calculating Gross Salary, Net Salary, and a flat **1.5% tax deduction** as per regional compliance standards.
* **Modular Testing:** Implemented an `EmployeeTester` class to instantiate objects and validate the integrity of the payroll logic across multiple test cases.

---

## Lab #4: Advanced Business Logic & Data Validation
### Project Overview
An advanced payroll application demonstrating the ability to program complex, tiered business rules into a functional system with a focus on data validation and financial accuracy.

### Key Features
* **Business Rule Implementation:** Programmed a "Minimum Pay" rule ensuring all employees are compensated for at least **40 hours**, regardless of actual time worked, to model union or contract-based labor standards.
* **Tiered Tax Brackets:** Engineered a dynamic tax engine that shifts between **1.5% and 1.61%** based on an employee's gross salary threshold ($1,000).
* **Financial Precision:** Utilized `printf` formatting to ensure professional financial output, displaying currency values to exactly two decimal places for audit-ready reporting.

---

# 🎂 Automated Retail Pricing & Rebate System
**Individual Term Project | MISY 3343: Java Applications in Business** **Developer:** Mario Jones II  
**Major:** Management Information Systems (MIS)  
**Institution:** Prairie View A&M University  

---

## 📌 Project Overview
This project involved the end-to-end design and implementation of an automated billing system for a retail bakery. [cite_start]The goal was to develop a tool that optimizes product packaging and applies tiered pricing and high-volume rebates based on specific business rules. [cite: 632-634]

## 🛠️ Technical Implementation
[cite_start]The project was executed in two phases to ensure alignment with professional software development life cycles (SDLC): [cite: 622]

### [cite_start]Phase 1: Systems Analysis & Design [cite: 624]
* [cite_start]**Logic Mapping:** Created a comprehensive logic flowchart using Lucidchart to visualize the decision-making process for packet distribution and rebate eligibility. [cite: 641]
* [cite_start]**Algorithmic Planning:** Utilized **Integer Division** and **Modulus Operators** to accurately calculate the breakdown of 100-count packets, 25-count packets, and single units. [cite: 643]

### [cite_start]Phase 2: Java Development [cite: 625]
* [cite_start]**Tiered Pricing Engine:** Programmed a dynamic cost calculator that shifts prices based on packet size ($1.10, $1.25, or $1.50 per unit). [cite: 635-638]
* [cite_start]**Conditional Rebate Logic:** Implemented a selection control structure (if-statement) to automatically apply a **$2.00 rebate** per 100-count packet for orders exceeding 400 units. [cite: 639]
* [cite_start]**Input Handling:** Integrated `java.util.Scanner` for real-time user data entry and interaction. [cite: 641]

## 🚀 Business Rules Applied
| Purchase Type | Unit Price | Packet Requirement |
| :--- | :--- | :--- |
| **Bulk Packet** | $1.10 / unit | 100 Cakes |
| **Standard Packet** | $1.25 / unit | 25 Cakes |
| **Single Unit** | $1.50 / unit | 1 - 24 Cakes |
| **High-Volume Rebate** | -$2.00 / packet | > 400 Total Cakes |

## 📐 Key Skills Demonstrated
* **Object-Oriented Logic:** Separating data input from mathematical processes.
* [cite_start]**Financial Accuracy:** Using `printf` formatting to ensure all outputs meet professional currency standards ($0.00). [cite: 631]
* [cite_start]**Documentation:** Providing clear code comments and following standard naming conventions for industry readability. [cite: 631]

---

## 📂 Project Structure
* `CakeCalculator.java`: The core application containing the driver and logic.
* `Analysis_Design.pdf`: The structural flowchart and business rule breakdown.

---

## Tech Stack
* **Language:** Java
* **IDE:** Eclipse
* **Concepts:** Object-Oriented Programming, Data Validation, Algorithmic Logic, Business Process Automation
