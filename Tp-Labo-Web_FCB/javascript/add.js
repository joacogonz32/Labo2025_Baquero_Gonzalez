const express = require('express')
const app = express()
const port = 3000
const bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json())

app.get('/insertar', (req, res) => {
    let nombre = (req.query.nombre);
    let apellido = (req.query.apellido);
    let mail = (req.query.mail);
    let dni = (req.query.dni);
    let pais = (req.query.pais);
    let planElegido = (req.query.planElegido);
    var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'alumno',
  password : 'alumnoipm',
  database : 'PaginaBarcelona'
});
console.log(nombre);
connection.connect();
 
connection.query("insert into Inscripcion values(null,'"+nombre+"','"+apellido+"',"+dni+",'"+pais+"','"+planElegido+"','"+mail+"')" , function (error, results, fields) {
  if (error) throw error;
  // agregar q vuelva a la pagina inicio
  res.redirect("http://127.0.0.1:5500/html/index.html");
});
 
connection.end();
})
app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})