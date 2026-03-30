# Veterinaria
# 🐾 Sistema de Gestión Veterinaria - Java 21

Este proyecto es una aplicación de consola desarrollada en **Java 21** que simula el flujo de trabajo de una clínica veterinaria. El sistema gestiona de manera eficiente la relación entre propietarios, mascotas, veterinarios y las consultas clínicas con sus respectivos medicamentos.

## 🚀 Requisitos del Proyecto Cumplidos

Según los lineamientos técnicos, el sistema integra:

* **Encapsulamiento:** Atributos privados con acceso mediante métodos *Getters* y *Setters*.
* **Constructores Parametrizados:** Todas las clases cuentan con constructores para inicialización directa.
* **Manejo de Colecciones (`ArrayList`):** * **Lista de Mascotas:** Un propietario puede tener múltiples mascotas vinculadas.
    * **Lista de Medicamentos:** Una consulta puede generar múltiples recetas.
* **Relaciones POO:**
    * **Agregación:** Propietario -> Mascotas.
    * **Composición:** Consulta -> Medicamentos.
    * **Asociación:** Consulta -> Veterinario.
* **Arquitectura:** Clases organizadas dentro del paquete `models`.
*  ## 🏗️ Diagrama de Clases (Lógica de Relaciones)

A continuación se muestra la arquitectura del sistema y cómo se relacionan las entidades:

![Diagrama de Clases](veterinaria(3).png)

1.  **Herencia (Generalización):** `Mascota` extiende de `Animal`.
2.  **Agregación:** `Propietario` posee una lista de `Mascotas`.
3.  **Composición:** `Consulta` es dueña de su lista de `Medicamentos`.
4.  **Asociación:** `Consulta` referencia a un `Veterinario` y a una `Mascota`.

## 📁 Estructura del Código

```text
src/
├── Main.java                 # Clase principal con el flujo del programa
└── models/                   # Paquete de modelos de datos
    ├── Propietario.java      # Datos del cliente y lista de mascotas
    ├── Mascota.java          # Datos del animal y vínculo con dueño
    ├── Veterinario.java      # Datos del médico y especialidad
    ├── Consulta.java         # Registro de atención y lista de medicinas
    └── Medicamento.java      # Detalle del fármaco y dosis






