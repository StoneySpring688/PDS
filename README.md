# LearningApp_2025
### Aplicación de aprendizaje interactivo basada en Java

---

> [!IMPORTANT]
> ### Requisitos:
> - [Java 17 o posterior](https://www.oracle.com/java/technologies/downloads/)
> - [Maven](https://maven.apache.org/download.cgi)

## 📋 Descripción del proyecto
**LearningApp** es una aplicación de aprendizaje inspirada en plataformas como **Duolingo** y **Mochi**, diseñada como una aplicación de escritorio en **Java**. Su propósito es permitir a los usuarios aprender y repasar conceptos en diversos dominios mediante ejercicios interactivos.

La aplicación permite la creación y personalización de cursos, eligiendo diferentes estrategias de aprendizaje, incluyendo metodologías como **repetición espaciada** y estudio aleatorio. Además, los usuarios pueden compartir cursos con otros y realizar seguimiento de su progreso.

## 🚀 Funcionalidades principales
- **Diversos tipos de preguntas**: Soporte para preguntas de tipo test, completar huecos, traducciones y tarjetas de estudio (*flashcards*).
- **Estrategias de aprendizaje**: Secuencial, aleatoria o repetición espaciada.
- **Continuidad del aprendizaje**: Guardado y reanudación del estado del curso.
- **Seguimiento del progreso**: Registro de estadísticas de tiempo de estudio, racha de días consecutivos y avance por curso.
- **Creación y compartición de cursos**: Posibilidad de crear y compartir cursos a través de archivos en formato JSON/YAML.

## 💻 Arquitectura de la aplicación
La aplicación sigue una estructura modular basada en tres capas:
1. **Interfaz**: Construida con **Java Swing**.
2. **Lógica de Negocio**: Maneja las reglas y mecánicas del aprendizaje.
3. **Persistencia de Datos**: Implementada con **JPA** y almacenamiento de cursos en **JSON/YAML**.

## 🛠️ Tecnologías y Librerías
- **Java**: Lenguaje principal para la lógica y la interfaz.
- **Java Swing**: Para el diseño de interfaces de usuario.
- **Maven**: Para la gestión de dependencias y construcción del proyecto.
- **JPA**: Para la persistencia de datos.

## 🧩 Instalación
**Clonar el repositorio**:
```bash
git clone https://github.com/tu-repositorio/LearningApp_2025.git
cd LearningApp_2025
```

## 🔧 Construcción
1. Asegúrate de tener **Maven** instalado.
2. Descomprime el archivo si lo descargaste como un **.zip**.
3. Ejecuta los siguientes comandos dentro del directorio del proyecto:
```bash
mvn clean install
```

## ▶️ Ejecutar la aplicación
```bash
java -jar target/LearningApp.jar
```

## 📖 Documentación
La documentación del proyecto incluye:
- Modelado de requisitos y diagramas de clases.
- Manual de usuario.
- Explicaciones de diseño y patrones utilizados.

Consulta el archivo `LearningApp-Documentacion.pdf` para más detalles técnicos.

## 🏆 Créditos
Este proyecto ha sido desarrollado como parte del curso de **Prácticas de Desarrollo de Software** en la Universidad de Murcia (Curso 2025).

### 👥 Equipo de Desarrollo


