package pena.camila.alkewallet.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import pena.camila.alkewallet.R
import pena.camila.alkewallet.databinding.FragmentEmptyCaseBinding

class emptyCase : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }


    lateinit var binding: FragmentEmptyCaseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentEmptyCaseBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val enviardinero = view.findViewById<Button>(R.id.button_enviar_dinero)
        val ingresardinero = view.findViewById<Button>(R.id.button_ingresar_dinero)


        enviardinero.setOnClickListener { v: View? ->
            findNavController(
                v!!
            ).navigate(R.id.send_money)
        }

        ingresardinero.setOnClickListener { v: View? ->
            findNavController(
                v!!
            ).navigate(R.id.request_money)
        }
    }
}