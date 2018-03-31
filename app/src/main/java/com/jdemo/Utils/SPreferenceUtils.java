package com.jdemo.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 偏好设置(存放的信息都经过AES加密)
 */

public class SPreferenceUtils {
    private SharedPreferences mPreferences;
    private final static String PREFERENCE_NAME="userInfo";//偏好设置存储文件名
    private static SPreferenceUtils mUtils;

    public SPreferenceUtils(Context context) {
        mPreferences=context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE);
    }

    public static SPreferenceUtils getInstance(Context context){
        if(mUtils==null){
            synchronized (SPreferenceUtils.class){
                if(mUtils==null)
                    mUtils=new SPreferenceUtils(context);
            }
        }
        return mUtils;
    }

    /**
     * 将数据存入偏好设置String
     */
    public SPreferenceUtils setString(String key,String values){
        SharedPreferences.Editor editor=mPreferences.edit();
        editor.putString(key, values);
        editor.commit();
        return this;
    }
    /**
     * 将数据存入偏好设置Int
     */
    public SPreferenceUtils setInt(String key,int values){
        SharedPreferences.Editor editor=mPreferences.edit();
        editor.putInt(key,values);
        editor.commit();
        return this;
    }
    /**
     * 将数据存入偏好设置Long
     */
    public SPreferenceUtils setLong(String key,long values){
        SharedPreferences.Editor editor=mPreferences.edit();
        editor.putLong(key,values);
        editor.commit();
        return this;
    }
    /**
     * 将数据从偏好设置中取出Long
     */
    public long getLong(String key){
        long result=mPreferences.getLong(key,-1);//默认返回0
        return result;
    }
    /**
     * 将数据从偏好设置中取出String
     */
    public String getString(String key){
        String result=mPreferences.getString(key,"");//默认返回空
        return result;
    }
    /**
     * 将数据从偏好设置中取出int
     */
    public int getInt(String key){
        int result=mPreferences.getInt(key,0);//默认返回0
       return result;
    }
    /**
     * 将数据从偏好设置中取出Boolean
     */
    public SPreferenceUtils setBoolean(String key,boolean values){
        SharedPreferences.Editor editor=mPreferences.edit();
        editor.putBoolean(key,values);
        editor.commit();
        return this;
    }
    /**
     * 将数据从偏好设置中取出int
     */
    public boolean getBoolean(String key){
        boolean result=mPreferences.getBoolean(key,false);//默认返回false
        return result;
    }
    /**
     * 移出信息
     */
    public SPreferenceUtils remove(String key){
        mPreferences.edit().remove(key).commit();
        return this;
    }
    /**
     * 清除信息
     */
    public void clear(){
        mPreferences.edit().clear().commit();
    }
}
