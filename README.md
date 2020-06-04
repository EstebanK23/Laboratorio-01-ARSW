# Autor: Guillermo Esteban Bernal Bonilla

## Profesor: Luis Daniel Benavides Navarro ARSW-2020-I

## Miercoles 03-Junio-2020

## LOC Couting

El objetivo de este proyecto es facilitar el conteo de lineas para diferentes archivos que se encuentren en una o varias carpetas, LOC Couting cuenta con dos tipos de conteo los cuales son el conteo a las lineas fisicas (PHY) osea a todas las lineas que se encuentran en el codigo y el conteo a las lineas de codigo (LOC) las cuales son solo las lineas que son codigo de java, excluyendo comentarios y lineas vacias.

Este conteo de lineas en los archivos se hace para observar complejidad y tiempo de ejecución y mejorar su funcionamiento siempre y cuando sea necesario, para este caso la metrica que se usa es la de medir las lineas de codigo sobre el tiempo empleado en el proyecto LOC Couting (LOC/Hours).

Total horas = 13

Total Lineas de Codigo = 343

343 LOC / 13 Hours = 26.38 LOC/Hours

## Requisitos para el uso de LOC Couting

Este proyecto se construyo utilizando el lenguaje de Java, el editor Eclipse Java 2020-3 con su JDK respectivo, y Maven para su ejecución, por esto debes seguir los sigueintes pasos. 

Lo primero que se debe realizar para el uso de LOC Couting es la descarga de un editor (IntelliJ Idea, Eclipse, BlueJ, etc) Esto es opcional, solo en caso de tener la necesidad de editar el proyecto. 

![Eclipse](https://user-images.githubusercontent.com/54051399/83717715-0ce51180-a5f9-11ea-9115-289c17ce2834.PNG)

[Toca acá para ver la Descarga e instalación del editor Eclipse](https://www.youtube.com/watch?v=j8ngvGNFXKA&t=311s)

Cuando ya tengas tu editor el siguiente paso seras descargar la version más reciente de Maven y el JDK de la version 8 de java ya que esta version es compatible con el proyecto.

![JDK](https://user-images.githubusercontent.com/54051399/83717739-1a9a9700-a5f9-11ea-97ad-1b17dc37d5fa.PNG)

![Maven](https://user-images.githubusercontent.com/54051399/83717759-27b78600-a5f9-11ea-9fdb-1de8409a9283.PNG)

[Toca acá para ver la Descarga de Maven y la configuración del JDK y Maven](https://www.youtube.com/watch?v=ExOl1qkYGiI&t=238s)

Por ultimo deberas descargar GIT para poder obtener el proyecto desde este repositorio.

![Git](https://user-images.githubusercontent.com/54051399/83717783-330ab180-a5f9-11ea-948f-1c9f420f91ae.PNG)

[Toca acá para ver la Descarga e instalación de GIT](https://www.youtube.com/watch?v=ES2xtLyI-B8)

Esto es todo lo que tienes que realizar para probar LOC Couting en tu ordenador.

## Licencia

La licencia utilizada para este proyecto es GPL-3.0 la cual se encuentra especificada en el siguiente enlace

[Licencia](https://github.com/EstebanK23/Laboratorio-01-ARSW/blob/master/LICENSE.txt)

## Diseño

![Modelo Astah](https://user-images.githubusercontent.com/54051399/83717815-46b61800-a5f9-11ea-8c19-859f2a1694b6.jpeg)

### Descripción del diseño

Este diseño consta de una fachada la cual es la clase principal App, también de 3 clases las cuales serán las encargadas de los conteos y la lectura de archivos, tenemos una interfaz para la parte logica del modelo y por ultimo se cuenta con una clase de pruebas. El modelo empieza en la clase principal App la cual tiene relacion con la clase Leer la cual se encargara de como lo dice su nombre leer y guardas los archivos que se le pasen, a la vez esta clase tiene relacion con la interfaz contador lineas la cual sera la encargada de contar las lineas del archivo que se le envia, esta interfaz la implementan otras dos clases las cuales seran las encargas de diferenciar el conteo, si es PHY o LOC. La clase de pruebas tiene una relación con la clase principal ya que en esta es donde se provara la ejecución correcta del proyecto.

Las clases para leer y contar junto con la interfaz pertenece al paquete edu.escuelaing.arsw.intro.ContadorLineas, la clase principal pertene al paquete edu.escuelaing.arsw.intro.

## Uso de LOC Couting

Lo primero que deberas hacer es abrir la terminal de tu ordenador (CMD) y obtener el proyecto que se encuenta en el siguiente enlace:

[Repositorio LOC Couting](https://github.com/EstebanK23/Laboratorio-01-ARSW)

Para obtener el proyecto deberas clonarlo desde git, el cual ya debe estar instalado como se menciono anteriormente, para esto se usara el siguiente comando en la terminal.

![git clone](https://user-images.githubusercontent.com/54051399/83717843-559cca80-a5f9-11ea-92df-c8b7d7f74c14.PNG)

El paso siguiente es compilar el proyecto haciendo uso del siguiente comando de Maven.

![mvn package](https://user-images.githubusercontent.com/54051399/83717865-5fbec900-a5f9-11ea-863a-a6ae3bef4861.PNG)

Al realizar este comando podremos ver los siguente

![mvn package 2](https://user-images.githubusercontent.com/54051399/83717881-6b11f480-a5f9-11ea-9311-38c3f95677df.PNG)

![mvn package 3](https://user-images.githubusercontent.com/54051399/83717898-736a2f80-a5f9-11ea-9dfd-a21d40f86c13.PNG)

Por ultimo para realizar la prueba existe el siguiente comando.

Para el caso de PHY

![PHY archivo](https://user-images.githubusercontent.com/54051399/83717988-b6c49e00-a5f9-11ea-9e34-d192e6047f97.PNG)

Para el caso de LOC

![LOC archivo](https://user-images.githubusercontent.com/54051399/83717931-909efe00-a5f9-11ea-84b6-b7b514ca187b.PNG)

Se muestran dos ejemplos cuando se pasa la direccion de una carpeta.

![PHY](https://user-images.githubusercontent.com/54051399/83717963-a6acbe80-a5f9-11ea-979e-8a594bdb4cb3.PNG)

![LOC](https://user-images.githubusercontent.com/54051399/83717946-9ac0fc80-a5f9-11ea-8b1d-e0e825afa80b.PNG)

## Ejecución de pruebas

Para dar inicio a la ejecucion de pruebas se utilizara el siguiente comando de Maven.

![mvn test](https://user-images.githubusercontent.com/54051399/83718023-cb089b00-a5f9-11ea-98c6-99aa15e62285.PNG)

Se muestra la ejecución de pruebas correctamente

![mvn test 2](https://user-images.githubusercontent.com/54051399/83718049-d956b700-a5f9-11ea-9a2f-f46cb6118afa.PNG)

Se muestran algunos ejemplos de la ejecución de 12 pruebas donde se evidencia el funcionamiento de la siguiente manera.

  - Lectura de archivos y carpetas
  
  ![Ejemplo archivo](https://user-images.githubusercontent.com/54051399/83718106-00ad8400-a5fa-11ea-93e9-2e2121e8c8a3.PNG)
  
  - Conteo de archivos de manera PHY
  
  ![Ejemplo phy paquete](https://user-images.githubusercontent.com/54051399/83718133-1327bd80-a5fa-11ea-8a0e-11cd59d2d71c.PNG)
  
  - Conteo de archivos de manera LOC
  
  ![Ejemplo loc paquete](https://user-images.githubusercontent.com/54051399/83718118-0905bf00-a5fa-11ea-8a8d-fb9e18526ea4.PNG)
  
Por ultimo se muestra la validación de todas las pruebas desde el editor Eclipse.

![pruebas](https://user-images.githubusercontent.com/54051399/83718160-233f9d00-a5fa-11ea-91bb-34a94f65a45e.PNG)

