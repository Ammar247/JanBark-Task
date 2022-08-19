package com.example.myapplication.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.ads.AdMobInterstitialAd
import com.example.myapplication.databinding.ActivityWordListBinding
import com.example.myapplication.repository.WordRepo
import com.example.myapplication.viewmodel.WordViewModel
import com.example.task.adapter.WordAdapter


class WordListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWordListBinding

    private lateinit var viewModel: WordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWordListBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(
            this,
            WordViewModel.Factory(WordRepo(this))
        )[WordViewModel::class.java]
        setContentView(binding.root)
        val adapter = WordAdapter {
            AdMobInterstitialAd.showAd(this,
                object : AdMobInterstitialAd.InterstitialShownListener {
                    override fun onShown() {
                        val resultIntent = Intent()
                        resultIntent.putExtra("name", it)
                        setResult(RESULT_OK, resultIntent)
                        this@WordListActivity.finish()
                    }

                    override fun onFailedToShown() {
                        val resultIntent = Intent()
                        resultIntent.putExtra("name", it)
                        setResult(RESULT_OK, resultIntent)
                        this@WordListActivity.finish()
                    }
                })

        }
        binding.recyclerView.adapter = adapter

        viewModel.currentContent.observe(this) {
            adapter.submitList(it)
        }
    }


}