package pena.camila.alkewallet.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pena.camila.alkewallet.R
import pena.camila.alkewallet.databinding.FragmentProfilePageBinding

class profile_page : Fragment() {

    lateinit var binding: FragmentProfilePageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_profile_page, container, false)
   binding = FragmentProfilePageBinding.inflate(inflater, container, false)
   return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }
}