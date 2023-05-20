package uz.hakimkhon.mvp_architecture.screens.records
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.hakimkhon.mvp_architecture.R
import uz.hakimkhon.mvp_architecture.databinding.FragmentRecordsBinding

class RecordsFragment : Fragment(R.layout.fragment_records) {

    private var _binding: FragmentRecordsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentRecordsBinding.bind(view)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}