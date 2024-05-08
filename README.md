Ejercicio_3:

a) Imprime "at Main.recursive(Main.java:18) decenas de veces y el motivo es que no maneja adecuadamente el caso en el que b es negativo. Para solucionarlo agregaremos un "else if(b < 0) { return 1 / (a * recursive(a, -b -1));" entre "return 1;" y "else if(a == 0)" para que pueda calcular el inverso de la potencia calculada con b positivo, multiplicando por -1.
b) Como b es negativo, la función realiza una recursión multiplicando el resultado anterior por "a" e invirtiendo el signo de b en cada llamada hasta que b sea igual a 0. El tipo de recursividad que se está empleando es "recursion ascendente".
