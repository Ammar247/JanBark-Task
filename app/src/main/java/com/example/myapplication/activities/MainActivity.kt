package com.example.myapplication.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.ads.AdMobInterstitialAd
import com.example.myapplication.ads.AppBannerAd
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.repository.TranslateRepo
import com.example.myapplication.utils.gone
import com.example.myapplication.utils.visible
import com.example.myapplication.viewmodel.TranslateViewModel
import com.google.mlkit.nl.translate.TranslateLanguage

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: TranslateViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AdMobInterstitialAd.loadAd(this, getString(R.string.interstitial_id))

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(
            this,
            TranslateViewModel.Factory(TranslateRepo(this))
        )[TranslateViewModel::class.java]
        binding.btn1.setOnClickListener {
            AdMobInterstitialAd.showAd(this,
                object : AdMobInterstitialAd.InterstitialShownListener {
                    override fun onShown() {
                        startForResult.launch(
                            Intent(
                                this@MainActivity,
                                WordListActivity::class.java
                            )
                        )
                    }

                    override fun onFailedToShown() {
                        startForResult.launch(
                            Intent(
                                this@MainActivity,
                                WordListActivity::class.java
                            )
                        )
                    }
                })
        }
        binding.btn2.setOnClickListener {
            AdMobInterstitialAd.showAd(this,
                object : AdMobInterstitialAd.InterstitialShownListener {
                    override fun onShown() {
                        startForResult.launch(
                            Intent(
                                this@MainActivity,
                                WordListActivity::class.java
                            )
                        )
                    }

                    override fun onFailedToShown() {
                        startForResult.launch(
                            Intent(
                                this@MainActivity,
                                WordListActivity::class.java
                            )
                        )
                    }
                })
        }
        AppBannerAd.loadBanner(this, getString(R.string.banner_id), binding.layoutBannerMain)
        viewModel.currentContent.observe(this) {
            binding.textTranslate.text = it
            binding.layoutProgressHolder.gone()
        }
    }

    val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val text = result.data?.getStringExtra("name")
                text?.let {
                    binding.layoutProgressHolder.visible()
                    viewModel.translate(it, TranslateLanguage.ENGLISH, TranslateLanguage.URDU)
                }
            }
        }
}