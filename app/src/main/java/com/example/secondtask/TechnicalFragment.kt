package com.example.secondtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.secondtask.databinding.FragmentTechnicalBinding
import com.example.secondtask.databinding.FragmentTrainingBinding
import com.google.android.material.snackbar.Snackbar

class TechnicalFragment : Fragment(R.layout.fragment_technical) {
    private var binding: FragmentTechnicalBinding?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTechnicalBinding.bind(view)
        val name = arguments?.getString("CLASS_NAME").toString()
        if(name!=null){
            Snackbar.make(binding?.root!!,name,Snackbar.LENGTH_LONG).show()
        }
        binding?.btnBack?.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}