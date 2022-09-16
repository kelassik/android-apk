package com.konexus.classroom.databinding;
import com.konexus.classroom.R;
import com.konexus.classroom.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityOtpBindingImpl extends ActivityOtpBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_otp_masukkan, 6);
        sViewsWithIds.put(R.id.tv_otp_desc, 7);
        sViewsWithIds.put(R.id.tv_otp_resend, 8);
        sViewsWithIds.put(R.id.tv_otp_changenumber, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etOtp1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.editTextOtp1.getValue()
            //         is viewModel.editTextOtp1.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etOtp1);
            // localize variables for thread safety
            // viewModel.editTextOtp1
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEditTextOtp1 = null;
            // viewModel
            com.konexus.classroom.ui.auth.otp.OtpViewModel viewModel = mViewModel;
            // viewModel.editTextOtp1 != null
            boolean viewModelEditTextOtp1JavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.editTextOtp1.getValue()
            java.lang.String viewModelEditTextOtp1GetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEditTextOtp1 = viewModel.getEditTextOtp1();

                viewModelEditTextOtp1JavaLangObjectNull = (viewModelEditTextOtp1) != (null);
                if (viewModelEditTextOtp1JavaLangObjectNull) {




                    viewModelEditTextOtp1.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etOtp2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.editTextOtp2.getValue()
            //         is viewModel.editTextOtp2.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etOtp2);
            // localize variables for thread safety
            // viewModel.editTextOtp2
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEditTextOtp2 = null;
            // viewModel.editTextOtp2.getValue()
            java.lang.String viewModelEditTextOtp2GetValue = null;
            // viewModel.editTextOtp2 != null
            boolean viewModelEditTextOtp2JavaLangObjectNull = false;
            // viewModel
            com.konexus.classroom.ui.auth.otp.OtpViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEditTextOtp2 = viewModel.getEditTextOtp2();

                viewModelEditTextOtp2JavaLangObjectNull = (viewModelEditTextOtp2) != (null);
                if (viewModelEditTextOtp2JavaLangObjectNull) {




                    viewModelEditTextOtp2.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etOtp3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.editTextOtp3.getValue()
            //         is viewModel.editTextOtp3.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etOtp3);
            // localize variables for thread safety
            // viewModel.editTextOtp3.getValue()
            java.lang.String viewModelEditTextOtp3GetValue = null;
            // viewModel.editTextOtp3 != null
            boolean viewModelEditTextOtp3JavaLangObjectNull = false;
            // viewModel
            com.konexus.classroom.ui.auth.otp.OtpViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.editTextOtp3
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEditTextOtp3 = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEditTextOtp3 = viewModel.getEditTextOtp3();

                viewModelEditTextOtp3JavaLangObjectNull = (viewModelEditTextOtp3) != (null);
                if (viewModelEditTextOtp3JavaLangObjectNull) {




                    viewModelEditTextOtp3.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etOtp4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.editTextOtp4.getValue()
            //         is viewModel.editTextOtp4.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etOtp4);
            // localize variables for thread safety
            // viewModel.editTextOtp4.getValue()
            java.lang.String viewModelEditTextOtp4GetValue = null;
            // viewModel.editTextOtp4 != null
            boolean viewModelEditTextOtp4JavaLangObjectNull = false;
            // viewModel
            com.konexus.classroom.ui.auth.otp.OtpViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.editTextOtp4
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEditTextOtp4 = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEditTextOtp4 = viewModel.getEditTextOtp4();

                viewModelEditTextOtp4JavaLangObjectNull = (viewModelEditTextOtp4) != (null);
                if (viewModelEditTextOtp4JavaLangObjectNull) {




                    viewModelEditTextOtp4.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityOtpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityOtpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (android.widget.ProgressBar) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            );
        this.etOtp1.setTag(null);
        this.etOtp2.setTag(null);
        this.etOtp3.setTag(null);
        this.etOtp4.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pbOtp.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.konexus.classroom.ui.auth.otp.OtpViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.konexus.classroom.ui.auth.otp.OtpViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLoadingEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelEditTextOtp4((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelEditTextOtp3((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelEditTextOtp1((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelEditTextOtp2((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoadingEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoadingEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEditTextOtp4(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEditTextOtp4, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEditTextOtp3(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEditTextOtp3, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEditTextOtp1(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEditTextOtp1, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEditTextOtp2(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEditTextOtp2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoadingEnabled = null;
        java.lang.String viewModelEditTextOtp2GetValue = null;
        int viewModelLoadingEnabledViewVISIBLEViewGONE = 0;
        java.lang.String viewModelEditTextOtp4GetValue = null;
        java.lang.Boolean viewModelLoadingEnabledGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEditTextOtp4 = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEditTextOtp3 = null;
        java.lang.String viewModelEditTextOtp1GetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEditTextOtp1 = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEditTextOtp2 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue = false;
        java.lang.String viewModelEditTextOtp3GetValue = null;
        com.konexus.classroom.ui.auth.otp.OtpViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loadingEnabled
                        viewModelLoadingEnabled = viewModel.getLoadingEnabled();
                    }
                    updateLiveDataRegistration(0, viewModelLoadingEnabled);


                    if (viewModelLoadingEnabled != null) {
                        // read viewModel.loadingEnabled.getValue()
                        viewModelLoadingEnabledGetValue = viewModelLoadingEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoadingEnabledGetValue);
                if((dirtyFlags & 0x61L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoadingEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.editTextOtp4
                        viewModelEditTextOtp4 = viewModel.getEditTextOtp4();
                    }
                    updateLiveDataRegistration(1, viewModelEditTextOtp4);


                    if (viewModelEditTextOtp4 != null) {
                        // read viewModel.editTextOtp4.getValue()
                        viewModelEditTextOtp4GetValue = viewModelEditTextOtp4.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.editTextOtp3
                        viewModelEditTextOtp3 = viewModel.getEditTextOtp3();
                    }
                    updateLiveDataRegistration(2, viewModelEditTextOtp3);


                    if (viewModelEditTextOtp3 != null) {
                        // read viewModel.editTextOtp3.getValue()
                        viewModelEditTextOtp3GetValue = viewModelEditTextOtp3.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.editTextOtp1
                        viewModelEditTextOtp1 = viewModel.getEditTextOtp1();
                    }
                    updateLiveDataRegistration(3, viewModelEditTextOtp1);


                    if (viewModelEditTextOtp1 != null) {
                        // read viewModel.editTextOtp1.getValue()
                        viewModelEditTextOtp1GetValue = viewModelEditTextOtp1.getValue();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.editTextOtp2
                        viewModelEditTextOtp2 = viewModel.getEditTextOtp2();
                    }
                    updateLiveDataRegistration(4, viewModelEditTextOtp2);


                    if (viewModelEditTextOtp2 != null) {
                        // read viewModel.editTextOtp2.getValue()
                        viewModelEditTextOtp2GetValue = viewModelEditTextOtp2.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            com.konexus.classroom.binding.EditTextBindingKt.setBackgroundInputText(this.etOtp1, viewModelEditTextOtp1GetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etOtp1, viewModelEditTextOtp1GetValue);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            com.konexus.classroom.binding.EditTextBindingKt.setInputType(this.etOtp1, androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue);
            com.konexus.classroom.binding.EditTextBindingKt.setInputType(this.etOtp2, androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue);
            com.konexus.classroom.binding.EditTextBindingKt.setInputType(this.etOtp3, androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue);
            com.konexus.classroom.binding.EditTextBindingKt.setInputType(this.etOtp4, androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue);
            this.pbOtp.setVisibility(viewModelLoadingEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etOtp1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etOtp1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etOtp2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etOtp2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etOtp3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etOtp3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etOtp4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etOtp4androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            com.konexus.classroom.binding.EditTextBindingKt.setBackgroundInputText(this.etOtp2, viewModelEditTextOtp2GetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etOtp2, viewModelEditTextOtp2GetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            com.konexus.classroom.binding.EditTextBindingKt.setBackgroundInputText(this.etOtp3, viewModelEditTextOtp3GetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etOtp3, viewModelEditTextOtp3GetValue);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            com.konexus.classroom.binding.EditTextBindingKt.setBackgroundInputText(this.etOtp4, viewModelEditTextOtp4GetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etOtp4, viewModelEditTextOtp4GetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loadingEnabled
        flag 1 (0x2L): viewModel.editTextOtp4
        flag 2 (0x3L): viewModel.editTextOtp3
        flag 3 (0x4L): viewModel.editTextOtp1
        flag 4 (0x5L): viewModel.editTextOtp2
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}