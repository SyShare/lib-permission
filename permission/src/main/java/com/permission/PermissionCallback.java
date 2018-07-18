package com.permission;

/**
 * 权限回调接口
 * @author SyShare
 */
public abstract class PermissionCallback {
    /**
     * 权限通过
     */
    public abstract void onGranted();

    /**
     * 权限拒绝
     */
    public void onDenied(String permission, String tips) {
    }
}
