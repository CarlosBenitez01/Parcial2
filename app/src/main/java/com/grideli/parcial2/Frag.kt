package com.grideli.parcial2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

public class Frag() : Fragment(){
    val objectAnimal:animal? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val iv_img: ImageView = view.findViewById(R.id.iv_Imagen)
            val tv_especie: TextView = view.findViewById(R.id.tv_Especie)
            val tv_sexo: TextView = view.findViewById(R.id.tv_Sexo)
            val tv_habitad: TextView = view.findViewById(R.id.tv_Habitad)

            //iv_img.setImageIcon()
            var mainA = MainActivity()
            objectAnimal = MainActivity.ob
            tv_especie.text = objectAnimal?.animalEspecie.toString()
            tv_sexo.text = objectAnimal?.animalSexo.toString()
            tv_habitad.text = objectAnimal?.animalHabitad.toString()
        }
    }

    companion object {
        private const val ARG_OBJECT = "object"

    }
}
