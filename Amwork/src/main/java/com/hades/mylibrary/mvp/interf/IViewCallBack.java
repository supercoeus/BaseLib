package com.hades.mylibrary.mvp.interf;

/**
 * Created by Hades on 2017/6/29.
 */

public interface IViewCallBack extends IRootView {
    void onSuccess(String data);
    void onFailed(String message);
}
