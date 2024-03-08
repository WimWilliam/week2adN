package com.emp.week2

import android.graphics.Path.Direction
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.emp.week2.databinding.FragmentGameBinding
import kotlin.random.Random



class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game, container, false)
        // Inflate the layout for this fragment
//        binding = FragmentGameBinding.inflate(inflater, container,
//            false)
//        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstNum = Random.nextInt(0,50)
        val secNum = Random.nextInt(0,50)

        binding.txtFNum.text= "$firstNum"
        binding.txtSNum.text = "$secNum"

        if(arguments != null) {
            val playerName =GameFragmentArgs.fromBundle(requireArguments()).playerName
            binding.txtTurn.text = "$playerName's Turn"

        }

        binding.btnKumpul.setOnClickListener {
            val answer = firstNum + secNum
            var score = 0
            if (Integer.parseInt(binding.txtJawab.text.toString()) == answer){
                score = 1
            }
//            val action = GameFragmentDirections.actionResultFragment(score)
//            Navigation.findNavController(it).navigate(action)

        }

        binding.btnTest.setOnClickListener{
            //val action = GameFragmentDirections(Direction.actionOptionFragment)
        }


    }
}
