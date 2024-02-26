# Genéricos de Java

### Porque?
- Type safety: permiten la verificación de tipos de datos en tiempo de compilación. Reduciendo así errores en tiempo de ejecución.
- Reusabilidad: permiten generar código reusable para varios tipos de datos a la vez.

Veamos el problema que solucionan:
- [GenericsExample1Bad.java](src/part1/GenericsExample1Bad.java)
- [GenericsExample1Good.java](src/part1/GenericsExample1Good.java)

### Syntaxis
- Caja para transportar cualquier tipo de objeto: [Crate.java](src/part2/Crate.java)
- Caja para dos <3: [Couple.java](src/part2/Couple.java)

###### Nota: los genéricos son normalmente usados en librerías para hacer código reusable, no te preocupes si no se te ocurren ideas para usarlos ;) 

### Ejemplos
- Lista ligada [GenericLinkedList](src/examples/GenericLinkedList.java)
- La biblioteca de colecciones de Java: `List<T>, Map<K, V>, Set<T>, ...`
- La api de programación funcional de Java: `Function<T, U>, BiFunction<T, U, R>, Consumer<T>, ...`
- Los repositorios de spring JPA
```java
public interface UserRepository extends JpaRepository<Foo, Long> { }
```

### Type erasure
Los tipos genéricos se evaluan en tiempo de compilación. En tiempo de ejecución los tipos genéricos son borrados.
Esto se hizo porque en las primeras versiones de Java no existian los genéricos. Entonces para mantener la compatibilidad,
los tipos de datos genéricos son convertidos a Object después de que el código compila.

### Algunas conveciones
- E para elementos
- K para llaves de maps (keys)
- V para valores de mapas
- N para números
- T para tipo de dato genérico
- S, U, V, ademas de otras letras para múltiples tipos genéricos