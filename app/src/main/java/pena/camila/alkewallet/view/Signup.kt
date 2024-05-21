package pena.camila.alkewallet.view

import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import pena.camila.alkewallet.databinding.FragmentSignupBinding
import pena.camila.alkewallet.viewmodel.LoginViewModel

class Signup : AppCompatActivity() {

    lateinit var binding: FragmentSignupBinding
    lateinit var sharedPreferences: SharedPreferences
    lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //Vamos a configurar el BINDING
        binding = FragmentSignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Vamos a configurar View Model
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        //Vamos a implementar SharedPreferences
        sharedPreferences = getSharedPreferences("AlkwWallet", MODE_PRIVATE)

        //Vamos a obtener los datos del usuario
        //nombre
        var nombre = sharedPreferences.getString("textInputLayout_nombre", null)
        //Vamos a mostrar los datos
        if (nombre != null) {
            binding.nombreIngresado.setText(nombre)
        }

        //apellido
        var apellido = sharedPreferences.getString("textInputLayout_apellido", null)
        //Vamos a mostrar los datos
        if (apellido != null) {
            binding.apellidoIngresado.setText(apellido)
        }

        //email
        var email = sharedPreferences.getString("textInputLayout_email", null)
        //Vamos a mostrar los datos
        if (email != null) {
            binding.emailIngresado.setText(email)
        }

        //contraseña
        var contrasena = sharedPreferences.getString("textInputLayout_contrasena", null)
        //Vamos a mostrar los datos
        if (contrasena != null) {
            binding.contrasenaIngresada.setText(contrasena)
        }

        //Reingresar contraseña
        var repetirContrasena = sharedPreferences.getString("textInputLayout_reingresar_contrasena", null)
        //Vamos a mostrar los datos
        if (repetirContrasena != null) {
            binding.reingresarcontrasena.setText(repetirContrasena)
        }

        //Configurando onClick
        binding.btnCrearcuenta.setOnClickListener {

            //Vamos a rescatar la info que ingresò el usuario
            var nombre = binding.nombreIngresado.text.toString()
            var apellido = binding.apellidoIngresado.text.toString()
            var email = binding.emailIngresado.text.toString()
            var contrasena = binding.contrasenaIngresada.text.toString()
            var repetirContrasena = binding.reingresarcontrasena.text.toString()


            // Vamos a guardar los datos del usuario en sharedPreferences
            val editor = sharedPreferences.edit()
            editor.putString("nombre", nombre)
            editor.putString("apellido", apellido)
            editor.putString("email", email)
            editor.putString("contrasena", contrasena)
            editor.putString("repetirContrasena", repetirContrasena)
            editor.apply()
        }
    }
}