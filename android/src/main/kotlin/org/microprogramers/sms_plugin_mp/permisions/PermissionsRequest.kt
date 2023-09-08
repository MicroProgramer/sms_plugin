package org.microprogramers.sms_plugin_mp.permisions

import android.annotation.TargetApi
import androidx.fragment.app.FragmentActivity
import android.os.Build


/**
 * Created by MicroProgramers.
 */
internal class PermissionsRequest(
    private val id: Int,
    private val permissions: Array<String>,
    private val activity: FragmentActivity
) {
    @TargetApi(Build.VERSION_CODES.M)
    fun execute() {
        activity.requestPermissions(permissions, id)
    }
}
