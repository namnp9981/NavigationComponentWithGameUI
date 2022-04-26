package vn.namnp.navigationcomponentgameui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import vn.namnp.navigationcomponentgameui.databinding.FragmentInGameBinding

class InGameFragment : Fragment() {

    private lateinit var binding: FragmentInGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.btnFinishGame.setOnClickListener {
            navController.navigate(R.id.action_inGameFragment_to_gameOverFragment)
        }
    }
}