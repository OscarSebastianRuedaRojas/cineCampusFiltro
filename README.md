# Proyecto CineCampus

## Descripción del Proyecto
El proyecto CineCampus consiste en el desarrollo de una aplicación de gestión de películas para un sistema de cine. Esta innovadora aplicación tiene como objetivo centralizar y optimizar la administración de la vasta cantidad de información relacionada con la industria cinematográfica. Permitirá gestionar de manera eficiente y detallada datos sobre películas, actores, formatos, géneros y países.

### Participantes
- Juan José Bastos
- Oscar Sebastián Rueda

### Características Principales
1. **Gestión de Películas**: Permite registrar, editar, eliminar y listar películas, incluyendo información detallada como el código interno, nombre, duración y sinopsis.
2. **Gestión de Actores**: Almacena y administra información sobre actores, incluyendo nombre, nacionalidad, edad y género, con posibilidad de clasificar los tipos de actores y sus roles específicos en las películas.
3. **Gestión de Formatos**: Permite administrar los distintos formatos de proyección de las películas y vincular cada película con sus formatos respectivos y la cantidad disponible para cada uno.
4. **Gestión de Géneros**: Clasifica las películas por géneros y facilita la búsqueda y filtrado según las preferencias de los usuarios.
5. **Gestión de Países**: Permite registrar y acceder a información sobre los países de origen de cada producción.
6. **Asignación de Actores a Películas**: Facilita la asignación de actores a las películas y la definición de sus roles en cada producción.

## Objetivos
- Crear una base de datos en MySQL siguiendo el esquema proporcionado en el DER.
- Desarrollar una aplicación en Java utilizando Maven para la gestión de dependencias.
- Implementar las funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar) para las diferentes entidades del sistema.
- Diseñar un menú interactivo en la consola para navegar entre las distintas funcionalidades.

## Requisitos
### Base de Datos MySQL
1. Crear una base de datos llamada `cinecampus`.
2. Crear las tablas según el DER proporcionado.
3. Poblar las tablas con algunos datos iniciales para pruebas.

### Aplicación Java
1. Utilizar Maven para la gestión de dependencias.
2. Implementar las funcionalidades CRUD para las tablas del sistema.
3. Crear un menú de consola para interactuar con el usuario.

## Casos de Uso
### Gestión de Actores
- **Descripción**: Permitir al usuario agregar, editar, eliminar y listar actores.
- **Flujo Principal**:
  1. El usuario selecciona la opción "Gestionar Actores" en el menú principal.
  2. El sistema muestra las opciones: Agregar Actor, Editar Actor, Eliminar Actor, Listar Actores.

### Gestión de Películas
- **Descripción**: Permitir al usuario agregar, editar, eliminar y listar películas.
- **Flujo Principal**:
  1. El usuario selecciona la opción "Gestionar Películas" en el menú principal.
  2. El sistema muestra las opciones: Agregar Película, Editar Película, Eliminar Película, Listar Películas.

### Gestión de Formatos
- **Descripción**: Permitir al usuario agregar, editar, eliminar y listar formatos.
- **Flujo Principal**:
  1. El usuario selecciona la opción "Gestionar Formatos" en el menú principal.
  2. El sistema muestra las opciones: Agregar Formato, Editar Formato, Eliminar Formato, Listar Formatos.

### Asignación de Actores a Películas
- **Descripción**: Permitir al usuario asignar actores a las películas y definir sus roles.
- **Flujo Principal**:
  1. El usuario selecciona la opción "Asignar Actores a Películas" en el menú principal.
  2. El sistema muestra una lista de películas registradas.
  3. El usuario selecciona una película de la lista.
  4. El sistema muestra una lista de actores y permite asignarles roles.

### Gestión de Géneros
- **Descripción**: Permitir al usuario agregar, editar, eliminar y listar géneros.
- **Flujo Principal**:
  1. El usuario selecciona la opción "Gestionar Géneros" en el menú principal.
  2. El sistema muestra las opciones: Agregar Género, Editar Género, Eliminar Género, Listar Géneros.

### Gestión de Países
- **Descripción**: Permitir al usuario agregar, editar, eliminar y listar países.
- **Flujo Principal**:
  1. El usuario selecciona la opción "Gestionar Países" en el menú principal.
  2. El sistema muestra las opciones: Agregar País, Editar País, Eliminar País, Listar Países.

### Gestión de Tipos de Actores
- **Descripción**: Permitir al usuario agregar, editar, eliminar y listar tipos de actores.
- **Flujo Principal**:
  1. El usuario selecciona la opción "Gestionar Tipos de Actores" en el menú principal.
  2. El sistema muestra las opciones: Agregar Tipo de Actor, Editar Tipo de Actor, Eliminar Tipo de Actor, Listar Tipos de Actores.

### Consulta de Información Detallada de una Película
- **Descripción**: Permitir al usuario consultar la información detallada de una película, incluyendo actores, formatos y otros detalles relacionados.
- **Flujo Principal**:
  1. El usuario selecciona la opción "Consultar Información Detallada de una Película" en el menú principal.
  2. El sistema muestra una lista de películas registradas.
  3. El usuario selecciona una película de la lista.
  4. El sistema muestra los detalles de la película seleccionada.

### Listar Actores por Película
- **Descripción**: Permitir al usuario listar los actores que participan en una película específica.
- **Flujo Principal**:
  1. El usuario selecciona la opción "Listar Actores por Película" en el menú principal.
  2. El sistema muestra una lista de películas registradas.
  3. El usuario selecciona una película de la lista.
  4. El sistema muestra una lista de actores que participan en la película seleccionada.

## Criterios de Evaluación
### Gestión de Actores
- **Agregar Actor**: Permitir agregar un nuevo actor con todos los campos requeridos, guardar correctamente los datos en la base de datos y mostrar un mensaje de confirmación.
- **Editar Actor**: Permitir editar los datos de un actor existente, guardar correctamente los cambios en la base de datos y mostrar un mensaje de confirmación.
- **Eliminar Actor**: Permitir eliminar un actor existente, eliminar correctamente los datos de la base de datos y mostrar un mensaje de confirmación.
- **Listar Actores**: Mostrar una lista de todos los actores registrados con todos los detalles relevantes.

### Gestión de Películas
- **Agregar Película**: Permitir agregar una nueva película con todos los campos requeridos, guardar correctamente los datos en la base de datos y mostrar un mensaje de confirmación.
- **Editar Película**: Permitir editar los datos de una película existente, guardar correctamente los cambios en la base de datos y mostrar un mensaje de confirmación.
- **Eliminar Película**: Permitir eliminar una película existente, eliminar correctamente los datos de la base de datos y mostrar un mensaje de confirmación.
- **Listar Películas**: Mostrar una lista de todas las películas registradas con todos los detalles relevantes.

### Gestión de Formatos
- **Agregar Formato**: Permitir agregar un nuevo formato con la descripción correspondiente, guardar correctamente los datos en la base de datos y mostrar un mensaje de confirmación.
- **Editar Formato**: Permitir editar la descripción de un formato existente, guardar correctamente los cambios en la base de datos y mostrar un mensaje de confirmación.
- **Eliminar Formato**: Permitir eliminar un formato existente, eliminar correctamente los datos de la base de datos y mostrar un mensaje de confirmación.
- **Listar Formatos**: Mostrar una lista de todos los formatos registrados con todas las descripciones relevantes.

### Asignación de Actores a Películas
- **Asignar Actores a Películas**: Permitir seleccionar una película y asignar actores, definir el rol del actor en la película, guardar correctamente los datos de asignación en la base de datos y mostrar un mensaje de confirmación.
- **Editar Asignación de Actor a Película**: Permitir editar la asignación de actores a películas existentes, guardar correctamente los cambios en la base de datos y mostrar un mensaje de confirmación.
- **Eliminar Asignación de Actor a Película**: Permitir eliminar la asignación de actores a películas existentes, eliminar correctamente los datos de la base de datos y mostrar un mensaje de confirmación.
- **Listar Asignaciones**: Mostrar una lista de todas las asignaciones de actores a películas con todos los detalles relevantes.

### Gestión de Géneros
- **Agregar Género**: Permitir agregar un nuevo género con todos los campos requeridos, guardar correctamente los datos en la base de datos y mostrar un mensaje de confirmación.
- **Editar Género**: Permitir editar los datos de un género existente, guardar correctamente los cambios en la base de datos y mostrar un mensaje de confirmación.
- **Eliminar Género**: Permitir eliminar un género existente, eliminar correctamente los datos de la base de datos y mostrar un mensaje de confirmación.
- **Listar Géneros**: Mostrar una lista de todos los géneros registrados con todos los detalles relevantes.

### Gestión de Países
- **Agregar País**: Permitir agregar un nuevo país con todos los campos requeridos, guardar correctamente los datos en la base de datos y mostrar un mensaje de confirmación.
- **Editar País**: Permitir editar los datos de un país existente, guardar correctamente los cambios en la base de datos y mostrar un mensaje de confirmación.
- **Eliminar País**: Permitir eliminar un país existente, eliminar correctamente los datos de la base de datos y mostrar un mensaje de confirmación.
- **Listar Países**: Mostrar una lista de todos los países registrados con todos los detalles relevantes.

### Gestión de Tipos de Actores
- **Agregar Tipo de Actor**: Permitir agregar un nuevo tipo de actor con todos los campos requeridos, guardar correctamente los datos en la base de datos y mostrar un mensaje de confirmación.
- **Editar Tipo de Actor**: Permitir editar los datos de un tipo de actor existente, guardar correctamente los cambios en la base de datos y mostrar un mensaje de confirmación.
- **Eliminar Tipo de Actor**: Permitir eliminar un tipo de actor existente, eliminar correctamente los datos de la base de datos y mostrar un mensaje de confirmación.
- **Listar Tipos de Actores**: Mostrar una lista de todos los tipos de actores registrados con todos los detalles relevantes.

### Consulta de Información Detallada de una Película
- **Consultar Información**: Permitir seleccionar una película y mostrar todos los detalles relevantes incluyendo actores, formatos y otros datos relacionados.

### Listar Actores por Película
- **Listar Actores**: Permitir seleccionar una película y mostrar una lista de todos los actores que participan en ella con sus roles específicos.

## Conclusión
El proyecto CineCampus busca ofrecer una solución integral para la gestión eficiente de la información en el ámbito cinematográfico, facilitando las operaciones y el acceso a datos precisos y organizados.

---


