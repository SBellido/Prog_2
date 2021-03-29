package tp9_MemoriasDeComputadora;
/*
 * 6. Memorias de Computadora

Se requiere modelar el comportamiento de la memoria de una computadora.

● Una memoria almacena bytes que pueden ser escritos y leídos de una dirección de memoria (el
direccionamiento va desde el 1 al tamaño de la memoria). Cada memoria tiene un tiempo de
acceso (TA), que indica cuanto tiempo tarda esa memoria para hacer una lectura o una escritura.

Se quiere analizar e implementar el comportamiento de distintas configuraciones de memoria:

● Memoria Combinada. Cada memoria tiene una cierta capacidad y para modelar memorias de
mayor capacidad se suelen utilizar varias memorias de manera simultánea. Sin embargo, el
direccionamiento se tiene que poder realizar como si fuera todo una sola memoria de gran
capacidad. El tiempo de acceso de una memoria combinada es el tiempo de la memoria a la que
se accede + una constante de tiempo que tarda la memoria combinada en determinar a qué
memoria debe acceder. Por ejemplo, si la memoria combinada tarda 3ms en determinar a qué
memoria acceder, y la memoria accedida tiene un TA de 10ms, el TA total es de 13ms. A
continuación se muestra un posible ejemplo de cómo una memoria que va del 1 al 59 se
constituye con la suma de memorias dentro de ella.

● Memoria con UNDO. Una memoria la cual almacena los cambios que en ella se producen. De
esta forma permite deshacer los N últimos cambios introducidos. Cuando se deshace una
operación se elimina el byte guardado y se restituye el valor anterior a la escritura. (TA: tiempo
de acceso de la memoria + cte).

● Memoria con errores. Una memoria introduce errores de lectura/escritura en base a una tasa de
error. Es decir que cuando se graba o lee un elemento la memoria genera un valor erróneo (por
ejemplo, en el 10% de las lecturas o escritura en vez de devolver o almacenar el valor correcto,
utiliza un valor generado al azar). (TA = tiempo de acceso de la memoria + cte).

Tenga en cuenta que se pueden combinar los diferentes tipos de memoria y en múltiples niveles de
manera transparente para el usuario. 

Se debe proveer servicios para:
1. Leer y escribir en alguna posición de la memoria.
2. Obtener el último tiempo de acceso de una memoria.
3. Cantidad de accesos (tanto lectura como escritura).
4. Tamaño total de la memoria.

NOTA. Tener en cuenta que el modelo debe permitir todas las posibles formas de combinación de
las memorias. Ejemplos de sólo algunas de las posibles combinaciones:
● Una memoria combinada la cual contenga una memoria UNDO y otra combinada.
● Una memoria UNDO que permite deshacer cambios de una memoria combinada.
● Una memoria que genera errores sobre una memoria con UNDO.
 */
public class MainMemoriasDeComputadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
