
# Spring Security JWT Authentication

This project is a Spring Boot-based backend that implements user authentication and authorization using **Spring Security** and **JWT (JSON Web Token)**. It provides endpoints for user registration, login, and secure access to protected APIs based on roles (`USER`, `ADMIN`, etc.).

---

## 📁 Project Structure

```
com.jsp.SpringSecurity
│
├── config
│   ├── JwtAuthenticationFilter       // Intercepts requests and validates JWT tokens
│   └── SecurityConfig                // Configures Spring Security and authentication manager
│
├── controller
│   ├── AuthenticationController      // Handles sign-up and sign-in requests
│   └── UserAdminController           // Secured controller for user/admin APIs
│
├── dto
│   ├── JwtAuthenticationResponse     // JWT response after login
│   ├── SignInRequest                 // Login payload
│   └── SignupRequest                 // Registration payload
│
├── entity
│   ├── Role                          // Enum for user roles (e.g., USER, ADMIN)
│   └── User                          // Entity representing user table
│
├── repository
│   └── UserRepository                // JPA repository for User entity
│
├── services
│   ├── AuthenticationService         // Handles sign-up and login logic
│   ├── JWTService                    // Handles token generation and validation
│   └── UserService                   // Additional user-related services
│
└── SpringSecurityApplication         // Main entry point
```

---

## 🚀 Features

* ✅ User Registration
* ✅ User Login with JWT generation
* ✅ JWT-based request authentication and authorization
* ✅ Role-based API access
* ✅ Custom filter for JWT validation
* ✅ Secure password hashing with BCrypt

---

## 🛠 Technologies Used

* Java 21+
* Spring Boot
* Spring Security
* Spring Data JPA
* JWT (via `jjwt` library)
* MySQL (you can switch as needed)

---

## 🔐 Authentication Flow

1. **User signs up** with email and password.
2. **User logs in**, and a JWT is returned.
3. The **JWT is attached** to all future requests in the `Authorization` header.
4. The custom `JwtAuthenticationFilter` validates the token.
5. Access is granted based on the user’s role.

---

## 🧪 API Endpoints

### Auth

* `POST /api/auth/signup` – Register a new user
* `POST /api/auth/signin` – Authenticate user and return JWT

### Secured

* `GET /api/user/data` – Accessible to `ROLE_USER`
* `GET /api/admin/data` – Accessible to `ROLE_ADMIN`

---

## ⚙️ Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/<your-username>/SpringSecurity.git
cd SpringSecurity
```

### 2. Run the application

```bash
./mvnw spring-boot:run
```

Or import it into your IDE and run `SpringSecurityApplication.java`.

---

## 🔐 Example JWT Usage

Use this header in Postman or frontend app:

```
Authorization: Bearer <your_jwt_token_here>
```

Let me know if you want to include **Swagger documentation**, **Docker support**, or a **Postman collection** as well!
