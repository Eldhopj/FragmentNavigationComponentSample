package com.example.fragmentnavigationcomponentsample.fragments.recipents

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.fragmentnavigationcomponentsample.base.BaseFragment
import com.example.fragmentnavigationcomponentsample.databinding.FragmentChooseRecipientBinding


class ChooseRecipientFragment : BaseFragment<FragmentChooseRecipientBinding>() {

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentChooseRecipientBinding {
        return FragmentChooseRecipientBinding.inflate(inflater,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            nextBtn.setOnClickListener {
                navigateToAmountFrag()
            }
            cancelBtn.setOnClickListener {
                requireActivity().onBackPressed()
            }
        }
    }

    private fun navigateToAmountFrag() {
        val name = binding.inputRecipient.text.toString()
        if (!TextUtils.isEmpty(name)) {
            findNavController().navigate(
                ChooseRecipientFragmentDirections
                    .actionChooseRecipientFragmentToSpecifyAmountFragment(name) // Passing value using safe args
            )
        } else {
            Toast.makeText(requireContext(), "Enter a name", Toast.LENGTH_SHORT).show()
        }
    }

}
