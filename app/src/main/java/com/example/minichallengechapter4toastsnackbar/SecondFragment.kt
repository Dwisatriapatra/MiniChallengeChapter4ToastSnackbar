package com.example.minichallengechapter4toastsnackbar
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.minichallengechapter4toastsnackbar.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {
    private lateinit var binding : FragmentSecondBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

    }
}