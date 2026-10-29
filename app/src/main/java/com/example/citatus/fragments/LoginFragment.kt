package com.example.citatus.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.citatus.R

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnVolver = view.findViewById<Button>(R.id.btn2)
        val tvContraseniaOlvidada = view.findViewById<TextView>(R.id.Contrasenia_olvidada)

        btnVolver.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_splash, SplashFragment())
                .addToBackStack(null)
                .commit()
        }
        tvContraseniaOlvidada.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_splash, RestPasswordFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}
