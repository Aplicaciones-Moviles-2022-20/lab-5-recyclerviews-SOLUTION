# Laboratorio 5

El objetivo de este laboratorio es aprender a construir una lista de elementos en una aplicación móvil de Android Studio, con RecyclerViews.
Para ello, se introducirán algunos conceptos, como RecyclerView, Adapter y ViewHolder, los cuales serán definidos en el enunciado.

## Conceptos


### RecyclerView

ViewGroup que contiene vistas correspondientes a una lista de datos. Cada elemento de la lista está definido por un objeto contenedor de vistas (ViewHolder).
El RecyclerView solicita estas vistas y las vincula a sus datos, mediante llamadas a los métodos que se encuentran en el adapter.
El LayoutManager organiza los elementos individuales de la lista. Se puede usar un LayoutManager proporcionado por la biblioteca RecyclerView o definir el propio.

### Adapter

Es la clase que adecua la data que va a mostrar y las funcionalidades de los elementos dentro del viewgroup. Además, permite unir datos con la vista.


### ViewHolder

 Es un patrón que acelera considerablemente la población de ListViews y Recyclerviews, al almacenar en caché las búsquedas de vista para una carga de elementos más rápida y fluida.
No es necesario utilizar este patrón en ListViews, sin embargo, en RecyclerViews sí.



### Safe Args

Es el plugin que permite pasar parámetros o argumentos desde un fragment a otro, utilizando Navigation Component.
Se utilizan de la siguiente manera:
1. Se agrega argumentos en el Navigation Graph
2. Definimos la variable que se quiere entregar: se puede hacer un bundle para customizar el parámetro (desde el fragment) o llamar al action.
3. Llamar a los args del fragment

## TODO

En este laboratorio deberás realizar lo siguiente:

TODO 1: agregar un atributo al modelo Cats. [/0.5pts]

TODO 2: Agregar dicho atributo en el Adapter (ir al archivo `CatItemAdapter.kt` para más información) [/1pts]

TODO 3: Escribir en el README lo pedido en el TODO 3. [/0.5]

TODO 4: Agregar el atributo obtenga el valor asociado al objeto Cat. [/0.5]

TODO 5: Describe qué deberías hacer si se quiere mostrar un Grid en vez de una lista lineal. [/1ps]

TODO 6: Completa los detalles del "cat" seleccionado. Para ello, debes ir al archivo `CatDetailsFragment.kt` y a `fragment_cat_details.xml` y commpletar lo necesario para poder visualizar el nombre del Cat y el atributo agregado. [/1.25pts]

TODO 7: Describe en el README los pasos a seguir para poder crear una lista de elementos con RecyclerViews. [/1.25pts]


## Respuestas:

