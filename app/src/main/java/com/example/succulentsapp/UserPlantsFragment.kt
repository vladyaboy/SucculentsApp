package com.example.succulentsapp

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.succulentsapp.databinding.UserPlantsFragmentBinding

class UserPlantsFragment : Fragment() {

    companion object {
        fun newInstance() = UserPlantsFragment()
    }

    private lateinit var viewModel: UserPlantsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<UserPlantsFragmentBinding>(inflater,
            R.layout.user_plants_fragment, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(UserPlantsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}