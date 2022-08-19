package com.example.myapplication.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.example.myapplication.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

public class AppBannerAd {

    @SuppressLint("StaticFieldLeak")
    private static Activity activity;

    public static void loadBanner(Activity mActivity, String bannerId, ViewGroup container) {
        activity = mActivity;
        loadAdMobAd(bannerId, container);
    }

    private static void loadPlaceholder(ViewGroup container) {
        TextView valueTV = new TextView(activity);
        valueTV.setText("LOADING AD...");
        valueTV.setTextColor(ContextCompat.getColor(activity, R.color.black));
        valueTV.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 160));
        valueTV.setGravity(Gravity.CENTER);
        container.setPadding(12, 12, 12, 12);
        container.addView(valueTV);
        int backgroundColor = android.R.color.white;
        GradientDrawable gradient = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]
                {backgroundColor, backgroundColor});
        gradient.setShape(GradientDrawable.RECTANGLE);
        gradient.setStroke(4, Color.BLACK);
        gradient.setCornerRadius(2f);
        container.setBackground(gradient);

    }

    private static void loadAdMobAd(String unitId, ViewGroup container) {
        loadPlaceholder(container);
        AdView adView = new AdView(activity);
        adView.setAdSize(getAdSize());
        adView.setAdUnitId(unitId);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);

            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                container.removeAllViews();
                container.setPadding(16, 16, 16, 16);
                container.addView(adView);
            }

            @Override
            public void onAdClicked() {

            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }

            @Override
            public void onAdImpression() {
                super.onAdImpression();
            }
        });
        adView.loadAd(adRequest);
    }

    private static AdSize getAdSize() {
        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);
        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;
        int adWidth = (int) (widthPixels / density);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, adWidth);
    }

}
