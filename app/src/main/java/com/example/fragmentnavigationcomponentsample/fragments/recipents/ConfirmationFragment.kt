package com.example.fragmentnavigationcomponentsample.fragments.recipents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.fragmentnavigationcomponentsample.base.BaseFragment
import com.example.fragmentnavigationcomponentsample.dataClass.Money
import com.example.fragmentnavigationcomponentsample.databinding.FragmentConfirmationBinding


class ConfirmationFragment : BaseFragment<FragmentConfirmationBinding>() {

    private val args by navArgs<ConfirmationFragmentArgs>()
    lateinit var money: Money
    lateinit var name: String

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentConfirmationBinding {
        return FragmentConfirmationBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        extras()

        binding.apply {
            confirmationMessage.text = "You have send $${money.amount} to recipient $name"

            viewBalance.setOnClickListener {
                findNavController().navigate(
                    ConfirmationFragmentDirections
                        .actionConfirmationFragmentToViewBalanceFragment(money.amount)
                )
            }
        }
    }

    private fun extras() {
        args.apply {
            money = amount
            this@ConfirmationFragment.name = name
        }
    }

}
