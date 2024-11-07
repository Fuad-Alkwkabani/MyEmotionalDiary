# Mi Diario - Aplicación de Consola en Java
# Descripción
"Mi Diario" es una aplicación de consola desarrollada en Java que permite a los usuarios registrar, organizar y visualizar momentos vividos con una emoción asociada. Los usuarios pueden agregar, listar, eliminar y filtrar momentos por emoción o fecha, todo en un entorno simple de línea de comandos. El proyecto sigue los principios de buenas prácticas de programación, incluidas pruebas unitarias con una cobertura mínima del 70% y una estructura de código limpia y modular.
# Funcionalidades
<ul>
    <li><strong>Añadir momento</strong>: Permite al usuario ingresar un momento con detalles como título, descripción, fecha y emoción.</li>
    <li><strong>Listar momentos</strong>: Muestra todos los momentos registrados.</li>
    <li><strong>Eliminar momento</strong>: Permite al usuario eliminar un momento usando su identificador.</li>
    <li><strong>Filtrar momentos</strong>: Filtra momentos por emoción o por fecha para una visualización más organizada.</li>
    <li><strong>Salir</strong>: Finaliza la aplicación.</li>
</ul>

# Emociones Disponibles
<ol>
    <li>Alegría</li>
    <li>Tristeza</li>
    <li>Ira</li>
    <li>Asco</li>
    <li>Miedo</li>
    <li>Ansiedad</li>
    <li>Envidia</li>
    <li>Vergüenza</li>
    <li>Aburrimiento</li>
    <li>Nostalgia</li>
</ol>

# Estructura del Proyecto
<pre>

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
</pre>



# Requisitos
<ul>
    <li>Java 11 o superior</li>
    <li>Maven (opcional, para ejecutar pruebas y manejar dependencias)</li>
    <li>Visual Studio Code con el soporte para Java configurado</li>
</ul>

# Instalación y Ejecución
1. Clonar el repositorio:


git clone https://github.com/usuario/mi-diario.git
cd mi-diario

2. Compilar el proyecto:

javac -d out -sourcepath src src/main/java/ui/ConsolaUI.java

3. Ejecutar la aplicación:

java -cp out ui.ConsolaUI

# Ejecución de Pruebas
Las pruebas unitarias aseguran el correcto funcionamiento de DiarioService y ConsolaUI. Se utiliza JUnit y Mockito para la simulación de interacciones en ConsolaUI.
Para ejecutar todas las pruebas:
mvn test

* Ejemplo de Uso

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

# Contribución
<ol>
    <li>Realiza un fork del repositorio.</li>
    <li>Crea una nueva rama con la funcionalidad:
        <pre><code>git checkout -b feature/tu-funcionalidad</code></pre>
    </li>
    <li>Realiza los cambios y haz un commit:
        <pre><code>git commit -m "Añadir nueva funcionalidad"</code></pre>
    </li>
    <li>Sube tus cambios:
        <pre><code>git push origin feature/tu-funcionalidad</code></pre>
    </li>
    <li>Crea un Pull Request para revisión.</li>
</ol>