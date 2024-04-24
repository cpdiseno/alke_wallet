package pena.camila.alkewallet

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Timer
import java.util.TimerTask

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //Esta linea indica què xml va a mostrar
        setContentView(R.layout.activity_loguin_signup)

       //Abiendo la pantalla con un click

//Se declara la imagen como una variable
        val logoApp = findViewById<ImageView>(R.id.logo)
        logoApp.setOnClickListener {

            //Se define la variable o "Val" como abrirPantallaLogin,
            // luego pone el nombre del tk correspondiente -LoguinSignupActivity-

            val abrirPantallaLogin = Intent(this, LoguinSignupActivity::class.java)

            //Se le pasan datos
            abrirPantallaLogin.putExtra("nombre", "Jaime")
            abrirPantallaLogin.putExtra("apellido", "Perez")
            abrirPantallaLogin.putExtra("acepto_tyC", false)
            startActivity(abrirPantallaLogin)
        }
    }
}


        /** Abiendo la pantalla con un timer

        var task: TimerTask? = object : TimerTask() {
            override fun run() {
                val abrirPantallaLogin = Intent(baseContext, LoguinSignupActivity::class.java)
                abrirPantallaLogin.putExtra("nombre", "Jaime")
                abrirPantallaLogin.putExtra("apellido", "Perez")
                abrirPantallaLogin.putExtra("acepto_tyC", false)
                startActivity(abrirPantallaLogin)
            }
        }

        val timer = Timer()
        timer.schedule(task, 3000)}
}*/