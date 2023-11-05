package net.iessochoastf.frandeves.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Detalle : AppCompatActivity() {

    private lateinit var tvDetalle: TextView

    companion object {
        const val EXTRA_DATO = "practica2.DatosRecetaActivity.dato"
        const val EXTRA_TIPO = "practica2.DatosRecetaActivity.tipo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        tvDetalle = findViewById(R.id.tvDetalle)

        val intent = intent
/*
        // Verificar si el intent contiene el extra con la clave EXTRA_DATO
        if (intent.hasExtra(EXTRA_DATO)) {

            // Recuperar el texto del intent
            val datoRecibido = intent.getStringExtra(EXTRA_DATO)

            // Establecer el texto recibido en el TextView de esta actividad
            tvDetalle.text = datoRecibido
        }


 */
        val tipoRecibido = intent.getStringExtra(EXTRA_TIPO)
        val datoRecibido = intent.getStringExtra(EXTRA_DATO)


        // Concatenar ambos textos, incluso si son null
        val textoConcatenado = "$tipoRecibido\n$datoRecibido"

        // Mostrar el texto concatenado en el TextView
        tvDetalle.text = textoConcatenado

        // Agregar OnClickListener al TextView
        // Finalizar el Activity al hacer clic en el TextView
        tvDetalle.setOnClickListener {finish()}


    }
}