package com.example.runninglife.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.runninglife.R

class FragmentMyPage : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState:Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_page, container, false)

    }
}