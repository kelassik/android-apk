package com.konexus.classroom.ui.auth.login;

import androidx.lifecycle.MutableLiveData;
import com.konexus.classroom.ui.BaseViewModel;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/konexus/classroom/ui/auth/login/LoginViewModel;", "Lcom/konexus/classroom/ui/BaseViewModel;", "()V", "emailEditText", "Landroidx/lifecycle/MutableLiveData;", "", "getEmailEditText", "()Landroidx/lifecycle/MutableLiveData;", "isEmailTabActive", "", "isPhoneTabActive", "passwordEditText", "getPasswordEditText", "emailTabOnClick", "", "loginButtonOnClick", "phoneTabOnClick", "signUpOnClick", "Companion", "app_debug"})
public final class LoginViewModel extends com.konexus.classroom.ui.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    public static final com.konexus.classroom.ui.auth.login.LoginViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOGIN_SIGNUP_CLICK = "action_login_signup";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOGIN_EMAIL_SUCCESS = "action_login_email_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOGIN_PHONE_SUCCESS = "action_login_phone_success";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmailTabActive = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPhoneTabActive = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> emailEditText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> passwordEditText = null;
    
    public LoginViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmailTabActive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPhoneTabActive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEmailEditText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPasswordEditText() {
        return null;
    }
    
    public final void emailTabOnClick() {
    }
    
    public final void phoneTabOnClick() {
    }
    
    public final void signUpOnClick() {
    }
    
    public final void loginButtonOnClick() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/konexus/classroom/ui/auth/login/LoginViewModel$Companion;", "", "()V", "ACTION_LOGIN_EMAIL_SUCCESS", "", "ACTION_LOGIN_PHONE_SUCCESS", "ACTION_LOGIN_SIGNUP_CLICK", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}