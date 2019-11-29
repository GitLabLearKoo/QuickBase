package com.androidwind.androidquick.ui.mvp;

import com.trello.rxlifecycle2.LifecycleTransformer;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface BaseContract {

    interface BasePresenter<T extends BaseContract.BaseView> {

        void attachView(T view);

        void detachView();
    }


    interface BaseView {
        <T> LifecycleTransformer<T> bindToLife();
    }

    interface BaseModel {

    }
}
