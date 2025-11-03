<<<<<<< HEAD
Grievance Grabber - Backend scaffold (Java Spring Boot)
=======================================================

What's included:
- config-server
- discovery-server (Eureka)
- api-gateway (Spring Cloud Gateway)
- user-service (MySQL)
- grievance-service (MySQL)
- bookmark-service (MySQL)

Notes:
1. This scaffold focuses on a runnable backend structure. It intentionally provides minimal implementations:
   - Basic CRUD controllers for grievance and bookmark services
   - Simple user registration/login skeleton (no password hashing; for production, please secure properly)
   - No full JWT propagation implemented; there are placeholders/comments where JWT should be added.
2. Before running, create three MySQL databases:
   - grievance_user_db
   - grievance_db
   - bookmark_db
   Example (MySQL):
     CREATE DATABASE grievance_user_db;
     CREATE DATABASE grievance_db;
     CREATE DATABASE bookmark_db;
3. Update MySQL username/password in each service's application.yml if needed (currently uses root / password).
4. Import each project into Spring Tool Suite as separate Maven projects and run them in this order:
   - discovery-server (port 8761)
   - config-server (port 8888)
   - api-gateway (port 8080)
   - user-service (port 8081)
   - grievance-service (port 8082)
   - bookmark-service (port 8083)
5. Each service uses Spring Boot 3.x and Spring Cloud 2023.x compatible dependencies, but you may need to adjust versions to match your environment.

This scaffold is meant as a starting point. If you want, I can:
- Implement JWT authentication end-to-end.
- Add Docker Compose to start MySQL + services.
- Wire Config Server to read from a git repo.
- Add sample data and Postman collection.

=======
# grievance-grabber-backend
Backend application which handles grievances and employees will resolve that
>>>>>>> 2c243ad6338a66c516b7cfca2d42c1496c876b60
