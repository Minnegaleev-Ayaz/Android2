package com.example.secondtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.secondtask.databinding.FragmentHealthStutsBinding
import com.example.secondtask.databinding.FragmentMainBinding

class HealthStutsFragment : Fragment(R.layout.fragment_health_stuts) {
    private var binding: FragmentHealthStutsBinding?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHealthStutsBinding.bind(view)
        binding?.btnToTS?.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("CLASS_NAME",this.javaClass.toString())
            findNavController().navigate(R.id.action_healthStutsFragment_to_technicalFragment,bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}