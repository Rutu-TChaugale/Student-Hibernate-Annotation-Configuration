Student Management System – Hibernate (Annotation-Based) CRUD
📌 Overview
This project is a CRUD (Create, Read, Update, Delete) application built using Hibernate with annotation-based configuration. It manages student records in a database using Hibernate ORM. The goal is to demonstrate how to integrate Hibernate with a relational database while following best practices.

🛠️ Technologies Used
Java 21
Hibernate (Annotation-Based Configuration)
MySQL (or any relational DB)
JPA Annotations


📂 Project Structure
/src/main/java/com/example/student  
    ├── client        # Main application to test CRUD operations  
    ├── model         # Student entity with Hibernate annotations  
/resources/hibernate.cfg.xml  # Hibernate configuration file  
pom.xml              # Maven dependencies  
README.md            # Project documentation  
🚀 Features
✅ Add new students to the database
✅ Fetch all student records from the database
✅ Update student details seamlessly
✅ Delete student records without hassle
✅ Uses Hibernate annotations instead of XML configuration


📖 Hibernate Annotations Used
@Entity → Marks the class as a Hibernate entity

@Table(name = "students") → Defines the database table name

@Id → Primary key

@GeneratedValue(strategy = GenerationType.IDENTITY) → Auto-incrementing ID

@Column(name = "name") → Maps class fields to database columns


🔧 Setup & Installation
Step 1: Clone the Repository

git clone https://github.com/yourusername/student-hibernate-crud.git  
cd student-hibernate-crud  
Step 2: Configure Database
Update hibernate.cfg.xml with your DB credentials (MySQL/PostgreSQL).

Ensure the database exists before running the application.


Step 3: Run the Project
Compile and run using Maven:

mvn clean install  
java -jar target/student-hibernate-crud.jar  
📌 Example Code – Student Entity
java
Copy
Edit
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    // Getters and Setters
}
🚀 Happy Coding! Keep learning, keep building! 🎯
