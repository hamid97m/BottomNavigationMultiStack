package com.onshop.bottomnavigationmultistack.c

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.onshop.bottomnavigationmultistack.R

class FragmentC : Fragment(R.layout.fragment_c) {

    override fun onResume() {
        super.onResume()
        Log.i("bottomNavigationTest", "onResume-FragmentC")
    }

    override fun onPause() {
        super.onPause()
        Log.i("bottomNavigationTest", "onPause-FragmentC")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("bottomNavigationTest", "onViewCreated-FragmentC")
        view.findViewById<Button>(R.id.button).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentC_to_fragmentCC)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("bottomNavigationTest", "onCreateView-FragmentC")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        Log.i("bottomNavigationTest", "onDestroyView-FragmentC")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("bottomNavigationTest", "onDestroy-FragmentC")
        super.onDestroy()
    }
}