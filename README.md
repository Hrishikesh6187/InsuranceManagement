
🛡️ Insurance Management System

A Java-based Insurance Management System designed to digitize and streamline vehicle insurance operations using a relational database. The system enables insurance companies, agents, and customers to efficiently manage policies, vehicles, accidents, and nominee information through a secure, database-driven application.

⸻

📌 Overview

Managing insurance records manually is time-consuming and error-prone, especially in document-heavy domains like vehicle insurance. This project replaces traditional paper-based workflows with a database-backed software system that improves operational efficiency, data accuracy, and accessibility.

The application supports:
	•	Customer, agent, and company authentication
	•	Policy management and renewals
	•	Vehicle and accident tracking
	•	Nominee and customer record management

⸻

🎯 Key Features

👤 Customer
	•	Secure login using customer ID and date of birth
	•	View personal details, policy information, vehicle details, accidents, and nominees
	•	Renew insurance policies

🧑‍💼 Agent
	•	View assigned customers and their policies
	•	Access customer insurance details

🏢 Insurance Company (Admin)
	•	Manage customers, agents, policies, vehicles, and accidents
	•	Insert, update, and delete customer records
	•	View aggregated data such as number of agents per branch

⸻

🛠️ Tech Stack
	•	Programming Language: Java
	•	Database: MySQL
	•	Database Connectivity: JDBC
	•	Development Environment: Apache NetBeans / jGRASP
	•	Architecture: Client–Database (Java GUI + MySQL backend)

⸻

🗄️ Database Design

The system is built on a relational database with entities including:
	•	Customer
	•	Agent
	•	Insurance Company
	•	Policy
	•	Vehicle
	•	Accident
	•	Nominee
	•	Contact & Hires (relationship tables)

The design ensures:
	•	Data normalization
	•	Referential integrity using foreign keys
	•	Efficient querying for real-world insurance workflows

⸻

⚙️ Implementation Highlights
	•	Designed and implemented a normalized relational schema for insurance operations
	•	Wrote comprehensive SQL DDL and DML queries to create, populate, and manage the database
	•	Integrated Java frontend with MySQL using JDBC
	•	Implemented role-based views for customers, agents, and administrators
	•	Built features for policy renewal, customer insertion/deletion, and accident tracking

⸻

🚀 How to Run the Project
	1.	Clone the repository:

git clone https://github.com/your-username/insurance-management-system.git



Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/hhh_insurance",
    "root",
    "your_password"
);




⸻

📷 Screenshots

Screenshots of the application UI are available in the Appendix section of the project and include:
	•	Login screens (Customer / Agent)
	•	Customer dashboard
	•	Vehicle and nominee details
	•	Policy renewal interface
	•	Admin views


⸻

⚠️ Limitations
	•	Customers cannot view agent details
	•	Agents are restricted to already assigned customers
	•	No real-time policy status updates

⸻

🔮 Future Enhancements
	•	Allow customers to view agent profiles
	•	Enable agents to reach potential customers
	•	Add real-time policy status tracking
	•	Improve authentication and security mechanisms

⸻

👨‍💻 Contributors
	•	Hrishikesh Prahalad
	•	H Srujan Kumar
	•	Hemanth Pai

⸻

📄 License

This project was developed as part of an academic requirement for the Bachelor of Engineering in Information Science and Engineering.

