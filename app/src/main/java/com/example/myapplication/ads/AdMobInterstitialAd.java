package com.example.myapplication.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class AdMobInterstitialAd {
    private static final String TAG = "interstitialAd";
    private static String interstitialId = "";
    @SuppressLint("StaticFieldLeak")
    private static InterstitialAd mAdMobAd;

    public static void loadAd(Activity activity, String adId) {
        interstitialId = adId;
        if (mAdMobAd != null) {
            return;
        }
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(activity, adId, adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                mAdMobAd = null;
            }

            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                AdMobInterstitialAd.mAdMobAd = interstitialAd;
            }
        });
    }

    public static void showAd(Activity activity, InterstitialShownListener listener) {
        if (mAdMobAd == null) {
            if (listener != null) {
                listener.onFailedToShown();
            }
            return;
        }
        mAdMobAd.setFullScreenContentCallback(new FullScreenContentCallback() {
            @Override
            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                super.onAdFailedToShowFullScreenContent(adError);
                mAdMobAd = null;
                if (listener != null) {
                    listener.onFailedToShown();
                }
            }

            @Override
            public void onAdShowedFullScreenContent() {
                super.onAdShowedFullScreenContent();
                mAdMobAd = null;

                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    activity.runOnUiThread(() -> loadAd(activity, interstitialId));
                }, 3000);
            }

            @Override
            public void onAdDismissedFullScreenContent() {
                super.onAdDismissedFullScreenContent();
                if (listener != null) {
                    listener.onShown();
                }
                mAdMobAd = null;
            }

            @Override
            public void onAdImpression() {
                super.onAdImpression();
            }
        });
        mAdMobAd.show(activity);
    }

    public static boolean isAdAvailable() {
        return mAdMobAd != null;
    }

    public static interface InterstitialShownListener {
        default void onShown() {

        }

        default void onFailedToShown() {

        }
    }
}