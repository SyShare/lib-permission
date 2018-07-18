package sy.com.lib_permission

import android.Manifest
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.permission.PermissionCallback
import com.permission.PermissionHelper

class MainActivity : AppCompatActivity() {


    private lateinit var permissionHelper : PermissionHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        permissionHelper = PermissionHelper(this)

        permissionHelper.request(Manifest.permission.WRITE_EXTERNAL_STORAGE,"授权SD卡权限",object : PermissionCallback(){
            override fun onGranted() {

            }

        })
    }
}
