package com.example.android.navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitleBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class TitleFrament : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false);
        binding.playButton.setOnClickListener(
                //            Navigation.findNavController(view).navigate(R.id.action_titleFrament_to_gameFragment)
//            view.findNavController().navigate(R.id.action_titleFrament_to_gameFragment)
                Navigation.createNavigateOnClickListener(R.id.action_titleFrament_to_gameFragment) // all options are working
        )
        return binding.root
//        return inflater.inflate(R.layout.fragment_title, container, false);
    }


}
