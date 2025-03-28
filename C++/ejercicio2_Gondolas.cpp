#include <iostream>
#include <string>

using namespace std;

struct Producto {
    string nombre;
    string codigoBarra;
    string marca;
    float precio;
    bool tieneFechaVencimiento;
};

void ingresarProductos(Producto pasillo[3][4], int &totalProductos, float &sumaPrecios, int &productosConFechaVencimiento) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            cout << "Ingrese el nombre del producto [" << i + 1 << "][" << j + 1 << "]: ";
            cin >> pasillo[i][j].nombre;
            cout << "Ingrese el código de barra del producto: ";
            cin >> pasillo[i][j].codigoBarra;
            cout << "Ingrese la marca del producto: ";
            cin >> pasillo[i][j].marca;
            cout << "Ingrese el precio del producto: ";
            cin >> pasillo[i][j].precio;
            cout << "¿Tiene fecha de vencimiento? (1: Sí, 0: No): ";
            cin >> pasillo[i][j].tieneFechaVencimiento;
            sumaPrecios += pasillo[i][j].precio;
            totalProductos++;
        }
    }
}

int columnaMayorPrecio(Producto pasillo[3][4]) {
    int columnaMayor = 0;
    float mayorPrecio = pasillo[0][0].precio;

    for (int j = 0; j < 4; j++) {
        for (int i = 0; i < 3; i++) {
            if (pasillo[i][j].precio > mayorPrecio) {
                mayorPrecio = pasillo[i][j].precio;
                columnaMayor = j;
            }
        }
    }
    return columnaMayor;
}

float calcularPromedio(float sumaPrecios, int totalProductos) {
    return sumaPrecios / totalProductos;
}

int main() {
    Producto pasillo[3][4];
    int totalProductos = 0;
    float sumaPrecios = 0.0;
    int productosConFechaVencimiento = 0;
    ingresarProductos(pasillo, totalProductos, sumaPrecios, productosConFechaVencimiento);
    int columnaMayor = columnaMayorPrecio(pasillo);
    string nombreFila2Col3 = pasillo[1][2].nombre; 
    float promedioPrecios = calcularPromedio(sumaPrecios, totalProductos);
    cout << "Columna con el precio más alto: " << columnaMayor + 1 << endl; 
    cout << "Nombre del producto en fila 2, columna 3: " << nombreFila2Col3 << endl;
    cout << "Promedio de precios: " << promedioPrecios << endl;
    cout << "Cantidad de productos con fecha de vencimiento: " << productosConFechaVencimiento << endl;

    return 0;
}