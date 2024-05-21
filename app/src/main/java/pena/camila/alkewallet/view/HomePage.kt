package pena.camila.alkewallet.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import pena.camila.alkewallet.R
import pena.camila.alkewallet.databinding.FragmentHomePageBinding

class homePage : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }

    lateinit var binding: FragmentHomePageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home_page, container, false)
   binding = FragmentHomePageBinding.inflate(inflater, container, false)
    return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val EnviarDinero = view.findViewById<Button>(R.id.button_enviar_dinero)
        val IngresarDinero = view.findViewById<Button>(R.id.btn_ingresar_dinero)
        val Perfil = view.findViewById<ImageView>(R.id.fotoperfil)


        EnviarDinero.setOnClickListener { v: View? ->
            findNavController(
                v!!
            ).navigate(R.id.send_money)
        }

        IngresarDinero.setOnClickListener { v: View? ->
            findNavController(
                v!!
            ).navigate(R.id.request_money)
        }


        Perfil.setOnClickListener { v: View? ->
            findNavController(
                v!!
            ).navigate(R.id.profile_page)
        }
    }
}