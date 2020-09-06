package com.example.fragmentnavigationcomponentsample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentnavigationcomponentsample.base.BaseFragment
import com.example.fragmentnavigationcomponentsample.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?)
            : FragmentMainBinding = FragmentMainBinding.inflate(inflater, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            sendMoneyBtn.setOnClickListener {
                navController.navigate(
                    MainFragmentDirections
                        .actionMainFragmentToChooseRecipientFragment()
                )
            }
            viewTransactionsBtn.setOnClickListener {
                navController.navigate(
                    MainFragmentDirections
                        .actionMainFragmentToViewTransactionFragment()
                )
            }
            viewBalanceBtn.setOnClickListener {
                navController.navigate(
                    MainFragmentDirections
                        .actionMainFragmentToViewBalanceFragment()
                )
            }
        }
    }


}
