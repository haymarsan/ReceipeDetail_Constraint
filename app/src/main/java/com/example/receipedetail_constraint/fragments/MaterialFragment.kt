package com.example.receipedetail_constraint.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.receipedetail_constraint.R

class MaterialFragment : Fragment() {

    companion object{

        fun newFragment(): MaterialFragment{

            return MaterialFragment()

        }


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_material, container, false)
        return view
    }


}