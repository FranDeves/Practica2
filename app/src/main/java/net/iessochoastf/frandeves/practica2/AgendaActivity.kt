package net.iessochoastf.frandeves.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AgendaActivity : AppCompatActivity() {

    private lateinit var btAceptar: Button
    private lateinit var btCancelar: Button
    private lateinit var tvContacto: TextView
    private lateinit var etNombre: EditText
    private lateinit var etApellidos: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

       //Buscamos los views
        btAceptar = findViewById(R.id.btAceptar)
        btCancelar = findViewById(R.id.btCancelar)
        tvContacto = findViewById(R.id.tvContacto)
        etNombre = findViewById(R.id.etNombre)
        etApellidos = findViewById(R.id.etApellidos)


       btAceptar.setOnClickListener{Copia()}
       btCancelar.setOnClickListener { Cerrar() }



    }

   fun Copia() {

     //   tvContacto.text = etNombre.text


       val nombre = etNombre.text.toString()
       val apellidos = etApellidos.text.toString()

      // val nombreCompleto = "$nombre $apellidos"
      // tvContacto.text = nombreCompleto

       //if (nombre.isEmpty() || apellidos.isEmpty()) {
       if (etNombre.text.toString().isEmpty() || etApellidos.text.toString().isEmpty()) {
           // Mostrar un mensaje de aviso si algún campo está vacío
           Toast.makeText(this, getString(R.string.Necesario),Toast.LENGTH_LONG).show()
       }
       else
       {
           val nombreCompleto = "$nombre $apellidos"
           tvContacto.text = nombreCompleto
       }


    }

    fun Cerrar()
    {

        btCancelar.setOnClickListener() { finish() }

    }



}