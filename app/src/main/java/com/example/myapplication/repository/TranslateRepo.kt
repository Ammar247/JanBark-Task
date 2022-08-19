package com.example.myapplication.repository

import android.content.Context
import com.google.mlkit.common.model.DownloadConditions
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions

class TranslateRepo(private val context: Context) {
    fun translate(
        text: String,
        sourceLanguage: String,
        targetLanguage: String,
        callback: (String) -> Unit
    ) {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(sourceLanguage)
            .setTargetLanguage(targetLanguage)
            .build()
        val translator = Translation.getClient(options)
        val conditions = DownloadConditions.Builder()
            .requireWifi()
            .build()
        translator.downloadModelIfNeeded(conditions)
            .addOnSuccessListener {
                translator.translate(text)
                    .addOnSuccessListener {
                        callback(it)
                    }
                    .addOnFailureListener {
                        callback(it.message.toString())
                    }
            }
            .addOnFailureListener {
                translator.downloadModelIfNeeded(conditions)
                callback(it.message.toString())
            }
    }
}