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
import pena.camila.alkewallet.databinding.FragmentSendMoneyBinding

class send_money : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }
    lateinit var binding: FragmentSendMoneyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
binding = FragmentSendMoneyBinding.inflate(inflater, container, false)
        return binding.root
    }


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val flecha = view.findViewById<ImageView>(R.id.button_volver)
            flecha.setOnClickListener { v: View? ->
                findNavController(
                    v!!
                ).navigate(R.id.emptyCase) }

            val enviardinero = view.findViewById<Button>(R.id.button_ingresar_dinero)
            enviardinero.setOnClickListener { v: View? ->
                findNavController(
                    v!!
                ).navigate(R.id.homePage)
            }
    }
}