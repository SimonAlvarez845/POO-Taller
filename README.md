# POO-Taller
Repositorio académico para nuestro primer taller universitario de POO ft Java.

<div align="center">
  <img src="assets/banner.png" width="300" height="300" alt="Hotel System Banner" />

  <h1>Hotel Management System</h1>

  <p>A modular hotel management system built in Java using core Object-Oriented Programming principles and UML-driven design.</p>

  <a href="https://github.com/SimonAlvarez845/Project-POO-Java/issues">Report Bug</a>
  ·
  <a href="https://github.com/SimonAlvarez845/Project-POO-Java/issues">Request Feature</a>
</div>

---

## Table of Contents

- [About the Project](#about-the-project)
- [Features](#features)
- [Roadmap](#roadmap)
- [FAQ](#faq)

---

## About the Project

This system simulates hotel operations through clean OOP design. It handles guest registration, room management, and reservation booking with custom exception handling and date validation — all built without external libraries, using raw arrays to understand how dynamic structures work internally.

---

## Features

| Feature | Status |
|---|---|
| Guest management | ✅ Done |
| Room management | ✅ Done |
| Reservation system | ✅ Done |
| Availability engine | ✅ Done |
| Date validator | ✅ Done |
| Custom exceptions | ✅ Done |

---

## Roadmap

- [x] Guest manager
- [x] Room manager
- [x] Reservation system
- [x] Availability engine
- [x] Date validator
- [ ] Replace arrays with `ArrayList`
- [ ] Add interfaces
- [ ] Improve error reporting
- [ ] Database integration
- [ ] Load pricing system
- [ ] Admin dashboard
- [ ] REST API

---

## FAQ

**Why not use ArrayList?**  
The project intentionally uses raw arrays to understand how dynamic structures work internally. Future versions may migrate to `ArrayList`.

**Why use custom exceptions?**  
Custom exceptions make the system easier to debug and maintain. They represent business logic errors, not just technical ones.

**Why is Date stored as String?**  
To simplify early validation and focus on architecture. Later versions will use `LocalDate` from `java.time`.

---

<div align="center">
  <sub>Built by <a href="https://github.com/SimonAlvarez845">@Simon</a></sub>
</div>
