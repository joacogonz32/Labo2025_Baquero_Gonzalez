#include <iostream>
#include <fstream>
#include <vector>
#include <string>
using namespace std;

struct Producto_t
{
    int codigo;
    string nombre;
    float precio;
};

struct Pedido_t{
    string nombreCliente;
    int numeroPedido;
    int cantidad;
    float precioTotal;
    vector <Producto_t> vector_productos;
    bool estado;
};

Producto_t ConseguirProd(int numero, vector <Producto_t> vector_productos){
    Producto_t producto_t;
    for (int i = 0; i < vector_productos.size(); i++){
        if(vector_productos[i].codigo == numero){
            return vector_productos[i];
        }
    }
}

void AgregarPedido(vector <Producto_t> &productos ,vector <Pedido_t> &pedidos){
    int aux = 1;
    Pedido_t pedido_t;
    Producto_t producto_t;
    cout << "Ingresar nombreCliente: " << endl;
    cin >> pedido_t.nombreCliente;

    cout << "Ingresar numero del pedido: " << endl;
    cin >> pedido_t.numeroPedido;

    cout << "ingrese nro prod para agreagar, 0 para no agregar";
    cin >> aux;

    while(aux != 0){
        pedido_t.vector_productos.push_back(ConseguirProd(aux,productos));
        cout << "Ingresar cantidad de productos: " << endl;
        cin >> pedido_t.numeroPedido;
        cout << "Ingresar precio del producto: " << endl;
        cin >> producto_t.precio;
    }
}
void MostrarPedido(vector <Pedido_t> &pedidos,vector <Producto_t>&productos){
    int precioT;
    Pedido_t pedido;
    Producto_t producto;
    for(int i = 0; i < pedidos.size();i++){
        if(pedido.estado){
            precioT = pedido.cantidad * producto.precio;
            cout << precioT;
        }
    }
}

void CancelarPedido(vector <Pedido_t> &pedidos){
    int aux;
    Pedido_t pedido;
    cout << "ingrese el nro pedido que quiere cancelar: ";
    cin >> aux;
    for(int i = 0; i < pedidos.size();i++){
        if(aux == pedido.numeroPedido){
            pedido.estado = false;
        }
    }
}
int main(){
 vector<Producto_t> vector_productos = {
    (1, "Fideos", 2000),
    (2, "Cereales", 2000),
    (3, "Galletas", 2000)
    };
    vector <Pedido_t> vector_pedidos;
    int opcion;
    cout << "1.Nuevo Pedido -2.Cancelar Pedido -3.Mostrar Pedido";
    cout << "Ingrese que quiere realizar: ";
    cin >> opcion;

    switch(opcion){
        case 1:AgregarPedido;
        case 2:CancelarPedido;
        case 3:MostrarPedido;
    }
}