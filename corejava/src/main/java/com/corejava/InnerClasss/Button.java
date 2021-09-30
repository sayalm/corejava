package com.corejava.InnerClasss;

public class Button<ClickListener> {
    private String title;
    private OnClicklistener onClickLister;

    public Button(String title) {
        this.title = title;

    }

    public  String getTitle() {
        return title;
    }

    public  void setOnClickListener(OnClicklistener onClickListener) {
        this.onClickLister = onClickListener;
    }

    public void onClick() {
        this.onClickLister.onClick(this.title);
    }

    public void setOnClickListener(ClickListener clickListener) {
    }


    public interface  OnClickListener {
        public void onClick(String title);
    }

    private class OnClicklistener {
        public void onClick(String title) {
        }

    }
}
