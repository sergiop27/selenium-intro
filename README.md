# 🧪 Curso Introductorio de Testing con Selenium + Java

¡Bienvenido al repositorio oficial del **Curso Introductorio de Testing Automatizado**!  

Aquí aprenderás paso a paso cómo construir un **framework de pruebas desde cero**, comenzando con un **primer test funcional** y evolucionando el proyecto con **buenas prácticas**, **patrones de diseño** y **reportes profesionales**.

En esta **primera etapa** encontrarás un **script sencillo de prueba** que nos servirá como base inicial.  
En los **próximos commits**, verás cómo **evoluciona el proyecto** y también este **README**, que irá incorporando explicaciones más avanzadas a medida que progresamos.

---

## 🚀 ¿Qué contiene este proyecto?
- **Lenguaje:** Java 24  
- **Framework de pruebas:** JUnit 4  
- **Automatización:** Selenium WebDriver  
- **Primer caso:** Login exitoso en [SauceDemo](https://www.saucedemo.com/v1/index.html)

---

## 📂 Estructura del proyecto
selenium-intro/
├── src/test/java/LoginTest.java # Primer test básico
├── pom.xml # Configuración Maven
├── .gitignore # Ignora archivos innecesarios
└── README.md # Bienvenida y guía del curso

---

## 🏁 Primer objetivo
- Comprender cómo iniciar un proyecto Maven.  
- Escribir y ejecutar un test básico con Selenium.  
- Aprender el flujo fundamental: **setup → acción → aserción → teardown**.  

---

## ▶️ ¿Cómo ejecutar?
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/TU_USUARIO/selenium-intro.git

2. Navegar al proyecto:
   ```bash
   cd selenium-intro

3. Ejecutar los tests:
   ```bash
   mvn test

---

📌 Próximos pasos
Integrar el Page Object Model (POM).

Añadir reportes automáticos (Allure).

Incorporar pruebas de API con Rest Assured.

Preparar el proyecto para ejecución en pipelines CI/CD.

✨ Autor
Ing. Sergio Pace
QA Automation Technical Lead & Instructor

Nota: Este repositorio está diseñado para fines educativos como parte del Curso Introductorio de Testing Automatizado. Cada commit documenta la evolución del proyecto para que puedas seguir su crecimiento desde un simple script hasta un framework profesional.