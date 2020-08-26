package com.example.fragmentnavigationcomponentsample.fragments.recipents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.fragmentnavigationcomponentsample.base.BaseFragment
import com.example.fragmentnavigationcomponentsample.dataClass.Money
import com.example.fragmentnavigationcomponentsample.databinding.FragmentSpecifyAmountBinding


class SpecifyAmountFragment : BaseFragment<FragmentSpecifyAmountBinding>() {

    private val args by navArgs<SpecifyAmountFragmentArgs>()

    private lateinit var name:String

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSpecifyAmountBinding {
        return FragmentSpecifyAmountBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        extras()

        binding.apply {

            cancelBtn.setOnClickListener {
                navController.navigate(SpecifyAmountFragmentDirections
                    .actionSpecifyAmountFragmentPopIncludingMainFragment())
            }

            sendBtn.setOnClickListener {

                val money = Money(inputAmount.text.toString().toInt())

                navController.navigate(SpecifyAmountFragmentDirections
                    .actionSpecifyAmountFragmentToConfirmationFragment(money,name))
            }
        }
    }

    private fun extras() {
        args.apply {
             name = recipenentName
        }
    }
}
