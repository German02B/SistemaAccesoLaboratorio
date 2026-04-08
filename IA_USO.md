1. Prompts utilizados
Prompt 1:
“Genera las clases Java para un sistema de control de acceso a laboratorio con arquitectura en capas (Entidades, AccesoDatos, LogicaNegocio, Presentacion). Las clases deben incluir Usuario y Acceso, con atributos básicos y getters/setters.”
Prompt 2:
“Crea métodos en Java para la capa AccesoDatos que permitan guardar y leer usuarios y accesos desde archivos .txt, validando IDs duplicados.”
Prompt 3:
“Implementa la lógica de negocio para registrar entrada y salida de usuarios, validando doble entrada y salida sin ingreso previo, usando la capa LogicaNegocio.”
Prompt 4:
“Genera ejemplos de interfaz gráfica con JOptionPane para registrar usuarios y accesos, y mostrar reportes de historial y tiempo total en el laboratorio.”
Prompt 5:
“Explica cómo estructurar commits claros en GitHub y cómo crear un repositorio público para el proyecto, integrando buenas prácticas de control de versiones.”

2. Qué parte resolvió cada prompt
Prompt	Parte que resolvió
Prompt 1	Proporcionó la estructura base de las clases Usuario y Acceso y la separación inicial de capas.
Prompt 2	Entregó métodos para leer/escribir en .txt, verificación de IDs duplicados y persistencia básica de datos.
Prompt 3	Proporcionó funciones para registrar entrada/salida, manejo de errores por doble ingreso o salida sin entrada, y cálculo de tiempo total en el laboratorio.
Prompt 4	Generó ejemplos de ventanas con JOptionPane para agregar usuarios, registrar accesos y mostrar reportes.
Prompt 5	Explicó cómo hacer commits claros (feat, fix, docs) y estructurar el repositorio en GitHub.

3. Ajustes realizados manualmente
Ajusté nombres de variables y métodos para que fueran más descriptivos (ej. fechaHoraIngreso en vez de fh).
Modifiqué la ruta de los archivos .txt para que funcionara correctamente en NetBeans.
Añadí validaciones adicionales en LogicaNegocio para manejar casos límite (por ejemplo, ingreso de usuario inexistente).
Mejoré los mensajes en JOptionPane para mayor claridad para el usuario.
Realicé pruebas de integración entre capas y corregí errores de lectura/escritura en archivos grandes.
Creé commits claros en GitHub siguiendo el estándar de mensajes y control de versiones recomendado.

4. Justificación técnica del uso de IA
Eficiencia en diseño inicial: La IA ayudó a generar rápidamente las clases base y la estructura de capas, ahorrando tiempo en la fase inicial.
Evitar errores de sintaxis: Los métodos de persistencia en archivos .txt fueron complejos de implementar a mano; la IA proporcionó plantillas correctas que luego se ajustaron.
Apoyo en validaciones: La lógica de negocio para evitar doble entrada o salida sin ingreso fue inicialmente compleja; la IA propuso una solución base que fue adaptada.
Aprendizaje y guía: La IA funcionó como mentor de buenas prácticas en Java, sugerencias de commits y estructura de repositorio.
No se copió ni se pegó solución completa: Cada prompt resolvió solo una parte; los ajustes y la integración final fueron 100% realizados manualmente.
