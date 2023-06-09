package uz.hakimkhon.mvp_architecture.screens.game

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.hakimkhon.mvp_architecture.R
import uz.hakimkhon.mvp_architecture.databinding.FragmentGameBinding

class GameFragment : Fragment(R.layout.fragment_game) {

    private var _binding: FragmentGameBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentGameBinding.bind(view)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}