#include <iostream>
#include <fstream>
#include <vector>
#include <string>
using namespace std;

struct Producto_t {
    string nombreProducto;
    bool promocion;
    int cantidadVentas;
    float precio;
    string categoria;
};

struct Pedido_t {
    string nombreCliente;
    string fecha;
    float precioTotal;
};

struct Carrito_t {
    string nombreProducto;
    int cantidadDeProducto;
};

struct FechaPedido_t {
    int anio;
    int mes;
    int dia;
};

void descuentoProducto(vector<Producto_t> menu_mcdonalds){
    Carrito_t carrito_t;
    Producto_t producto_t;
    for (int i = 0; i < menu_mcdonalds.size(); i++)
    {
        if (carrito_t.nombreProducto == producto_t.nombreProducto and producto_t.promocion == true)
        {
            producto_t.precio = producto_t.precio * 0.8;
        }
    }
}

void registrarPedido(vector<Pedido_t> &pedidosRealizados, vector<Producto_t> menu_mcdonalds, Carrito_t){
    string producto;
    Producto_t producto_t;
    Pedido_t pedido_t;
    cout << "Ingresar tu nombre: ";
    getline(cin, pedido_t.nombreCliente);
    for (int e = 0; e < menu_mcdonalds.size(); e++)
    {
        cout << menu_mcdonalds[e].nombreProducto << "" << endl;
        cout << menu_mcdonalds[e].promocion << "" << endl;
        cout << menu_mcdonalds[e].cantidadVentas << "" << endl;
        cout << menu_mcdonalds[e].precio << "" << endl;
        cout << menu_mcdonalds[e].categoria << "" << endl;
        cout << "Ingresar productos a pedir (para terminar, /salir): ";
        getline(cin, producto);
        for (int r = 0; r < productosPedidos.size(); r++)
        {
            while (producto != "/salir" and menu_mcdonalds[e].nombreProducto == producto)
            {
                pedido_t.productosPedidos[r].push_back(producto);
            }
            for (int z = 0; z < cantidadPorProducto.size(); z++)
            {
                cout << "El precio total del pedido es: " << productosPedidos[r].precio * cantidadPorProducto[z];
                cin >> pedido_t.precioTotal;
            }
        }
        pedidosRealizados.push_back(pedido_t);
    }
}

Pedido_t consultarPedido(vector<Pedido_t> pedidosRealizados, vector<Producto_t> productosPedidos, vector<int> cantidadPorProducto){
    Pedido_t pedido_t;
    string aux_nombreCliente;
    cout << "Buscar pedido por nombre de cliente: ";
    getline(cin, aux_nombreCliente);
    for (int d = 0; d < pedidosRealizados.size(); d++)
    {
        for (int r = 0; r < productosPedidos.size(); r++)
        {
            for (int z = 0; z < cantidadPorProducto.size(); z++)
            {
                if (aux_nombreCliente == pedido_t.nombreCliente)
                {
                    cout << pedidosRealizados[d].nombreCliente << "" << endl;
                    cout << pedidosRealizados[d].productosPedidos[r].nombreProducto << "" << endl;
                    cout << pedidosRealizados[d].productosPedidos[r].promocion << "" << endl;
                    cout << pedidosRealizados[d].productosPedidos[r].precio << "" << endl;
                    cout << pedidosRealizados[d].productosPedidos[r].categoria << "" << endl;
                    cout << pedidosRealizados[d].cantidadPorProducto[z] << "" << endl;
                    cout << pedidosRealizados[d].fecha << "" << endl;
                    cout << pedidosRealizados[d].precioTotal << "" << endl;
                }
                else{
                    cout << "No se encontro el pedido de" << aux_nombreCliente << "." << endl;
                }
            }
        }
    }
}

Producto_t ventasMayor_Menor(vector<Producto_t> &productosPedidos){
    
}

int main() {
    vector<Producto_t> menu_mcdonalds = {
        {"Big Mac", false, 0, 2500.0, "Hamburguesa"},
        {"Cuarto de Libra", false, 0, 2700.0, "Hamburguesa"},
        {"Grand Tasty", true, 0, 4000.0, "Hamburguesa"},
        {"McNuggets", false, 0, 2500.0, "Acompañamiento"},
        {"Papas Medianas", false, 0, 1500.0, "Acompañamiento"},
        {"Papas Grandes", true, 0, 2000.0, "Acompañamiento"},
        {"Coca-Cola", false, 0, 1200.0, "Bebida"},
        {"Sprite", false, 0, 1200.0, "Bebida"},
        {"Fanta", false, 0, 1200.0, "Bebida"},
        {"Agua", false, 0, 1000.0, "Bebida"},
        {"Sundae Chocolate", true, 0, 1700.0, "Postre"},
        {"Sundae Dulce de Leche", true, 0, 1700.0, "Postre"},
        {"McFlurry Oreo", false, 0, 2200.0, "Postre"},
        {"McFlurry Rocklets", false, 0, 2200.0, "Postre"},
        {"Hamburguesa Simple", true, 0, 2000.0, "Hamburguesa"},
        {"Grand Tasty Turbo Bacon", false, 0, 4300.0, "Hamburguesa"},
        {"Doble Cuarto de Libra", false, 0, 3500.0, "Hamburguesa"},
        {"Ensalada Caesar", false, 0, 2800.0, "Acompañamiento"},
        {"Cafe", false, 0, 1500.0, "Bebida"},
        {"Tarta de Manzana", true, 0, 1800.0, "Postre"}
    };

    vector<Pedido_t> pedidosRealizados;
    return 0;
}
