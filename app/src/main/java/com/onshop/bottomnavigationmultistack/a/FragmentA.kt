package com.onshop.bottomnavigationmultistack.a

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.onshop.bottomnavigationmultistack.R

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onResume() {
        super.onResume()
        Log.i("FragmentA", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("FragmentA", "onPause")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("FragmentA", "onViewCreated")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("FragmentA", "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        Log.i("FragmentA", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("FragmentA", "onDestroy")
        super.onDestroy()
    }
}