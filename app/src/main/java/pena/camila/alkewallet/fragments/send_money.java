package pena.camila.alkewallet.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import pena.camila.alkewallet.R;

public class send_money extends Fragment {


    public send_money() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Button flecha = view.findViewById(R.id.button_volver);

        flecha.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.emptyCase);
        });


        Button enviardinero = view.findViewById(R.id.btn_enviar_dinero);

        enviardinero.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.homePage);
        });
    }
}