package com.example.fragmentnavigationcomponentsample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.fragmentnavigationcomponentsample.base.BaseFragment
import com.example.fragmentnavigationcomponentsample.databinding.FragmentViewBalanceBinding


class ViewBalanceFragment : BaseFragment<FragmentViewBalanceBinding>() {

    private val args by navArgs<ViewBalanceFragmentArgs>()
    var amount:Int =0

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentViewBalanceBinding {
        return FragmentViewBalanceBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        extras()

        var balance = 120-amount

        binding.apply {
            balanceValue.text = "Balance amount $$balance"
        }
    }

    private fun extras() {
        args.apply {
            this@ViewBalanceFragment.amount = amount
        }
    }

}
