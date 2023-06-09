package uz.hakimkhon.mvp_architecture.screens.about

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.hakimkhon.mvp_architecture.R
import uz.hakimkhon.mvp_architecture.databinding.FragmentAboutBinding

class AboutFragment : Fragment(R.layout.fragment_about) {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAboutBinding.bind(view)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}