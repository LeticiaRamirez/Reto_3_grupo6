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
































