package com.onshop.bottomnavigationmultistack.b

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.onshop.bottomnavigationmultistack.R

class FragmentB : Fragment(R.layout.fragment_b) {

    override fun onResume() {
        super.onResume()
        Log.i("FragmentB", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("FragmentB", "onPause")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("FragmentB", "onViewCreated")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("FragmentB", "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        Log.i("FragmentB", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("FragmentB", "onDestroy")
        super.onDestroy()
    }
}