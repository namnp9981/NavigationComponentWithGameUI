package vn.namnp.navigationcomponentgameui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import vn.namnp.navigationcomponentgameui.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {

    private lateinit var binding: FragmentGameOverBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGameOverBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.btnGoToHome.setOnClickListener {
            val navOptions = NavOptions.Builder().setPopUpTo(R.id.startGameFragment, true).build()
            navController.navigate(R.id.action_gameOverFragment_to_startGameFragment, null, navOptions)
        }
    }
}