package com.onshop.bottomnavigationmultistack.c

import android.util.Log
import androidx.fragment.app.Fragment
import com.onshop.bottomnavigationmultistack.R

class FragmentC : Fragment(R.layout.fragment_c) {

    override fun onResume() {
        super.onResume()
        Log.i("FragmentC","onResume")
    }
}