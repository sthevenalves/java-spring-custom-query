<h1>Custom Query</h1>

 ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
 ![Spring](https://img.shields.io/badge/Spring-6DB33F.svg?style=for-the-badge&logo=Spring&logoColor=white)
 [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

<p>This project is a custom query build using Java, Spring Boot, H2 as the database. Aims to practice and share how you can build query methods using Java Spring.<p>

<h2>Table of Contents</h2>
<ul>
  <li>Installation</li>
  <li>Usage
  <li>API Endpoints</li>
  <li>Database</li>
</ul>
<h2>Installation</h2>
<p>
  <ol>
    <li>Clone the repository:</li>
    
    git clone https://github.com/sthevenalves/java-spring-custom-query.git
    
   <li>Install dependencies with Maven</li>
  </ol>
</p>
<h2>Usage</h2>
<p>
  <ol>
    <li>Start the application with Maven</li>
    <li>The API will be accessible at http://localhost:8080/</li>
  </ol>
</p>
  <h2>API Endpoints</h2>

    GET /users - Retrieve a list of all users

    GET /users/ page - Retrieve a page of all users.

    GET /users/ search-salary - Retrieve users by salary

    GET /users/ search-name - Retrieve users by name

<h2>Database</h2>
<p>The project utilizes H2 Database as the database.</p>
    