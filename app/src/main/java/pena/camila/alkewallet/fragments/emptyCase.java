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

public class emptyCase extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_empty_case, container, false);
    }


        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);


            Button enviardinero = view.findViewById(R.id.button_enviar_dinero);
            Button ingresardinero = view.findViewById(R.id.button_ingresar_dinero);


            enviardinero.setOnClickListener(v -> {
                Navigation.findNavController(v).navigate(R.id.send_money);
            });

            ingresardinero.setOnClickListener(v -> {
                Navigation.findNavController(v).navigate(R.id.request_money);
            });
}

}