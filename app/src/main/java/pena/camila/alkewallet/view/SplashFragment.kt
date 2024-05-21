package pena.camila.alkewallet.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import pena.camila.alkewallet.R
import pena.camila.alkewallet.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }

    lateinit var binding: FragmentSplashBinding   //  ----------------- esto se agrega

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false) //  ----- esto se agrega
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val logoInicio = view.findViewById<ImageView>(R.id.logoInicio)

        logoInicio.setOnClickListener { v: View? ->
            findNavController().navigate(R.id.loginSignup)
        }
    }
}