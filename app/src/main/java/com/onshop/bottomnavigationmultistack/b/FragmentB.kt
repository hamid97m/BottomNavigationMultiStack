package com.onshop.bottomnavigationmultistack.b

import android.util.Log
import androidx.fragment.app.Fragment
import com.onshop.bottomnavigationmultistack.R

class FragmentB : Fragment(R.layout.fragment_b) {

    override fun onResume() {
        super.onResume()
        Log.i("FragmentB","onResume")
    }
}