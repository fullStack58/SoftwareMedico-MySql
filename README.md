Es un software basado en un contexto médico, que mediante una UI permite la gestión de usuarios a través una base de datos MySql. Adicionalmente integra el algoritmo ShellSort para ordenar una colección de datos.  

# SoftwareMedico-MySql 
El usuario interactúa con una base de datos mediante una interfaz gráfica que cuenta con dos apartados. La pantalla principal filtra todos los doctores registrados en la base de datos que a su vez se pueden gestionar mediante CRUD, sin necesidad de usar directamente la base de datos para modificar los registros. Adicionalmente se dispone de la pantalla del ordenamiento ShellSort,  que básicamente encapsula los nombres de los doctores en una colección de datos para posteriormente organizarlos por orden alfabético, el usuario tiene la libertad de visualizar secuencialmente el proceso. 

## Requerimientos
- mysql-connector-j-8.0.32+ 
- XAMPP 
- Apache Netbeans 

## Configuración del entorno
Para correr la base de datos correctamente, es necesario asegurarse que las variables de entrada del archivo que realiza la conexión, estén configuradas correctamente para conectar la base de datos.

Dirígete al archivo `SourcePackages/Config/Conexion.java` en el archivo de conexión modificaremos estas líneas si es necesario 

Nombre de su base de datos:

    String nomBD = "tablasj";
Dirección donde se alojara su base de datos

    String dirBD = "jdbc:mysql://localhost:3306/" + nomBD;
Nombre del usuario 

    String usuario = "root";
Contraseña del usuario (opcional)

    String contraseña = "";


# Visualización

AÑADIR USUARIOS
![ezgif-166713c68054da](https://github.com/user-attachments/assets/1c4586e1-90e3-4e4b-a459-8ffcb5e30580)

MODIFICAR USUARIOS
![ezgif-1030f09d00350e](https://github.com/user-attachments/assets/4b464f6a-8848-4bcb-b4e7-50959243b7d8)

ELIMINAR USUARIOS
![ezgif-4d54d26184c4b8](https://github.com/user-attachments/assets/bfd76910-d74d-40f9-8770-b87eca477135)

ORDENAR COLECCIÓN DE DATOS
![ezgif-40261956d487c7](https://github.com/user-attachments/assets/168cd63f-e8b2-44b8-a78f-6632e8d7a15c)


