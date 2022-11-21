package com.example.tabwithfragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tabwithfragment.R
import com.example.tabwithfragment.adapter.LanguageAdapter
import com.example.tabwithfragment.util.Constants

class MobileFragment : Fragment() {

    private val languageAdapter by lazy { LanguageAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mobile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = languageAdapter
        }
        languageAdapter.submitList(Constants.mobileLanguages())
    }
}