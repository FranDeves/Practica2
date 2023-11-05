package net.iessochoastf.frandeves.practica2

//import android.R

import android.R.attr.button
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

   private lateinit var btAgenda: Button
   private lateinit var btReceta: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Buscamos los views
        btAgenda = findViewById(R.id.btAgenda)
        btReceta = findViewById(R.id.btReceta)


        btAgenda.setOnClickListener(View.OnClickListener { // Crea un Intent para abrir AgendaActivity
            val intent = Intent(this@MainActivity, AgendaActivity::class.java)
            startActivity(intent)
        })


        btReceta.setOnClickListener { val intent = Intent(this@MainActivity, RecetaActivity::class.java)
         startActivity(Intent(intent))}

    }
}