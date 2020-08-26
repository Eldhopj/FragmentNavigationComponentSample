package com.example.fragmentnavigationcomponentsample.fragments


import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.fragmentnavigationcomponentsample.base.BaseFragment
import com.example.fragmentnavigationcomponentsample.databinding.FragmentViewTransactionBinding


class ViewTransactionFragment : BaseFragment<FragmentViewTransactionBinding>() {

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentViewTransactionBinding {
        return FragmentViewTransactionBinding.inflate(inflater,container,false)
    }


}
