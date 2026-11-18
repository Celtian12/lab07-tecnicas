# Bitacora de tecnicas avanzadas

Laboratorio 07: Tecnicas Avanzadas de Prompting.
Herramienta de IA usada: (escribe aqui cual usaste)

## Ejercicio 2: Zero-shot, one-shot y few-shot

| Tipo      | Aciertos (de 5) | Formato de la respuesta     | Todas con el mismo formato (Si/No) |
| --------- | --------------- | --------------------------- | ---------------------------------- |
| Zero-shot | 5               | positivo, negativo, neutral | Sí                                 |
| One-shot  | 5               | Positivi, negativo, neutral | Sí                                 |
| Few-shot  | 5               | positivo, negativo, neutral | Sí                                 |

## Ejercicio 3: Chain of Thought

| Pedido      | Respuesta de la IA                                                                                                                                                                                                                                                                           | Muestra los pasos (Si/No) | Correcta (Si/No) |
| ----------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------- | ---------------- |
| Directo     | S/ 318,60                                                                                                                                                                                                                                                                                    | No                        | Sí               |
| Paso a paso | Precio original por unidad: S/ 120 Descuento del 25 %: S/ 120 × 0,25 = S/ 30 Precio con descuento: S/ 120 − S/ 30 = S/ 90 IGV del 18 % sobre el precio con descuento: S/ 90 × 0,18 = S/ 16,20 Total por unidad: S/ 90 + S/ 16,20 = S/ 106,20 Total por 3 unidades: S/ 106,20 × 3 = S/ 318,60 | Sí                        | Sí               |

La respuesta para ver el razonamiento es util por que de esta manera nosotros podemos ver de que manera al I.A esta abordando el problema y podemos ver como lo esta resolviendo.

## Ejercicio 4: Role prompting

| Version        | Vocabulario (sencillo/tecnico) | Usa ejemplos o codigo | A quien le sirve mas                                     |
| -------------- | ------------------------------ | --------------------- | -------------------------------------------------------- |
| A. Sin rol     | Sencillo                       | Sí                    | Para aquellos que no tienen conocimiento de programación |
| B. Rol docente | Sencillo                       | Sí                    | Para todos                                               |
| C. Rol senior  | Técnico                        | Sí                    | Programadores                                            |

## Ejercicio 5: Descomposicion

```Text
1.-En el primer paso me dio los pasos con los requisitos principales que debería tener la tienda. A diferencia del prmpt general en el cual de frente se hecho a ejecutar.
```

```Text
2.-En el segundo paso diseño los atributos y me explico cada registro. A diferencia del prompt general que quiso implementar código con pasos distintos a lo que ahora le indico.
```

```Text
En el otro paso se puso a implementar los atributos, constructor y los métodos set y get. A diferencia con el prompt general que lo hizo de otra menera que no se entendía.
```

## Ejercicio 6: Prompt estructurado y autocritica

| Qué revisar                                      | Cumple (Sí / No) |
| ------------------------------------------------ | ---------------- |
| ¿Tiene las 4 columnas pedidas?                   | Sí               |
| ¿Incluye el bloqueo después de 3 intentos?       | Sí               |
| ¿Incluye casos con campos vacíos?                | Sí               |
| ¿Indica qué casos agregó en la autocrítica?      | Sí               |
| ¿Hay algún caso repetido o que no tenga sentido? | No               |

```text
<rol>Actua como analista de pruebas de software.</rol>
<contexto>Login web con correo y contrasena. La cuenta se bloquea despues de 3 intentos fallidos.</contexto>
<tarea>Piensa paso a paso que puede fallar y escribe 6 casos de prueba.</tarea>
<formato>Tabla con las columnas: ID, escenario, datos de entrada, resultado esperado.</formato>
```

```text
Revisa tu tabla: faltan casos limite como campos vacios, correo sin @
o contrasena con espacios? Agrega los que falten e indica cuales agregaste.
```

- [Bitacora de tecnicas avanzadas](prompts/bitacora.md)
