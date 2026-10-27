package com.example.citatus.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.citatus.R

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnIniciarSesion = view.findViewById<Button>(R.id.btn1)
        val btnRegistrarse = view.findViewById<Button>(R.id.btn2)

        btnIniciarSesion.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_login, LoginFragment())
                .addToBackStack(null)
                .commit()
        }
        btnRegistrarse.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_login, RegisterFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}
