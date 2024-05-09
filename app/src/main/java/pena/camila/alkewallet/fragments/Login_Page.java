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

public class Login_Page extends Fragment {

    public Login_Page() {
        // Required empty public constructor
    }

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
        return inflater.inflate(R.layout.fragment_login_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Button CrearCuenta = view.findViewById(R.id.buttonCrearNuevaCuenta);

        CrearCuenta.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.signup);
        });


        Button login = view.findViewById(R.id.btn_login);

        login.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.homePage);
        });


    }

}
