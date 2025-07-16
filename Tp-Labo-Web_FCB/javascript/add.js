const express = require('express')
const app = express()
const port = 3000
const bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json())

app.get('/insertar', (req, res) => {
    let nombre = (req.query.nombreCompleto);
    let apellido = (req.query.mail);
    let edad = (req.query.dni);
    let pais = (req.query.pais);
    let planElegido = (req.query.planElegido);
    var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'alumno',
  password : 'alumnoipm',
  database : 'PaginaBarcelona'
});
 
connection.connect();
 
connection.query("insert into Inscripcion values(null,'"+nombreCompleto+"','"+mail+"',"+dni+",'"+pais+"','"+planElegido+"')" , function (error, results, fields) {
  if (error) throw error;
  // agregar q vuelva a la pagina inicio
  res.send("Inscripccion realizada");
});
 
connection.end();
})
app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})