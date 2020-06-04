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

Imagen Eclipse

[Toca acá para ver la Descarga e instalación del editor Eclipse](https://www.youtube.com/watch?v=j8ngvGNFXKA&t=311s)

Cuando ya tengas tu editor el siguiente paso seras descargar la version más reciente de Maven y el JDK de la version 8 de java ya que esta version es compatible con el proyecto.

Imagen JDK

Imagen maven

[Toca acá para ver la Descarga de Maven y la configuración del JDK y Maven](https://www.youtube.com/watch?v=ExOl1qkYGiI&t=238s)

Por ultimo deberas descargar GIT para poder obtener el proyecto desde este repositorio.

Imagen de GIT

[Toca acá para ver la Descarga e instalación de GIT](https://www.youtube.com/watch?v=ES2xtLyI-B8)

Esto es todo lo que tienes que realizar para probar LOC Couting en tu ordenador.

## Licencia

## Diseño

Imagen Astah

### Descripción del diseño

Este diseño consta de una fachada la cual es la clase principal App, también de 3 clases las cuales serán las encargadas de los conteos y la lectura de archivos, tenemos una interfaz para la parte logica del modelo y por ultimo se cuenta con una clase de pruebas. El modelo empieza en la clase principal App la cual tiene relacion con la clase Leer la cual se encargara de como lo dice su nombre leer y guardas los archivos que se le pasen, a la vez esta clase tiene relacion con la interfaz contador lineas la cual sera la encargada de contar las lineas del archivo que se le envia, esta interfaz la implementan otras dos clases las cuales seran las encargas de diferenciar el conteo, si es PHY o LOC. La clase de pruebas tiene una relación con la clase principal ya que en esta es donde se provara la ejecución correcta del proyecto.

Las clases para leer y contar junto con la interfaz pertenece al paquete edu.escuelaing.arsw.intro.ContadorLineas, la clase principal pertene al paquete edu.escuelaing.arsw.intro.

## Uso de LOC Couting

Lo primero que deberas hacer es abrir la terminal de tu ordenador (CMD) y obtener el proyecto que se encuenta en el siguiente enlace:

[Repositorio LOC Couting](https://github.com/EstebanK23/Laboratorio-01-ARSW)

Para obtener el proyecto deberas clonarlo desde git, el cual ya debe estar instalado como se menciono anteriormente, para esto se usara el siguiente comando en la terminal.

Imagen git clone

El paso siguiente es compilar el proyecto haciendo uso del siguiente comando de Maven.

Imagen mvn package

Al realizar este comando podremos ver los siguente

Imagen test

Por ultimo para realizar la prueba existe el siguiente comando.

Para el caso de PHY

Imagen PHY

Para el caso de LOC

Se muestran dos ejemplos cuando se pasa la dirccion de una carpeta.

Imagen carpeta PHY

Imagen carpeta LOC

## Ejecución de pruebas

Para dar inicio a la ejecucion de pruebas se utilizara el siguiente comando de Maven.

Imagen mvn test

Se muestra la ejecución de pruebas correctamente

Imagen2 mvn test

Se muestran algunos ejemplos de la ejecución de 12 pruebas donde se evidencia el funcionamiento de la siguiente manera.

  - Lectura de archivos y carpetas
  
  Imagen 1
  
  - Conteo de archivos de manera PHY
  
  Imagen 2
  
  - Conteo de archivos de manera LOC
  
  Imagen 3

Imagen de pruebas

