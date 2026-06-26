# Online Examination System

A console-based **Online Examination System** application developed in Java as part of the **Oasis Infobyte (OIBSIP)** internship. This system simulates a real-world online exam interface directly in the command line interface, incorporating features like user login, profile security (password updates), time-bound testing (60-second timer), auto-submission, and grading.

---

## 🚀 Features

- **Secure Login System**: Restricts access to authorized users with predefined credentials.
- **Update Password**: Users can update their password at any time by verifying their current password.
- **Timed MCQ Examination**: 
  - Includes multiple-choice questions with multiple options.
  - Features a **60-second time limit** tracked in real-time.
  - Auto-submits the exam when the timer expires.
- **Real-time Scoring**: Automatically calculates and displays the results upon exam completion (number of correct answers, wrong answers, and final percentage/score).
- **Graceful Logout**: Properly closes the user session and terminates the program safely.

---

## 🛠️ Tech Stack & Requirements

- **Language**: Java (JDK 8 or higher recommended)
- **Terminal/Command Prompt**: To run the interactive CLI menu

---

## 📂 Project Structure

```
OIBSIP-TASK4/
│
├── OnlineExamination.java     # Main Java source code containing system logic
├── OnlineExamination.class    # Compiled bytecode
└── README.md                  # Project documentation
```

---

## 🚀 How to Run the Application

Follow these steps to run the project locally on your machine:

### 1. Prerequisites
Ensure you have the Java Development Kit (JDK) installed and configured in your system environment variables. You can verify this by running:
```bash
java -version
```

### 2. Clone the Repository
```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

### 3. Compile the Code
Compile the Java source file:
```bash
javac OnlineExamination.java
```

### 4. Run the Application
Execute the compiled class file:
```bash
java OnlineExamination
```

---

## 🔑 Default Credentials

To log into the system for the first time, use the following credentials:
- **Username**: `admin`
- **Password**: `1234`

---

## 🖥️ Screen Previews & Application Flow

### 1. Login
```text
===== ONLINE EXAMINATION SYSTEM =====
Username : admin
Password : 1234
```

### 2. Main Menu
```text
===== MENU =====
1. Update Password
2. Start Exam
3. Logout
Enter Choice : 
```

### 3. Exam Terminal (with Timer)
```text
Exam Started
Time Limit : 60 Seconds

1. Java is a ?
A. Programming Language
B. Database
C. OS
D. Browser
Answer : A
```

### 4. Results Generation
```text
===== RESULT =====
Total Questions : 3
Correct Answers : 3
Wrong Answers : 0
Score : 3/3
```

