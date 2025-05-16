# 🌌 Star Wars App

Una aplicación interactiva en Java que permite consultar las películas del universo de **Star Wars** mediante una API REST, deserializar los datos con GSON y guardarlos en archivos `.json` de forma organizada y formateada.

---

## 🚀 ¿Qué hace esta aplicación?

- ✅ Conecta con la API pública de Star Wars: [SWAPI](https://swapi.py4e.com/api/films/)
- ✅ Permite al usuario elegir una película entre los 6 episodios disponibles.
- ✅ Deserializa el JSON recibido en un objeto Java con GSON.
- ✅ Muestra en consola los datos clave: título, episodio, director y fecha de estreno (formato latino).
- ✅ Guarda la película en un archivo `.json` formateado con `setPrettyPrinting`.
- ✅ Repite la consulta si el usuario desea continuar, validando la entrada de forma amigable.

---

## 🛠️ Tecnologías utilizadas

| Herramienta            | Uso principal                                |
|------------------------|-----------------------------------------------|
| `Java 17+`             | Lenguaje de programación                      |
| `java.net.http`        | Consumo de API REST con `HttpClient`          |
| `GSON` (Google)        | Deserialización de JSON y escritura de archivos |
| `Records`              | Modelado de datos inmutables (`Film`)         |
| `DateTimeFormatter`    | Conversión de fecha a formato `dd/MM/yyyy`     |
| `Scanner`              | Entrada del usuario por consola               |

---

## 📂 Estructura del proyecto

![image](https://github.com/user-attachments/assets/28ae0dd6-266b-49d6-a639-c7f59ecab3cf)

  
---

## 🧪 Ejecución del proyecto

1. Clona el repositorio o copia los archivos fuente.
2. Asegúrate de tener GSON en tu classpath (`gson-2.13.1.jar`).
3. Ejecuta `Principal.java` desde tu IDE o línea de comandos.
4. Ingresa un número del 1 al 6 para consultar una película.
5. El archivo `peliculaN.json` será generado con los datos de la película.

---

## 🧠 Lecciones aprendidas

- Uso de `HttpClient` para conectarse a servicios REST modernos.
- Serialización y deserialización con GSON (`GsonBuilder`, `setPrettyPrinting`).
- Creación de `records` para modelar objetos inmutables.
- Manejo de fechas en Java usando `LocalDate` y `DateTimeFormatter`.
- Control de flujo con `while`, validación de entradas y salidas amigables para el usuario.

---

## 📸 Ejemplo de uso

![image](https://github.com/user-attachments/assets/c5b283de-66f2-4f9c-ba03-055e7bc5fc99)
![image](https://github.com/user-attachments/assets/9f154471-c438-4c0a-a38f-fd92f3a35118)
![image](https://github.com/user-attachments/assets/0381a3e6-c339-4ad3-8e8e-c3de18b775c3)


---

## 🤖 Autor

Desarrollado por **Gustavo Rios**  
📧 Contacto: tavitoo03@gmail.com

---

## 🎓 Certificación

Este proyecto fue desarrollado como parte del programa **Oracle Next Education G8**, en colaboración con **Alura Latam**. A continuación, se presenta el certificado obtenido:

![Certificado del curso](https://github.com/user-attachments/assets/c91a6205-9bb1-412a-85c3-ed2ee3a34bb0)

---

## ⭐ ¿Te gustó este proyecto?

Si te fue útil o te ayudó a aprender, ¡déjale una estrella ⭐ y compártelo con otros padawans!

---

