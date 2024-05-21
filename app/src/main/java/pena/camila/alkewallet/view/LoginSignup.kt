package pena.camila.alkewallet.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import pena.camila.alkewallet.R
import pena.camila.alkewallet.databinding.FragmentLoginSignupBinding

class LoginSignup : Fragment() {

    private lateinit var binding: FragmentLoginSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginSignupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val yatienescuenta = binding.yaTienesCuenta

        yatienescuenta.setOnClickListener { v: View? ->
            findNavController(v!!).navigate(R.id.login_Page)
        }

        val crearCuenta = binding.botonCrearCuenta

        crearCuenta.setOnClickListener { v: View? ->
            findNavController(v!!).navigate(R.id.emptyCase)
        }
    }
}