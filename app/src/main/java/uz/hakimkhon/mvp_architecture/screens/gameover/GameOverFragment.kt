package uz.hakimkhon.mvp_architecture.screens.gameover

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.hakimkhon.mvp_architecture.R
import uz.hakimkhon.mvp_architecture.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment(R.layout.fragment_game_over) {

    private var _binding: FragmentGameOverBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentGameOverBinding.bind(view)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}