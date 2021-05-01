package com.onshop.bottomnavigationmultistack.b

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.onshop.bottomnavigationmultistack.R

class FragmentB : Fragment(R.layout.fragment_b) {

    override fun onResume() {
        super.onResume()
        Log.i("bottomNavigationTest", "onResume-FragmentB")
    }

    override fun onPause() {
        super.onPause()
        Log.i("bottomNavigationTest", "onPause-FragmentB")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("bottomNavigationTest", "onViewCreated-FragmentB")
        view.findViewById<Button>(R.id.button).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB_to_fragmentBB)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("bottomNavigationTest", "onCreateView-FragmentB")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        Log.i("bottomNavigationTest", "onDestroyView-FragmentB")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("bottomNavigationTest", "onDestroy-FragmentB")
        super.onDestroy()
    }
}