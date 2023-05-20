package uz.hakimkhon.mvp_architecture.screens.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.hakimkhon.mvp_architecture.R
import uz.hakimkhon.mvp_architecture.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}