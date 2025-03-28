#include <iostream>
#include <vector>
#include <string>
using namespace std;

struct Jugador_t {
    string nombre;
    bool esArquero;
};

struct Equipo_t {
    string nombre;
    vector<Jugador_t> jugadores;
    int golesAFavor = 0;
    int golesEnContra = 0;
    int puntos = 0;
    char historialPartidos;
    int posicion;
};

struct Fecha_t {
    int dia;
    int mes;
    int anio;
};

struct Partido_t {
    string equipoLocal;
    string equipoVisitante;
    int golesLocal;
    int golesVisitante;
    Fecha_t fecha;
    string estadio;
};

void registrarPartido (vector<Equipo_t> &equipos, vector<Partido_t> &partidos, string local, string visitante, int golesLocal, int golesVisitante, string fecha, string estadio){

}

int main (){
    vector<Equipo_t> equipos = {
        {"River Plate", {}, 0, 0, 0, ""},
        {"Boca Juniors", {}, 0, 0, 0, ""},
        {"Racing Club", {}, 0, 0, 0, ""},
        {"Independiente", {}, 0, 0, 0, ""},
        {"San Lorenzo", {}, 0, 0, 0, ""},
        {"Huracán", {}, 0, 0, 0, ""},
        {"Estudiantes", {}, 0, 0, 0, ""},
        {"Gimnasia", {}, 0, 0, 0, ""},
        {"Vélez Sarsfield", {}, 0, 0, 0, ""},
        {"Argentinos Juniors", {}, 0, 0, 0, ""},
        {"Lanús", {}, 0, 0, 0, ""},
        {"Banfield", {}, 0, 0, 0, ""},
        {"Rosario Central", {}, 0, 0, 0, ""},
        {"Newell's Old Boys", {}, 0, 0, 0, ""},
        {"Tigre", {}, 0, 0, 0, ""},
        {"Defensa y Justicia", {}, 0, 0, 0, ""},
        {"Godoy Cruz", {}, 0, 0, 0, ""},
        {"Atlético Tucumán", {}, 0, 0, 0, ""},
        {"Colón", {}, 0, 0, 0, ""},
        {"Unión", {}, 0, 0, 0, ""},
        {"Platense", {}, 0, 0, 0, ""},
        {"Barracas Central", {}, 0, 0, 0, ""},
        {"Sarmiento", {}, 0, 0, 0, ""},
        {"Central Córdoba", {}, 0, 0, 0, ""}
    };
    vector<Partido_t> partidos;
    registrarPartido();

}