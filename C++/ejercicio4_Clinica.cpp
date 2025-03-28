#include <iostream>
#include <fstream>
#include <vector>
#include <string>
using namespace std;
struct Fecha_t
{
    int dia;
    int mes;
    int año;
};

struct Paciente_t
{
    string nombre;
    int edad;
    int numeroHistClinica;
    Fecha_t fechaproximacita;
};

Paciente_t RegistroPacientes(vector<Paciente_t> &vecPaciente){
    Paciente_t paciente_t;
    cout << "Ingresar nombre: " << endl;
    cin >> paciente_t.nombre;
    cout << "ingrese edad: " << endl;
    cin >> paciente_t.edad;
    cout << " ingrese numero de historia clinica: ";
    cin >> paciente_t.numeroHistClinica;
    cout << "ingrese dia: ";
    cin >> paciente_t.fechaproximacita.dia;
    cout << "ingrese mes: ";
    cin >> paciente_t.fechaproximacita.mes;
    cout << "ingrese año: ";
    cin >> paciente_t.fechaproximacita.año; 
    vecPaciente.push_back(paciente_t);
    };

void CancelarCita(vector<Paciente_t> &vecPaciente){
    int borrado;
    int auxiliar;
    cout << "numero de historia clinica: " << endl;
    cin >> auxiliar;
    for(int i = 0; i < vecPaciente.size();i++){
        if(vecPaciente[i].numeroHistClinica == auxiliar){
        borrado = i;
        }
    }
    vecPaciente(vecPaciente.begin() + borrado);
}  

Paciente_t MostrarCita(vector<Paciente_t> &vecPaciente){
    Paciente_t paciente_t;
    int auxDia;
    int auxMes;
    int auxAño;
    int contador = 0;
    cout << "De que año quiere ver las citas? " << endl;
    cin >> auxAño;
    cout << "De que mes quiere ver las citas? " << endl;
    cin >> auxMes;
    cout << "De que dia quiere ver las citas? " << endl;
    cin >> auxDia;
    for(int i = 0; i < vecPaciente.size();i++){
        if(vecPaciente[i].fechaproximacita.dia == auxDia and vecPaciente[i].fechaproximacita.mes == auxMes and vecPaciente[i].fechaproximacita.año == auxAño){
            contador++;
            cout << vecPaciente[i].nombre;
            cout << vecPaciente[i].edad;
            cout << vecPaciente[i].numeroHistClinica;
        }
        if(contador == 0){
            cout << "no hay citas ese dia";
        }
    }
}

Paciente_t InfoPaciente(vector<Paciente_t> &vecPaciente){
    int auxNro;
    int contador = 0;
    cout << "ingrese el numero de historia clinica del paciente: ";
    cin >> auxNro;
    for(int i = 0; i < vecPaciente.size(); i++){
        if(vecPaciente[i].numeroHistClinica == auxNro){
            contador++;
            cout << vecPaciente[i].nombre;
            cout << vecPaciente[i].edad;
            cout << vecPaciente[i].numeroHistClinica;
        }
        if(contador == 0){
            cout << "no hay citas ese dia";
        }
    }
}

int main(){
    vector <Paciente_t> vecPaciente;
    int opcion;
    do{
        cout << "1.ingresar paciente" <<endl << "2.Cancelar cita" << endl << "3.MostrarCita" << endl << "4.buscar paciente" << endl;
        cout << "ingrese opcion";
        cin >> opcion;
        switch(opcion){
            case 1: RegistroPacientes(vecPaciente);
            break;
            case 2: CancelarCita(vecPaciente);
            break;
            case 3: MostrarCita(vecPaciente);
            break;
            case 4: InfoPaciente(vecPaciente);
            break;
        }

    }while(opcion != 4);
}