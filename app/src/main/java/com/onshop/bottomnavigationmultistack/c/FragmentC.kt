package com.onshop.bottomnavigationmultistack.c

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.onshop.bottomnavigationmultistack.R

class FragmentC : Fragment(R.layout.fragment_c) {

    override fun onResume() {
        super.onResume()
        Log.i("FragmentC", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("FragmentC", "onPause")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("FragmentC", "onViewCreated")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("FragmentC", "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        Log.i("FragmentC", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("FragmentC", "onDestroy")
        super.onDestroy()
    }
}