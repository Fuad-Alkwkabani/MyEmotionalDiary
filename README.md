Mi Diario - Aplicación de Consola en Java
Descripción
"Mi Diario" es una aplicación de consola desarrollada en Java que permite a los usuarios registrar, organizar y visualizar momentos vividos con una emoción asociada. Los usuarios pueden agregar, listar, eliminar y filtrar momentos por emoción o fecha, todo en un entorno simple de línea de comandos. El proyecto sigue los principios de buenas prácticas de programación, incluidas pruebas unitarias con una cobertura mínima del 70% y una estructura de código limpia y modular.
Funcionalidades
Añadir momento: Permite al usuario ingresar un momento con detalles como título, descripción, fecha y emoción.
Listar momentos: Muestra todos los momentos registrados.
Eliminar momento: Permite al usuario eliminar un momento usando su identificador.
Filtrar momentos: Filtra momentos por emoción o por fecha para una visualización más organizada.
Salir: Finaliza la aplicación.
Emociones Disponibles
Alegría
Tristeza
Ira
Asco
Miedo
Ansiedad
Envidia
Vergüenza
Aburrimiento
Nostalgia
Estructura del Proyecto
plaintext


mi-diario
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── model
│   │   │   │   └── Momento.java
│   │   │   ├── service
│   │   │   │   └── DiarioService.java
│   │   │   └── ui
│   │   │       └── ConsolaUI.java
│   ├── test
│   │   ├── java
│   │   │   ├── service
│   │   │   │   └── DiarioServiceTest.java
│   │   │   └── ui
│   │   │       └── ConsolaUITest.java
└── README.md
Requisitos
Java 11 o superior
Maven (opcional, para ejecutar pruebas y manejar dependencias)
Visual Studio Code con el soporte para Java configurado
Instalación y Ejecución
Clonar el repositorio:
bash
git clone https://github.com/usuario/mi-diario.git
cd mi-diario
Compilar el proyecto:
bash
javac -d out -sourcepath src src/main/java/ui/ConsolaUI.java
Ejecutar la aplicación:
bash
java -cp out ui.ConsolaUI
Ejecución de Pruebas
Las pruebas unitarias aseguran el correcto funcionamiento de DiarioService y ConsolaUI. Se utiliza JUnit y Mockito para la simulación de interacciones en ConsolaUI.
Para ejecutar todas las pruebas:
bash


mvn test
Ejemplo de Uso
markdown
My Diario:
1. Añadir momento
2. Ver todos los momentos disponibles
3. Eliminar un momento
4. Filtrar los momentos
5. Salir
Seleccione una opción: 1

Ingrese el título: Un día en el parque
Ingrese la fecha (dd/mm/yyyy): 01/05/2024
Ingrese la descripción: Fue un día muy especial.
Seleccione una emoción:
1. Alegría
2. Tristeza
3. Ira
4. Asco
5. Miedo
6. Ansiedad
7. Envidia
8. Vergüenza
9. Aburrimiento
10. Nostalgia
Ingrese su opción: 1
Momento vivido añadido correctamente.
Contribución
Realiza un fork del repositorio.
Crea una nueva rama con la funcionalidad:
git checkout -b feature/tu-funcionalidad.
Realiza los cambios y haz un commit: git commit -m "Añadir nueva funcionalidad".
Sube tus cambios: git push origin feature/tu-funcionalidad.
Crea un Pull Request para revisión.
