
// ----------Encabezado inicio de sesion cliente--------------------

// Obtener los elementos del encabezado
var fotoClienteElement = document.getElementById('foto_cliente');
var nombreClienteElement = document.getElementById('nombre_cliente');
var idClienteElement = document.getElementById('id_cliente');

// Simular datos del cliente obtenidos al iniciar sesión
var cliente = {
    foto_cliente: "img/imgeco.png",
    nombre_cliente: 'Ecomedics',
    id_cliente: "ECO"
};

// Actualizar la información del cliente en el encabezado
fotoClienteElement.src = cliente.foto_cliente;
nombreClienteElement.textContent = cliente.nombre_cliente;
idClienteElement.textContent = cliente.id_cliente;