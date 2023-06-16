package com.example.myproyect.actividades.fragmentos;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.myproyect.R;
import com.example.myproyect.actividades.actividades.usuario.BienvenidoActivity;
import com.example.myproyect.actividades.actividades.usuario.TablaReservaUser_Activity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Losa3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Losa3Fragment extends Fragment {
    EditText txtFechaRe;
    Button btnReg, btnAceptar;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Losa3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Losa3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Losa3Fragment newInstance(String param1, String param2) {
        Losa3Fragment fragment = new Losa3Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_losa3, container, false);

        btnReg = (Button) view.findViewById(R.id.car3BtnRegresar);
        btnReg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switch (view.getId()) {

                    case R.id.car3BtnRegresar:
                        Log.d("tag", "test");
                        regresar();
                        break;
                    case R.id.car3BtnAceptar:
                        tablaAceptar();
                        break;
                }
            }
        });
        btnAceptar = (Button) view.findViewById(R.id.car3BtnAceptar);
        btnAceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switch (view.getId()) {

                    case R.id.car3BtnRegresar:
                        Log.d("tag", "test");
                        regresar();
                        break;
                    case R.id.car3BtnAceptar:
                        tablaAceptar();
                        break;
                }
            }
        });
        return view;
    }

    private void tablaAceptar() {
        Intent intent = new Intent(getContext(), TablaReservaUser_Activity.class);
        startActivity(intent);
    }

    private void regresar() {
        Intent iBienvenido = new Intent(getContext(), BienvenidoActivity.class);
        iBienvenido.putExtra("nombre","Luiggi");
        startActivity(iBienvenido);
        getActivity().finish();
    }

}