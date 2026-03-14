
<div align="center">
<img src="Banner.png" width="280" alt="Hotel System Banner" />

<br/>

# 🏨 Ultimate Hotel Management System

### *A fully object-oriented hotel reservation academic engine built in Java*

<br/>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Status](https://img.shields.io/badge/Status-In%20Progress-orange?style=for-the-badge)

<br/>

*Built from scratch — no libraries, no shortcuts.*

<br/>

[🐛 Report Bug](https://github.com/SimonAlvarez845/POO-Taller/issues)
·
[✨ Request Feature](https://github.com/SimonAlvarez845/POO-Taller/issues)
·
[📖 Documentation](https://github.com/SimonAlvarez845/POO-Taller)

</div>

---

## 📋 Table of Contents

- [📖 About the Project](#-about-the-project)
- [✨ Features](#-features)
- [🏗️ Project Structure](#️-project-structure)
- [⚠️ Exception Handling](#️-exception-handling)
- [🗺️ Roadmap](#️-roadmap)
- [❓ FAQ](#-faq)

---

## 📖 About the Project

> A modular hotel management system built in Java using core **Object-Oriented Programming** principles and **UML-driven design**.

This system simulates real hotel operations — The goal being not only to make something that works, but to practice **thinking in objects** — modeling guests, rooms and reservations as independent components that interact with each other. Some design decisions being intentional:


- 🧠 **Raw arrays** instead of `ArrayList` — to deeply understand how dynamic structures work internally
- 🛡️ **Custom exceptions** — to model real business logic errors, not just technical crashes
- 📅 **String-based dates** — to focus on architecture first, before introducing `java.time`

This is a learning project built with curiosity, friendship, and the a share passion to grow as programmers.

Although this started as a learning exercise, the project attempts to maintain **clean structure, modular code, and readable design**.
---

## ✨ Features

| 🔧 Feature | 📝 Description | ✅ Status |
|---|---|---|
| 👤 Guest Management | Register, search guests by ID | Done |
| 🛏️ Room Management | Add, find and remove rooms | Done |
| 📅 Reservation System | Book rooms with date ranges | Done |
| 🔎 Availability Engine | Detects conflicting reservations | Done |
| 🗓️ Date Validator | Validates format and logical order | Done |
| 🛡️ Custom Exceptions | Meaningful errors for every failure case | Done |

---

## 🏗️ V1.0 Project Structure
```
POO-Taller/
│
├── 📁 HotelSystem/
│   ├── 🏨 Hotel.java             ← core system, manages all entities
│   ├── 👤 Guest.java             ← guest model
│   ├── 🛏️  Room.java              ← room model + availability logic
│   ├── 📅 Reservation.java       ← reservation model + conflict detection
│   ├── 🗓️  Date_Utils.java        ← date validation utilities
│   │
│   ├── 📁 exceptions/
│   │   ├── InvalidDateException.java
│   │   ├── RoomUnavailableException.java
│   │   ├── GuestNotFoundException.java
│   │   └── RoomNotFoundException.java
│   │
│   └── 🧪 Main.java              ← test entry point
│
├── 📄 README.md
└── 📄 .gitignore
```

---

## ⚠️ Exception Handling

The system uses **4 custom exceptions** that represent real business logic failures:

| Exception | When it triggers |
|---|---|
| `InvalidDateException` | Date has wrong format or check-in is after check-out |
| `RoomUnavailableException` | Room already booked for those dates |
| `GuestNotFoundException` | No guest found with that ID |
| `RoomNotFoundException` | No room found with that number |

> 💡 Every exception extends `Java.Exception` and carries a descriptive message — making bugs easy to trace.

---

## 🗺️ Roadmap

**Done ✅**
- [x] Guest manager
- [x] Room manager
- [x] Reservation system
- [x] Availability engine
- [x] Date validator
- [x] Custom exceptions

**Coming up 🚧**
- [ ] Replace arrays with `ArrayList<T>`
- [ ] Add new interfaces for polymorphism
- [ ] Improve error reporting
- [ ] Database integration
- [ ] Load pricing system
- [ ] Admin dashboard
- [ ] REST API

---

## ❓ FAQ

<details>
<summary><b>Why not use ArrayList?</b></summary>
<br/>
The project intentionally uses raw arrays to understand how dynamic structures work internally. Implementing <code>resize()</code> manually teaches what ArrayList does under the hood. Future versions will migrate.
</details>

<details>
<summary><b>Why use custom exceptions?</b></summary>
<br/>
Custom exceptions represent business logic errors, not just crashes. <code>GuestNotFoundException</code> is far more useful than a generic <code>NullPointerException</code> when debugging.
</details>

<details>
<summary><b>Why is Date stored as String?</b></summary>
<br/>
To keep the focus on architecture and OOP design early on. Later versions will use <code>LocalDate</code> from <code>java.time</code> for proper date arithmetic.
</details>

---

<div align="center">

<br/>

*Built with ☕ and way too many compile errors*

<br/>

**[@SimonAlvarez845](https://github.com/SimonAlvarez845)**

</div>
