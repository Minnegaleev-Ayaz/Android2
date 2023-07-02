package com.example.secondtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.secondtask.databinding.FragmentMainBinding
import com.example.secondtask.databinding.FragmentProfileBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private var binding: FragmentMainBinding?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding?.btnToTS?.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_technicalFragment,
                createBundle(this.javaClass.toString())
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    companion object{
        fun createBundle(name:String):Bundle{
            val bundle = Bundle()
            bundle.putString("CLASS_NAME",name)
            return bundle
        }
    }
}