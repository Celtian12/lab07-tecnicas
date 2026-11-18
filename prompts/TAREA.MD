# Tarea: Mi prompt avanzado

## Tarea elegida

```text
diseñar las clases de un sistema de notas
```

## Version 1: prompt basico

```text
Diseña las clases de un sistema de notas
```

## Version 2

```text
Quiero diseñes las clases de un sistema de notas
```

```text
Las clases implementadas deben ser didacticas y optimizadas
```

```text
Además de ello ten en cuenta el uso de comentarios y el código optimizado asi como la explicación del paso a paso
```

## Version 3: prompt final

```text
<rol>Actua como un experto diseñador y programador experto en clases.</rol>
<contexto>Implementación del diseño de clases.</contexto>
<tarea>Piensa paso a paso que puede implemetar y escribelo.</tarea>
<formato>Implementación con comentarios del paso a paso didactica de las clases.</formato>
```

## Prompt mejorado

```text
<rol>
Actúa como un diseñador experto en arquitecturas orientadas a objetos y como un programador especializado en el diseño e implementación de clases.
</rol>

<contexto>
Debes implementar el diseño de clases de una solución de software que siga principios SOLID, sea mantenible y permita separar responsabilidades.
</contexto>

<tarea>
Analiza el problema paso a paso y explica:

1. Las clases necesarias.
2. Los atributos y métodos de cada clase.
3. Las relaciones entre las clases.
4. Los principios SOLID aplicados.
5. La implementación completa del código.
6. Ejemplos sencillos de uso.

Primero presenta el razonamiento didáctico y después proporciona el código final organizado.
</tarea>

<formato>
- Explica cada decisión antes de mostrar su implementación.
- Incluye comentarios didácticos dentro de las clases.
- Utiliza nombres claros y consistentes.
- Agrega ejemplos de instanciación y ejecución.
- Indica las posibles extensiones o mejoras.
- Especifica el lenguaje de programación antes de responder.
</formato>

```

| Tecnicas Usadas    | Parte del promt final                                            |
| ------------------ | ---------------------------------------------------------------- |
| Chain of Thought   | Piensa paso a paso que puede implemetar y escribelo              |
| ROL                | Actua como un experto diseñador y programador experto en clases  |
| Pedido paso a paso | Actua como un..., Piensa paso a paso..., implementa y escribelo. |

## Tecnicas usadas en el prompt final

La tecnicas usadas fueron del paso a paso asi como Chain of Thought, asi como el ROL indicando a el prompt que tome el rol de experto en diseño y programción.

## Evaluacion del resultado

| Qué revisar                                        | Cumple (Sí/No) |
| -------------------------------------------------- | -------------- |
| Dió el paso a paso de la implemetación             | Sí             |
| Analizo el problema paso a paso y explico          | Sí             |
| Se mostró un ejemplo completo de la implementación | Sí             |
| Se dió unos ejemplos de mejora de código           | Sí             |

## Por que elegi estas tecnicas

Chain of Thought y el prompt estucturado con el paso a paso se dieron porque considero que estas técnicas son las más útiles para la implementación de un prompt para un proyecto como el que implementé
