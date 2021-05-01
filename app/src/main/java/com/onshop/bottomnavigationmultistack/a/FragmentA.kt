package com.onshop.bottomnavigationmultistack.a

import android.util.Log
import androidx.fragment.app.Fragment
import com.onshop.bottomnavigationmultistack.R

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onResume() {
        super.onResume()
        Log.i("FragmentA", "onResume")
    }
}