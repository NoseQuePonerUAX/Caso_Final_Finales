Ejercicio_2:

1.- C) La tercera y última tiene una complejidad computacional de O(log2(N)) y ocupa un poco más de espacio en memoria S(O(log2(N))).

2.- Ambas son estructuras de datos utilizadas para organizar y acceder a la información de manera eficiente, aunque en la implementación y depende de la situacion son completamente distintas. Por ejemplo, una tabla hash se utiliza cuando se necesita un acceso rápido a los datos y el conjunto de claves es conocido y relativamente estático. Mientras que, un árbol se usa cuando se necesitan operaciones ordenadas, como búsqueda, inserción y eliminación, y se quiere mantener una estructura ordenada de los datos.

3.- Estas son estructuras de datos lineales que se utilizan para almacenar elementos y administrar el orden en el que se acceden o se eliminan esos elementos. Sin embargo, a la hora de realizar operaciones y el principio de acceso a los elementos varian. Por ejemplo, se utiliza una pila cuando se necesita un acceso rápido a los elementos más recientes y se quiere mantener un orden inverso de los datos. Por otro lado, una cola se usa cuando se necesita mantener el orden original de los elementos y se quiere acceder a ellos en el mismo orden en que se agregaron.

4.- El método de ordenación por inserción recorre una lista y coloca cada elemento en su posición correcta.
Las iteraciones para el conjunto de 50 20 84 13 22 16 89 85 son:

Iteración 1: Comenzamos con el primer elemento, que es 50. Como no hay elementos previos para comparar, lo dejamos en su lugar.
Lista: 50 20 84 13 22 16 89 85
Iteración 2: Tomamos el segundo elemento, que es 20, y lo comparamos con el elemento anterior (50). Como 20 es menor que 50, lo movemos a la izquierda.
Lista: 20 50 84 13 22 16 89 85
Iteración 3: El tercer elemento es 84. Lo comparamos con los elementos anteriores y lo dejamos en su lugar, ya que es mayor que 50.
Lista: 20 50 84 13 22 16 89 85
Iteración 4: El cuarto elemento es 13. Lo comparamos con los elementos anteriores y lo movemos hacia la izquierda hasta su posición correcta.
Lista: 13 20 50 84 22 16 89 85
Iteración 5: El quinto elemento es 22. Lo comparamos con los elementos anteriores y lo dejamos en su lugar, ya que es mayor que 13 y menor que 50.
Lista: 13 20 22 50 84 16 89 85
Iteración 6: El sexto elemento es 16. Lo comparamos con los elementos anteriores y lo movemos hacia la izquierda hasta su posición correcta.
Lista: 13 16 20 22 50 84 89 85
Iteración 7: El séptimo elemento es 89. Lo comparamos con los elementos anteriores y lo dejamos en su lugar, ya que es mayor que todos los elementos anteriores.
Lista: 13 16 20 22 50 84 89 85
Iteración 8: El octavo y último elemento es 85. Lo comparamos con los elementos anteriores y lo dejamos en su lugar, ya que es mayor que 13 y menor que 89.
Lista: 13 16 20 22 50 84 85 89

Asi quedaría finalmente.

5.- 
