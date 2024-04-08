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


### Docker Build and Docker Run Images
```bash
$ docker build . -t tipodecambio
$ docker run -d --name tipodecambio -p 8080:8080 tipodecambio
```
