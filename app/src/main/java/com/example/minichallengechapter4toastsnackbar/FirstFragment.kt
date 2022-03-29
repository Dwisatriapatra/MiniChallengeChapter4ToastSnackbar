package com.example.minichallengechapter4toastsnackbar
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.minichallengechapter4toastsnackbar.databinding.FragmentFirstBinding
import com.google.android.material.snackbar.Snackbar

class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var binding : FragmentFirstBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)
        binding.buttonToast.setOnClickListener {
            val nama = binding.inputanNama.text.toString()
            Toast.makeText(requireContext(), "Selamat datang $nama", Toast.LENGTH_SHORT).show()

        }
        binding.buttonSnackbar.setOnClickListener {
            val nama = binding.inputanNama.text.toString()
            Snackbar.make(it, "Halo, $nama", Snackbar.LENGTH_INDEFINITE)
                .setAction("Move"){
                    Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
                }.show()
        }
    }
}