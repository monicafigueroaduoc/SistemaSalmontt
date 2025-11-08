## Autor del proyecto
_**Nombre completo:** Mónica Figueroa
_**Sección:** 2
_**Analista Programador Computacional**

---
## Descripción general del sistema
Este proyecto Java (desarrollado en **IntelliJ IDEA**) corresponde a la evaluación Sumativa 1 de la asignatura **Desarrollo Orientado a Objetos I**.

El sistema simula la gestión de personas dentro de la empresa **Salmontt**, aplicando programación orientada a objetos.

Se utilizan **relaciones de composición** entre clases.

El proyecto incluye las siguientes clases:
- `Persona` (Clase Principal).
- `Direccion` (Una Persona tiene una Direccion).
- `Contrato` (Una Persona tiene un Contrato).


## Estructura del proyecto

```Sistema Salmontt
|
├ .idea
├ .mvn
├ docs
├ src/
|  └main/
|   └ java/
|   |  └ org/
|   |     └ example/
|   |        ├ app/
|   |           └ Main.java
|   |        ├ model/
|   |            ├ Contrato.java
|   |            ├ Direccion.java
|   |            └ Persona.java
|   └ resources
├ test
├ target
├ .gitignore
├ pom.xml
├ README.md
```

## Instrucciones paea clonar y ejecutar el proyecto
1. Clonar el repositorio desde GitHub.
```bash
Git clone [https://github.com/monicafigueroaduoc/SistemaSalmontt.git]
```
2. Abre el proyecto en IntelliJ IDEA.
3.  Ejecutar la clase org.example.app.Main.

## Conceptos aplicados
- Encapsulamiento:
  Todos los atributos son privados y se accede a ellos a través de setters y getters.
- Composición:
  La clase Persona contiene objetos de tipo Direccion y Contrato.
- Documentación Javadoc:
  Todas las clases y métodos incluyen comentarios Javadoc con @param, @return, @link y @code.
- Organización modular:
  El proyecto está estructurado en paquetes(app y model) para mantener una arquitectura limpia.


              
    