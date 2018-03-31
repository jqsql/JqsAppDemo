package com.jdemo.Utils.AppUpgradeUtils;

import android.content.Context;
import com.jdemo.Utils.SPreferenceUtils;
/**
 * 版本更新存储
 */

public class AppUpgradePersistentHelper {
    private static final String DOWNLOAD_TASK_ID = "download_task_id";
    /**
     * 保存的当前下载任务id
     */
    public static void saveDownloadTaskId(Context context, long downloadTaskId) {
        SPreferenceUtils.getInstance(context).setLong(DOWNLOAD_TASK_ID, downloadTaskId);
    }

    /**
     * 获取保存的当前下载任务id
     */
    public static long getDownloadTaskId(Context context) {
        long downloadTaskId = SPreferenceUtils.getInstance(context).getLong(DOWNLOAD_TASK_ID);
        return downloadTaskId;
    }

    /**
     * 移除保存的下载任务id
     */
    public static void removeDownloadTaskId(Context context) {
        SPreferenceUtils.getInstance(context).remove(DOWNLOAD_TASK_ID);
    }
}
