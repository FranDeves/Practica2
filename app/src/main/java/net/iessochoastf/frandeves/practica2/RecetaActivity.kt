package net.iessochoastf.frandeves.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecetaActivity : AppCompatActivity() {

    private lateinit var tvDescripcion:TextView
    private lateinit var tvDescripcion2:TextView
    private lateinit var tvIngredientes:TextView
    private lateinit var tvIngredientes2:TextView
    private lateinit var tvReceta:TextView
    private lateinit var tvReceta2:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)

        tvDescripcion = findViewById(R.id.tvDescripcion)
        tvDescripcion2 = findViewById(R.id.tvDescripcion2)
        tvIngredientes = findViewById(R.id.tvIngredientes)
        tvIngredientes2 = findViewById(R.id.tvIngredientes2)
        tvReceta = findViewById(R.id.tvReceta)
        tvReceta2 = findViewById(R.id.tvReceta2)

        tvDescripcion2.setOnClickListener{llamaActivityDatosDescripcion()}
        tvReceta2.setOnClickListener{llamaActivityDatosRecetas()}
        tvIngredientes2.setOnClickListener{llamaActivityDatosIngredientes()}

    }


    fun llamaActivityDatosDescripcion()
    {
        val intent = Intent(this, Detalle::class.java)
        intent.putExtra(Detalle.EXTRA_DATO,tvDescripcion2.text.toString())
        intent.putExtra(Detalle.EXTRA_TIPO,tvDescripcion.text.toString())
        startActivity(intent)



    }

    fun llamaActivityDatosRecetas()
    {
        val intent = Intent(this, Detalle::class.java)
        intent.putExtra(Detalle.EXTRA_DATO,tvReceta2.text.toString())
        intent.putExtra(Detalle.EXTRA_TIPO,tvReceta.text.toString())
        startActivity(intent)



    }

    fun llamaActivityDatosIngredientes()
    {
        val intent = Intent(this, Detalle::class.java)
        intent.putExtra(Detalle.EXTRA_DATO,tvIngredientes2.text.toString())
        intent.putExtra(Detalle.EXTRA_TIPO,tvIngredientes.text.toString())
        startActivity(intent)



    }



}