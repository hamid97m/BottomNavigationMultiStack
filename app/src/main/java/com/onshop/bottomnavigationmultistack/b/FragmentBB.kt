package com.onshop.bottomnavigationmultistack.b

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.onshop.bottomnavigationmultistack.R

class FragmentBB: Fragment(R.layout.fragment_bb) {

    override fun onResume() {
        super.onResume()
        Log.i("bottomNavigationTest", "onResume-FragmentBb")
    }

    override fun onPause() {
        super.onPause()
        Log.i("bottomNavigationTest", "onPause-FragmentBb")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("bottomNavigationTest", "onViewCreated-FragmentBb")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("bottomNavigationTest", "onCreateView-FragmentBb")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        Log.i("bottomNavigationTest", "onDestroyView-FragmentBb")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("bottomNavigationTest", "onDestroy-FragmentBb")
        super.onDestroy()
    }
}