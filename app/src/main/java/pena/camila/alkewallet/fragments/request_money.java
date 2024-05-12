package pena.camila.alkewallet.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import pena.camila.alkewallet.R;

public class request_money extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment...que layout va a mostrar
        View view = inflater.inflate(R.layout.fragment_request_money, container, false);

        //Elementos del diseño que tienen las acciones:
        ImageView flecha = view.findViewById(R.id.button_volver);
        Button ingresardinero = view.findViewById(R.id.btn_ingresar_dinero);

        // Set click listeners, a que pantalla dirigen los botones
        flecha.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.emptyCase);
        });

        ingresardinero.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.homePage);
        });

        return view; // Return the inflated view
    }
}