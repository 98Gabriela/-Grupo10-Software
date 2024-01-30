# -Grupo10-Software
Implementación del backend de la aplicación cajero automatico, utilizando frameworks: Springboot y Java..............


# REQUISITOS
SPRING BOOT
REACT
MYSQL WORBENCH
#EN EL FRONT DE REACT INSTALAR
npm install axios

# REQUERIMIENTOS
 Requerimientos Funcionales
1.1.1.Configuración
1.1.1.1. Usuarios y perfiles de acceso.
Define los diferentes roles de usuario que tendrán acceso al sistema.
Especifica los permisos y privilegios asociados con cada perfil.
Configura la autenticación y autorización del sistema.
1.1.1.2. Plan de cuentas.
Establece la estructura de cuentas y categorías que se utilizarán en el sistema.
Define cómo se clasificarán y organizarán las transacciones financieras.
1.1.1.3. Parámetros generales.
Configura los ajustes generales del sistema.
Incluir configuraciones como la moneda predeterminada, formato de fecha, configuración regional, etc.
1.1.2.Socios
1.1.2.1. Información general del socio.
Recopila y almacena datos básicos sobre los socios.
Incluir información como nombre, dirección, número de identificación, entre otros.
Facilita el acceso rápido a detalles clave sobre cada socio.
1.1.2.2. Creación de cuentas.
Permite la creación de cuentas asociadas a cada socio.
Define los tipos de cuentas disponibles para los socios (cuentas de ahorro, cuentas corrientes).
Asocia las cuentas creadas con la información general del socio.
1.1.3.Aportaciones
1.1.3.1. Tipo de aportaciones
Define los distintos tipos de aportaciones que pueden realizarse.
Puede incluir categorías como aportaciones regulares, extraordinarias, voluntarias, etc.
1.1.3.2. Depósitos de ahorros.
Permite a los socios realizar depósitos en sus cuentas de ahorros.
Registra la información asociada a cada depósito, como la fecha, el monto y cualquier detalle adicional.
1.1.3.3. Retiros de ahorros.
Facilita a los socios retirar fondos de sus cuentas de ahorros.
Registra la información correspondiente a cada retiro, incluyendo fecha, monto y detalles adicionales
si es necesario.
1.1.3.4. Depósitos de aportaciones.
Permite a los socios realizar depósitos específicamente destinados a sus aportaciones.
Registra la información relacionada con estos depósitos, como fecha, monto y detalles relevantes.
1.1.3.5. Retiros de aportaciones.
Facilita a los socios retirar fondos específicamente de sus aportaciones.
Registra la información correspondiente a cada retiro de aportaciones.
1.1.3.6. Servicio web que, mediante la cédula y número de cuenta, retorne los
últimos 3 movimientos en conjunto con el saldo actual.
Desarrolla un servicio web que permita a los socios consultar sus últimos 3 movimientos y el saldo
actual.
Utiliza la cédula y el número de cuenta como parámetros de entrada para identificar al socio.
Proporciona una interfaz segura y eficiente para acceder a esta información.
1.1.4.Créditos
1.1.4.1. Solicitud y aprobación de créditos.
Establece un proceso para que los socios puedan solicitar créditos.
Define los criterios de evaluación y aprobación de solicitudes de crédito.
Registra la información relevante asociada a cada solicitud y su estado (aprobado, pendiente,
rechazado).
1.1.4.2. Tablas de amortización.
Crea tablas de amortización para cada crédito aprobado.
Establece las condiciones de pago, tasas de interés y plazos.
Facilita el cálculo de las cuotas periódicas y muestra el desglose de pagos.
1.1.4.3. Entrega de créditos.
Implementa un proceso para la entrega efectiva de los créditos aprobados.
Registra la fecha y el monto entregado a cada socio.
1.1.4.4. Registro de pago de cuotas.
Permite a los socios realizar pagos de cuotas de crédito.
Registra la información de cada pago, incluyendo la fecha, monto y cualquier detalle adicional.
Actualiza automáticamente el saldo pendiente y el estado del crédito.
1.1.5.Ingresos y Egresos
1.1.5.1. Cada transacción de Ingreso / Egreso se registra en el diario de la caja.
Cada transacción de Ingreso o Egreso debe ser registrada en el diario de la caja.
El registro debe incluir detalles clave como la fecha, descripción de la transacción, monto y cualquier
referencia adicional necesaria.
1.1.5.2. El sistema envía automáticamente cada transacción a las cuentas
contables correspondientes.
Desarrolla un sistema que envíe automáticamente cada transacción registrada a las cuentas contables
correspondientes.
Asocia cada tipo de transacción (Ingreso o Egreso) con las cuentas contables apropiadas.
Garantiza la coherencia y la precisión en la contabilidad, manteniendo un rastro claro de cada
transacción.
1.1.6.Reportes
1.1.6.1. Libro Diario.
Genera un informe que muestre todas las transacciones financieras registradas en el diario de la caja.
Incluye detalles como la fecha, descripción, monto, tipo de transacción (Ingreso/Egreso), y cuenta
contable asociada.
1.1.6.2. Historial de Ahorros.
Proporciona un informe que detalla el historial de transacciones relacionadas con las cuentas de ahorros
de los socios.
Incluye depósitos, retiros y saldos actuales de las cuentas de ahorros.
1.1.6.3. Cartera de Créditos.
Genera un informe que muestra el estado actual de la cartera de créditos.
Incluye detalles sobre los créditos pendientes, pagos realizados y saldos pendientes.
1.1.6.4. Resumen de Aportaciones.
Presenta un informe resumido de las aportaciones realizadas por los socios.
Puede incluir detalles como tipos de aportaciones, montos totales, y saldos acumulados.
3.2. Requerimientos No Funcionales
Seguridad: El sistema debe garantizar la seguridad de la información confidencial y financiera de los
usuarios, implementando medidas de encriptación, autenticación segura, protección contra ataques
cibernéticos y cumplimiento de estándares de seguridad establecidos.
Disponibilidad: El sistema debe estar disponible de manera confiable y constante, con un tiempo de
actividad alto y un mínimo de interrupciones planificadas o no planificadas. Debe contar con una
infraestructura robusta y redundante para garantizar la continuidad del servicio.
Rendimiento: El sistema debe ser capaz de procesar transacciones y consultas de manera rápida y
eficiente, garantizando tiempos de respuesta óptimos incluso bajo altas cargas de trabajo. Debe estar
dimensionado adecuadamente para manejar la demanda esperada de usuarios.
Usabilidad: El sistema debe ser fácil de usar, intuitivo y con una interfaz de usuario amigable. Debe ser
accesible para diferentes niveles de habilidad tecnológica, con instrucciones claras y ayuda contextual
disponible cuando sea necesario.
Escalabilidad: El sistema debe ser escalable, lo que significa que debe ser capaz de crecer y adaptarse
a medida que aumenta el número de usuarios y las transacciones. Debe tener la capacidad de manejar
un volumen creciente de datos y garantizar un rendimiento constante.
Interoperabilidad: El sistema debe ser capaz de interoperar con otros sistemas y servicios, como redes
de pagos, sistemas bancarios o plataformas de terceros. Debe seguir estándares y protocolos de
integración aceptados para facilitar la comunicación y el intercambio de datos.
Cumplimiento normativo: El sistema debe cumplir con las regulaciones y normativas financieras y de
protección al consumidor vigentes. Debe estar actualizado con los requisitos legales y asegurar que las
transacciones y operaciones realizadas cumplan con los estándares establecidos
Mantenibilidad: El sistema debe ser mantenible y fácil de actualizar. Debe permitir la implementación
de correcciones de errores, mejoras funcionales y actualizaciones de seguridad sin afectar
significativamente la disponibilidad y el rendimiento del sistema
# DISEÑO
DESCRIPCIÓN DEL DISEÑO
Arquitectura del sistema: El diseño del sistema debe considerar una arquitectura sólida y escalable.
Puede seguir un enfoque de arquitectura cliente-servidor, donde los usuarios acceden al sistema a través
de interfaces de cliente, que se conectan a un servidor centralizado que almacena y procesa los datos.
También se pueden considerar enfoques de arquitectura basados en la nube, que ofrecen flexibilidad y
escalabilidad.
Interfaz de usuario: El diseño de la interfaz de usuario debe ser intuitivo, fácil de usar y atractivo
visualmente. Debe permitir a los usuarios acceder a las funcionalidades principales del sistema de
manera clara y eficiente. Se deben utilizar elementos de diseño centrados en el usuario, como menús
desplegables, formularios de entrada de datos claros y botones de acción visibles.
Seguridad: El diseño del sistema debe incluir medidas sólidas de seguridad para proteger la información
confidencial y financiera de los usuarios. Esto puede incluir técnicas de encriptación para proteger la
comunicación, autenticación de usuarios mediante contraseñas seguras o métodos biométricos, y
auditoría de actividades para detectar y prevenir cualquier actividad sospechosa.
Diseño responsivo: El sistema debe tener un diseño responsivo que se adapte a diferentes dispositivos
y tamaños de pantalla. Esto permitirá a los usuarios acceder y utilizar el sistema desde computadoras
de escritorio, portátiles, tabletas o teléfonos inteligentes, asegurando una experiencia consistente y fácil
de usar en todos los dispositivos.
Personalización: El diseño del sistema puede permitir cierto nivel de personalización para los usuarios,
como la posibilidad de configurar preferencias de visualización, establecer notificaciones
personalizadas o adaptar la interfaz a sus necesidades específicas. Esto ayuda a mejorar la experiencia
del usuario y brinda un sentido de control sobre el sistema.
Integración con servicios externos: El diseño del sistema puede contemplar la integración con servicios
externos, como sistemas de pago, plataformas bancarias o herramientas de análisis financiero. Esto
permitirá a los usuarios aprovechar funcionalidades adicionales y facilitar la interacción con otros
servicios financieros.
Escalabilidad: El diseño del sistema debe ser escalable para adaptarse al crecimiento futuro. Debe tener
la capacidad de manejar un aumento en el número de usuarios, transacciones y datos sin comprometer
el rendimiento y la disponibilidad. Esto implica utilizar tecnologías y arquitecturas escalables y
dimensionar adecuadamente los recursos del sistema.
Documentación y soporte: El diseño del sistema debe considerar la creación de una documentación
clara y completa que describa las funcionalidades, el uso y los procedimientos del sistema. Además,
debe contemplar un sistema de soporte y asistencia para los usuarios, ya sea a través de recursos en
línea, asistencia por correo electrónico o chat en vivo.
