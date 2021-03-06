package moye.ganjiang.com.ganjiang.contract.fragments;

import moye.ganjiang.com.ganjiang.base.BasePresenter;
import moye.ganjiang.com.ganjiang.base.BaseView;
import moye.ganjiang.com.ganjiang.model.select.LunBoBean;

/**
 * 项目名称:ganjiang
 * Created by lovezh
 * CreatedData: on 2017/7/18.
 */

  public interface SelectContract {
    interface View extends BaseView {

        void showContent(LunBoBean bean);

        void showMoreContent();
    }

    interface Presenter extends BasePresenter<View> {

        void getData(int terminal, int itino);

        void getMoreData();

    }
}
