# Tipo de Cambio

### DIAGRAMA DEL PROYECTO
![Alt text](https://raw.githubusercontent.com/joffrehermosilla/authserver/master/src/main/resources/Diagrama%20.png)

### ACCESO A H2 BD 
![Alt text](https://github.com/joffrehermosilla/authserver/blob/master/src/main/resources/Screenshot%20from%202024-04-05%2023-04-11.png)
![Alt text](https://github.com/joffrehermosilla/authserver/blob/master/src/main/resources/Screenshot%20from%202024-04-05%2023-05-36.png)


### OBTENCIÓN DEL PRIMER TOKEN
![Alt text](https://github.com/joffrehermosilla/authserver/blob/master/src/main/resources/Screenshot%20from%202024-04-07%2016-43-08.png)
![Alt text](https://github.com/joffrehermosilla/authserver/blob/master/src/main/resources/Screenshot%20from%202024-04-07%2016-43-49.png)

### OBTENCIÓN DEL SEGUNDO TOKEN
![Alt text](https://github.com/joffrehermosilla/authserver/blob/master/src/main/resources/Screenshot%20from%202024-04-07%2016-44-19.png)
![Alt text](https://github.com/joffrehermosilla/authserver/blob/master/src/main/resources/Screenshot%20from%202024-04-07%2016-44-29.png)
![Alt text](https://github.com/joffrehermosilla/authserver/blob/master/src/main/resources/Screenshot%20from%202024-04-07%2016-44-05.png)


### USAMOS EL SEGUNDO TOKEN EN NUESTRAS CONSULTAS (DURACION 5 MIN)
![Alt text](https://github.com/joffrehermosilla/authserver/blob/master/src/main/resources/Screenshot%20from%202024-04-07%2016-52-39.png)
![Alt text](https://github.com/joffrehermosilla/authserver/blob/master/src/main/resources/Screenshot%20from%202024-04-07%2016-52-00.png)

### CONFIRMAMOS EL TOKEN GENERADO JWT
![Alt text](https://github.com/joffrehermosilla/authserver/blob/master/src/main/resources/Screenshot%20from%202024-04-07%2017-16-18.png)




Arquitectura hexagonal
La arquitectura hexagonal, también conocida como Ports and Adapters, es un patrón de diseño que busca mantener una separación clara de las responsabilidades en una aplicación, facilitando la adaptabilidad, escalabilidad y mantenibilidad del software. La arquitectura se organiza en tres capas principales:

Dominio: Esta capa contiene las entidades del dominio, que representan los conceptos clave del negocio y sus relaciones, así como la lógica de negocio asociada. Estas entidades son independientes de la infraestructura y la implementación, lo que permite centrarse en las reglas y restricciones del negocio.

Aplicación: Esta capa contiene los casos de uso, que representan las acciones o funcionalidades que la aplicación puede realizar. Los casos de uso coordinan la comunicación entre los puertos de entrada (interfaces que representan las acciones que se pueden realizar desde el exterior) y los puertos de salida (interfaces que representan las acciones que la aplicación puede realizar hacia el exterior, como interactuar con bases de datos o servicios externos).

Infraestructura: Esta capa contiene los adaptadores y la implementación de los puertos de salida, así como la configuración y la interacción con servicios externos. Los adaptadores son responsables de convertir las solicitudes externas en llamadas a los casos de uso y de convertir las respuestas de los casos de uso en respuestas comprensibles para los sistemas externos.

La arquitectura hexagonal se adhiere a los principios SOLID:

Single Responsibility Principle (SRP): Cada capa tiene una responsabilidad única y bien definida, lo que evita la mezcla de responsabilidades y facilita el mantenimiento del código.

Open/Closed Principle (OCP): Las entidades y los casos de uso están abiertos a la extensión pero cerrados a la modificación. Si se necesita agregar una nueva funcionalidad, se puede hacer extendiendo los casos de uso o creando nuevos adaptadores sin modificar el código existente.

Liskov Substitution Principle (LSP): Los adaptadores y las implementaciones de los puertos deben ser sustituibles sin afectar el comportamiento del sistema, lo que permite cambiar fácilmente entre diferentes implementaciones de infraestructura o servicios externos.

Interface Segregation Principle (ISP): Los puertos de entrada y salida definen interfaces pequeñas y específicas para cada funcionalidad, lo que facilita la implementación de adaptadores y evita depender de interfaces innecesariamente grandes.

Dependency Inversion Principle (DIP): Las dependencias entre las capas se invierten mediante la inyección de dependencias, lo que permite a las capas de dominio y aplicación depender de abstracciones en lugar de implementaciones concretas.


### Aplicar Jacoco y Sonar para cobertura de Test Unitarios
clean org.jacoco:jacoco-maven-plugin:prepare-agent install
sonar:sonar -Dsonar.login=a01a6bdf8141335a17805e0166ac4f4e8787f201


clean org.jacoco:jacoco-maven-plugin:prepare-agent install

### Docker Build and Docker Run Images
```bash
$ docker build . -t tipodecambio
$ docker run -d --name tipodecambio -p 8080:8080 tipodecambio
```
