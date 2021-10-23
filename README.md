# Reto_3_grupo6

En el reto 3, el equipo desarrollara los servicios de backend que antes realizaba en la herramienta APEX de Oracle, ahora, los servicios que seran implementados son los servicios GET que muestran la lista de elementos que hay en las tablas, asi como las relaciones que hay en las mismas. Tambien se implementaran todos los servicios POST utilizados para la creacion de elementos en las tablas. Se utilizaran los elementos de frontend creados previamente con ciertas modificaciones y se crearan los nuevos para las tablas a las que no se les habia creado un frontend.

Al finalizar este reto, tendremos funcionando nuestro propio backend y ademas tendremos nuevas funcionalidades. Las funcionalidades que estaran resueltas al finalizar este reto son:

-Creacion de categorias (endpoint:/api/Category/save)

-Creacion de Disfraces (endpoint:/api/Costume/save)

-Creacion de clientes (endpoint:/Client/save)

-Creación de Mensajes (endpoint: /api/Message/save).

-Creación de Reservas. (endpoint: /api/Reservation/save).

-Calificación de las reservas. (endpoint: /api/Score/save).

-Creación de usuarios administrativos. (endpoint: /api/Admin/save).

--------------------------------------------------------

-Visualización de Disfraces (endpoint: /api/Costume/all).

-Visualización de Categorías (endpoint: /api/Category/all).

-Visualización de Clientes (endpoint: /api/Client/all).

-Visualización de Mensajes (endpoint: /api/Message/all).

-Visualización de Reservas con sus calificaciones. (endpoint: /api/Reservation/all).

-Visualización de usuarios administrativos. (endpoint: /api/Admin/all).



----------------------------------------------------------------


Historias de usuario:

Historia #1
	- Creacion de Disfraces

	Descripcion: 
		- COMO: usuario
		- QUIERO: Ingresar los valores de marca, nombre, año, descripcion y categoria.
		- PARA: Poder crear un disfraz en el sistema.

	Criterios de aceptación:
		- Los valores de marca y nombre deben ser un texto de no más de 45 caracteres.
		- Los valores de año deben ser un número de 4 dígitos que representa un año calendario.
		- Los valores de descripción deben ser un texto de máximo 250 caracteres.
		- El valor de categoría debe ser un número entero que representa el id de cada una de las categorías.
		- El usuario debe seleccionar la categoría viendo el nombre de la misma, no el número.

-------------------------------------------------------------
Historia #2
	- Creación de Categorías

	Descripción: 
		- COMO:	Usuario
		- QUIERO:	Ingresar los valores de nombre y descripción
		- PARA:	Poder crear una categoría en el sistema

	Criterios de aceptación:
		- Los valores de nombre deben ser un texto de no más de 45 caracteres.
		- Los valores de descripción deben ser un texto de máximo 250 caracteres.

-------------------------------------------------------------
Historia #3
	- 	Creación de Clientes

	Descripción: 
		- COMO:	Usuario
		- QUIERO:	Ingresar los valores de nombre, correo, edad y contraseña
		- PARA:	Poder registrarse en el sistema

	Criterios de aceptación:
		- Los valores de correo y contraseña deben ser un texto de no más de 45 caracteres.
		- Los valores de edad deben ser un número que represente los años.
		- Los valores de nombre deben ser un texto de máximo 250 caracteres.

-------------------------------------------------------------
Historia #4
	- Creación de Mensajes

	Descripción:
		- COMO:	Usuario
		- QUIERO:	Ingresar los valores de disfraz y texto
		- PARA:	Poder registrar en el sistema un mensaje

	Criterios de aceptación:
		- Los valores de texto deben ser una cadena de caracteres no superior a 250 caracteres
		- El valor de disfraz corresponde al id de cada disfraz y es un valor numérico
		- El usuario debe seleccionar el disfraz por su nombre, puesto que el id debe ser invisible para el usuario.

-------------------------------------------------------------
Historia #5
	- Creación de Reservas

	Descripción:
		- COMO:	Usuario
		- QUIERO: Ingresar los valores de disfraz, cliente, fecha inicio, fecha entrega.
		- PARA:	Poder registrar en el sistema una reserva

	Criterios de aceptación:
		- Los valores de cliente debe ser un numero entero correspondiente al id del cliente.
		- El valor de disfraz corresponde al id de cada disfraz y es un valor numérico.
		- El usuario debe seleccionar el disfraz por su nombre, puesto que el id debe ser invisible para el usuario.
		- Los valores de fecha de inicio y fecha entrega deben ser fechas en el formato YYYY-mm-dd
		-La reserva creada debe tener status: 'Creado' y la fecha de creación, debe ser tomada del reloj del sistema. No son datos que el usuario ingrese.

-------------------------------------------------------------
Historia #6
	- 	Creación de Calificación de Reservas

	Descripción:
		- COMO:	Usuario
		- QUIERO: Ingresar los valores de calificación, mensaje y reserva
		- PARA:	Poder calificar una reserva

	Criterios de aceptación:
		- Los valores de calificación debe ser un número entero entre 0 y 5.
		- Los valores de mensaje deben ser un texto no superior a 250 caracteres.
		- El valor de la reserva es un número entero y debe ser tomado de la reserva que se esté calificando. El usuario no ingresa el número de reserva.

-------------------------------------------------------------
Historia #7
	- Creación de Usuarios Administradores

	Descripción:
		- COMO:	Usuario
		- QUIERO:	Ingresar los valores de nombre, correo y contraseña
		- PARA:		Poder registrarse en el sistema

	Criterios de aceptación:
		- Los valores de correo y contraseña deben ser un texto de no más de 45 caracteres.
		- Los valores de nombre deben ser un texto de máximo 250 caracteres.

-------------------------------------------------------------
Historia #8
	- Visualización de Disfraces

	Descripción:
		- COMO:	Usuario
		- QUIERO:	Ingresar a la lista de disfraces
		- PARA:	Ver los disfraces que hay en el sistema

	Criterios de aceptación:
		- La lista de disfraces se debe cargar sin mostrar el id.
		- La lista no debe mostrar el id de la categoría.

-------------------------------------------------------------
Historia #9
	- Visualización de Categorías

	Descripción:
		- COMO:	Usuario
		- QUIERO:	Ingresar a la lista de Categorías
		- PARA:	Ver los disfraces que hay en el sistema separados por categorías

	Criterios de aceptación:
		- La lista de categorías se debe cargar sin mostrar el id.
		- La lista de disfraces de cada categoría no debe mostrar el id de los disfraces.

-------------------------------------------------------------
Historia #10
	- Visualización de Clientes

	Descripción:
		- COMO:	Usuario
		- QUIERO:Ingresar a la lista de clientes
		- PARA:	Ingresar a la lista de clientes

	Criterios de aceptación:
		- La lista de clientes se debe cargar sin mostrar el password.
		- Deben cargar todos los clientes que hay en base de datos.


-------------------------------------------------------------
Historia #11
	- Visualización de Mensajes

	Descripción:
		- COMO:	Usuario
		- QUIERO:	Ingresar a la lista de mensajes
		- PARA:	Ver los mensajes que hay en el sistema

	Criterios de aceptación:
		- La lista de mensajes se debe cargar sin mostrar el id.
		- La lista no debe mostrar el id de la del disfraz.
		- La lista no debe mostrar el id del cliente
		- Se deben mostrar todos los mensajes.


-------------------------------------------------------------
Historia #12
	- Visualización de Reservas

	Descripción:
		- COMO:	Usuario
		- QUIERO:	Ingresar a la lista de reservas
		- PARA:	Ver las reservas que hay en el sistema

	Criterios de aceptación:
		- La lista de reservas se debe cargar mostrando el id.
		- La lista no debe mostrar el id del disfraz de cada reserva.
		- La lista debe mostrar el id, nombre y correo solamente del cliente.
		- La lista debe mostrar las calificación de la reserva en caso que la tenga.
		- La lista no debe mostrar el id de una calificación.


-------------------------------------------------------------
Historia #13
	- Visualización de Usuarios administradores

	Descripción:
		- COMO:	Usuario
		- QUIERO:	Ingresar a la lista de administradores
		- PARA:	Ver los usuarios administradores que hay en el sistema

	Criterios de aceptación:
		- La lista de clientes se debe cargar sin mostrar el password.
		- Deben cargar todos los usuarios administradores que hay en base de datos.


Instrucciones
Instrucciones para la calificación automática

En este caso, no se ejecutará el código directamente sino que se evaluarán los resultados obtenidos al realizar peticiones HTTP al API construida y que actualmente debe estar desplegada en Oracle Cloud. Las peticiones que se realizarán serán de tipo GET y POST Para realizar las pruebas, las tablas de la base datos deben estar vacías y el valor 

	Entrada: 
		Cada grupo debe proveer URL (o la ip) donde se encuentra desplegada el API.
		Esta entrada se denominará URL Base

	Salida:
		Corresponde a los mensajes JSON que retorna cada petición. MasterTech hará la comparación de forma automática.







