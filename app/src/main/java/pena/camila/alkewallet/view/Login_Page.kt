package pena.camila.alkewallet.view

import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

import pena.camila.alkewallet.databinding.FragmentLoginPageBinding
import pena.camila.alkewallet.viewmodel.LoginViewModel

class Login_Page : AppCompatActivity() {

   lateinit var binding: FragmentLoginPageBinding
   lateinit var sharedPreferences: SharedPreferences
   lateinit var viewModel: LoginViewModel

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()

            //Vamos a configurar el BINDING
            binding = FragmentLoginPageBinding.inflate(layoutInflater)
            setContentView(binding.root)

            // Vamos a configurar View Model
            viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

            //Vamos a implementar SharedPreferences
            sharedPreferences = getSharedPreferences("AlkwWallet", MODE_PRIVATE)

            //Vamos a obtener los datos del usuario
            val correo = sharedPreferences.getString("email", null)

            //Vamos a mostrar los datos
            if (correo != null) {
                binding.txtEmail.setText(correo)
            }


            //Configurando onClick
            binding.BotonLogin.setOnClickListener {

            //Vamos a rescatar la info que ingresò el usuario
var correoIngresado = binding.txtEmail.text.toString()
    var passwordIngresado = binding.txtPassword.text.toString()

    //Vamos a guardar los datos del usuario en shared Preferences
    val editor = sharedPreferences.edit()
    editor.putString("email", correoIngresado)
    editor.apply()
    }
}

}