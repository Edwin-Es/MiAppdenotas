# Mini-App Final — Técnicas de Producción Industrial de Software I 
**Profesor:** Juan José Santos
**Estudiante:** Edwin Estrada 
**Fecha:** 09/12/2025
**Reto elegido:** #2 App de notas con pantalla de detalle (Room).
 
---
 
## 📌 Descripción del proyecto
Esta aplicación es un gestor de notas simple y funcional, desarrollado con Android Jetpack Compose, arquitectura MVVM y persistencia local mediante Room.
Permite al usuario crear, visualizar, editar y eliminar notas, manteniendo toda la información guardada en el dispositivo incluso después de cerrar la app.

Está dirigida a estudiantes, profesionales y cualquier persona que necesite una herramienta ligera para organizar ideas, recordatorios o apuntes rápidos sin depender de conexión a internet.
El objetivo principal es ofrecer una experiencia clara, rápida y moderna, con una interfaz intuitiva y enfocada en productividad.

La app resuelve el problema de llevar notas de forma sencilla y accesible, evitando la complejidad de otras aplicaciones más pesadas. Gracias a su almacenamiento local y diseño minimalista, garantiza facilidad de uso, velocidad y una experiencia agradable.
 
---

## 🛠️ Tecnologías utilizadas
- Kotlin
- Android Studio (versión recomendada)
- Jetpack Compose
- Navigation Compose
- Room / DataStore (indicar cuál usaste)
- ViewModel + StateFlow/LiveData
 
---
 
## 📂 Estructura del proyecto
La aplicación está organizada siguiendo la arquitectura MVVM, lo que permite una separación clara entre lógica, datos y presentación. A continuación se describe cada uno de los paquetes principales:
📁 data/
Contiene toda la capa de acceso a datos. 
Incluye:
- Entidad Note: Representa el modelo de datos almacenado en la base local.
- DAO (NoteDao): Define las operaciones CRUD sobre la base de datos.
- Base de datos (NoteDatabase): Implementación de Room para persistencia.
- Repositorio (NoteRepository): Abstrae la lógica de acceso a datos y comunica el DAO con el ViewModel.
📁 viewmodel/
Incluye el NoteViewModel, encargado de administrar el estado de la UI y ejecutar operaciones con corrutinas.
Gestiona acciones como:
- Obtener todas las notas
- Insertar nuevas notas
- Actualizar notas existentes
- Eliminar notas
📁 ui/
Contiene los componentes base de la interfaz construida con Jetpack Compose, así como el archivo principal de navegación de la app.
📁 ui/screens/
Incluye todas las pantallas de la aplicación, cada una implementada con Jetpack Compose:
- NoteListScreen – Lista de notas con opciones para agregar, editar y abrir detalles.
- NoteEditScreen – Permite crear o actualizar una nota.
- NoteDetailScreen – Muestra el contenido completo de una nota y permite eliminarla.
 
---
 
## ▶️ Cómo ejecutar el proyecto
1. Clonar el repositorio:  
   ```bash
   https://github.com/Edwin-Es/MiAppdenotas
   ```
2. Abrir con Android Studio.
3. Sincronizar Gradle.
4. Ejecutar en emulador o dispositivo físico.
5. Si usas Room, la base de datos se genera automáticamente.
 
---
 
## 📜 Checklist de entrega
- [✅] App compila correctamente  
- [✅] Persistencia implementada  
- [✅] Navegación funcional  
- [✅] Video grabado con rostro visible  
- [✅] README completo  
- [✅] Repositorio con al menos 5 commits  
- [✅] Carpeta OneDrive creada y compartida  
 
---

## 💡 Mejoras futuras
✔️ Agregar búsqueda de notas en tiempo real
Permitirá filtrar por título o contenido mientras el usuario escribe.
✔️ Categorías o etiquetas
Para organizar notas por temas, colores o prioridades.
✔️ Notas con imágenes o archivos adjuntos
Ampliar el contenido más allá de texto simple.
✔️ Recordatorios o alarmas
Notificaciones programadas para recordar notas importantes.
✔️ Modo oscuro/tema dinámico
Basado en Material Design 3 y preferencias del usuario.
✔️ Sincronización con la nube
Para respaldar notas y acceder desde varios dispositivos.
✔️ Archivado en lugar de eliminación permanente
Función de "Papelera" para restaurar notas eliminadas.
✔️ Animaciones de navegación y transiciones más fluidas
Mejor experiencia visual al abrir, editar o eliminar notas.
✔️ Widgets para la pantalla de inicio
Acceso rápido a notas recientes sin abrir la app.
✔️ Buscador por comandos
Ej.: escribir “#hoy” para ver solo notas del día.

## 📸 Capturas de pantalla 

<img width="225" height="440" alt="Captura de pantalla #1" src="https://github.com/user-attachments/assets/f8c6a7bc-ab07-450e-9aff-71fc3f0548a8" />
<img width="225" height="440" alt="Captura de pantalla #4" src="https://github.com/user-attachments/assets/038f3cc7-45c6-447a-aa8b-f4d42cb629cf" />
<img width="225" height="440" alt="Captura de pantalla #3" src="https://github.com/user-attachments/assets/27bab6a0-e65a-4879-a777-c58ec4f55f37" />
<img width="225" height="440" alt="Captura de pantalla #2" src="https://github.com/user-attachments/assets/e37abbc9-cf48-47c1-a399-81e0884ca008" />


