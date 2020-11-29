package com.example.fragmentnavigationcomponentsample.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment <T: ViewBinding> : Fragment() {

    //Bindings
    private var _binding: T? = null
    protected open val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = this.setBinding(inflater,container)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    abstract fun setBinding(inflater: LayoutInflater, container: ViewGroup?): T

}
