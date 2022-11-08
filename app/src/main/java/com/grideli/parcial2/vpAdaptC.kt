package com.grideli.parcial2

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class vpAdaptC (fragment: FragmentActivity): FragmentStateAdapter(fragment) {
    companion object{
        private const val ARG_OBJECT = "object";
    }

    override fun getItemCount(): Int =3;

    override fun createFragment(_position: Int): Fragment {
        val fragment = Frag(null);
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT,_position+1);
        }
        return fragment;
    }
}