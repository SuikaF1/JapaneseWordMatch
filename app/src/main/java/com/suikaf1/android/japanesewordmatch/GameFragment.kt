package com.suikaf1.android.japanesewordmatch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.suikaf1.android.japanesewordmatch.databinding.FragmentWordMatchBinding
import com.suikaf1.android.japanesewordmatch.viewmodel.WordMatchViewmodel


class GameFragment : Fragment() {

    private val viewModel: WordMatchViewmodel by viewModels()
    lateinit var binding: FragmentWordMatchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWordMatchBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
    }

}