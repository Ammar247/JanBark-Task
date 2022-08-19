package com.example.myapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/myapplication/viewmodel/TranslateViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/example/myapplication/repository/TranslateRepo;", "(Lcom/example/myapplication/repository/TranslateRepo;)V", "_currentContent", "Landroidx/lifecycle/MutableLiveData;", "", "currentContent", "Landroidx/lifecycle/LiveData;", "getCurrentContent", "()Landroidx/lifecycle/LiveData;", "translate", "", "text", "sourceLanguage", "targetLanguage", "Factory", "app_debug"})
public final class TranslateViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.myapplication.repository.TranslateRepo repo = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _currentContent = null;
    
    public TranslateViewModel(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.repository.TranslateRepo repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCurrentContent() {
        return null;
    }
    
    public final void translate(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguage, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLanguage) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/myapplication/viewmodel/TranslateViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "repo", "Lcom/example/myapplication/repository/TranslateRepo;", "(Lcom/example/myapplication/repository/TranslateRepo;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.example.myapplication.repository.TranslateRepo repo = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.repository.TranslateRepo repo) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.viewmodel.CreationExtras extras) {
            return null;
        }
    }
}