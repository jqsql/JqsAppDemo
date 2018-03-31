package com.jdemo.Views;

import android.app.Application;
import android.content.Context;

/**
 *
 */

public class MyApplication extends Application{
    public static MyApplication instances;
    //private MyHelper mHelper;
    //private SQLiteDatabase db;
    //private DaoMaster mDaoMaster;
    //private DaoSession mDaoSession;

    public static Context mContext;
    public static String var;//版本号
    public static String ServerToken;//token
    public static String DeviceId="";//设备号
    public static int UserType;//type

   //测试服务器地址、、  http://t.test.viigoo.com:3334/
    public static final String ServerPath="http://api2.ums.test.viigoo.com:3315/";
    //测试图片服务器地址
    public static final String ServerImgPath="http://file.test.viigoo.com:3322/image/ums/";
    //测试图片上传的地址
    public static final String ServerImgUploadPath="http://file.test.viigoo.com:3322/api/ums/";
    //测试 检测版本地址
    public static final String VersionPath="http://web.ums.test.viigoo.com:3315/mobile/GetAppVersion";

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=this;
        instances=this;
        //setDatabase();
        //var=App_Utils.getVersionName(this);
    }





    public static MyApplication getInstances(){
        return instances;
    }
   /* *//**
     * 设置greenDao
     *//*
    private void setDatabase() {
        // 通过 DaoMaster 的内部类 DevOpenHelper，你可以得到一个便利的 SQLiteOpenHelper 对象。
        // 可能你已经注意到了，你并不需要去编写「CREATE TABLE」这样的 SQL 语句，因为 greenDAO 已经帮你做了。
        // 注意：默认的 DaoMaster.DevOpenHelper 会在数据库升级时，删除所有的表，意味着这将导致数据的丢失。
        // 所以，在正式的项目中，你还应该做一层封装，来实现数据库的安全升级。
        //mHelper = new Helper(new GreenDaoUtils(this));
        mHelper = new MyHelper(this);
        db = mHelper.getWritableDatabase();
        // 注意：该数据库连接属于 DaoMaster，所以多个 Session 指的是相同的数据库连接。
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
    }
    public DaoSession getDaoSession() {
        return mDaoSession;
    }
    public SQLiteDatabase getDb() {
        return db;
    }*/



}
