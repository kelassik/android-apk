package com.konexus.classroom.ui.auth.otp;

import androidx.lifecycle.MutableLiveData;
import com.konexus.classroom.ui.BaseViewModel;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/konexus/classroom/ui/auth/otp/OtpViewModel;", "Lcom/konexus/classroom/ui/BaseViewModel;", "()V", "editTextOtp1", "Landroidx/lifecycle/MutableLiveData;", "", "getEditTextOtp1", "()Landroidx/lifecycle/MutableLiveData;", "editTextOtp2", "getEditTextOtp2", "editTextOtp3", "getEditTextOtp3", "editTextOtp4", "getEditTextOtp4", "isOtpSessionInvalid", "", "checkOtp", "", "getOtpValue", "Companion", "app_debug"})
public final class OtpViewModel extends com.konexus.classroom.ui.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    public static final com.konexus.classroom.ui.auth.otp.OtpViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_OTP_SUCCESS = "action_otp_success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_OTP_FAILED = "action_otp_failed";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> editTextOtp1 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> editTextOtp2 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> editTextOtp3 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> editTextOtp4 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isOtpSessionInvalid = null;
    
    public OtpViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextOtp1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextOtp2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextOtp3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditTextOtp4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isOtpSessionInvalid() {
        return null;
    }
    
    public final void checkOtp() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtpValue() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/konexus/classroom/ui/auth/otp/OtpViewModel$Companion;", "", "()V", "ACTION_OTP_FAILED", "", "ACTION_OTP_SUCCESS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}