package com.example.suks.progressbartest.refactor;

/**
 * Created by suks on 2016/11/2.
 */
public class Sandbox {
    private  int mChildren;
    private String mshovel;

    private Sandbox(int mChildren) {
        this.mChildren = mChildren;
    }

    public static Sandbox createSandbox(int mChildren) {
        return new Sandbox(mChildren);
    }

    public int getmChildren() {
        new Thread(new MyRunnable());
        return mChildren;
    }

    public void setmChildren(int mChildren) {
        this.mChildren = mChildren;
    }


    private class MyRunnable implements Runnable {
        @Override
        public void run() {

        }
    }
}
