package com.kaancelen.rickandmorty.main

import android.os.Bundle
import androidx.activity.viewModels
import com.kaancelen.rickandmorty.R
import com.kaancelen.rickandmorty.databinding.ActivityMainBinding
import com.kaancelen.rickandmorty.presentation.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}