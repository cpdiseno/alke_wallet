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
import pena.camila.alkewallet.databinding.FragmentRequestMoneyBinding

class RequestMoney : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }

    lateinit var binding: FragmentRequestMoneyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment...que layout va a mostrar
        //val view = inflater.inflate(R.layout.fragment_request_money, container, false)
        binding = FragmentRequestMoneyBinding.inflate(inflater, container, false)
        return binding.root }


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Elementos del diseño que tienen las acciones:
        val flecha = view.findViewById<ImageView>(R.id.button_volver)
        flecha.setOnClickListener { v: View? ->
            findNavController( v!!
            ).navigate(R.id.emptyCase)}

        val ingresarDinero = view.findViewById<Button>(R.id.btn_ingresar_dinero)
        ingresarDinero.setOnClickListener { v: View? ->
            findNavController( v!! ).navigate(R.id.homePage)
        }
    }
}