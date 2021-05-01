package com.onshop.bottomnavigationmultistack.c

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.onshop.bottomnavigationmultistack.R

class FragmentCC: Fragment(R.layout.fragment_cc) {

    override fun onResume() {
        super.onResume()
        Log.i("bottomNavigationTest", "onResume-FragmentCc")
    }

    override fun onPause() {
        super.onPause()
        Log.i("bottomNavigationTest", "onPause-FragmentCc")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("bottomNavigationTest", "onViewCreated-FragmentCc")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("bottomNavigationTest", "onCreateView-FragmentCc")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        Log.i("bottomNavigationTest", "onDestroyView-FragmentCc")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("bottomNavigationTest", "onDestroy-FragmentCc")
        super.onDestroy()
    }
}