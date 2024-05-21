package pena.camila.alkewallet.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// LoginViewModel encargada de hacer el login de la app
class LoginViewModel : ViewModel() {
    //LiveData que nos va a permitir observar el login e informar a la vista si el login fue exitoso o no
    val loginResultLiveData = MutableLiveData<Boolean>()

    //Función que implementa una corrutina para llamar a la API
    fun hacerLogin(email: String, contrasena: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                //llamamos a la API
                loginResultLiveData.postValue(true)
            } catch (e: Exception) {
                // en caso de que la API no responda o hay un error
                loginResultLiveData.postValue(false)
            }
        }

    }
}